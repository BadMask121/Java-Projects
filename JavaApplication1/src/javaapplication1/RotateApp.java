package project;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.util.Random;
import javax.swing.*;

public class RotateApp {

    private static final int N = 3;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.setLayout(new GridLayout(N, N, N, N));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new RotatePanel());
            frame.pack();
            frame.setVisible(true);
            System.out.println();
        });
    }
}

class RotatePanel extends JPanel implements ActionListener {

    private static final int SIZE = 256;
    private static final double DELTA_THETA = Math.PI / 90;
    private final Timer timer = new Timer(25, this);
    private Image image = RotatableImage.getImage(SIZE);
    private double dt = DELTA_THETA;
    private double theta;

    public RotatePanel() {
        this.setBackground(Color.lightGray);
        this.setPreferredSize(new Dimension(SIZE, SIZE));
        this.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                dt = -dt;
                image = RotatableImage.getImage(SIZE);
            }
        });
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.rotate(theta,128,128);
        g2d.drawImage(image, 0, 0, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        theta += dt;
        repaint();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(SIZE, SIZE);
    }

}

class RotatableImage {

    private static final Random r = new Random();

    static public Image getImage(int size) {
        BufferedImage bi = new BufferedImage(
                size, size, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = bi.createGraphics();
        g2d.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        final Color c1 = Color.getHSBColor(r.nextFloat(), 1, 1);
        final Color c2 = Color.getHSBColor(r.nextFloat(), 1, 1);
        g2d.setPaint(c1);
        g2d.setStroke(new BasicStroke(10.0f));
        g2d.draw(new Line2D.Double(0, size/2, size, size/2));

        g2d.setPaint(c2);
        g2d.draw(new Line2D.Double(size/2, 0, size/2, size));

        g2d.setPaint(c1);
        g2d.draw(new Ellipse2D.Double(0, 0, size, size));
        g2d.dispose();
        return bi;
    }
}