


import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorFadingAnimation extends JPanel {
  private final Rectangle2D rect = new Rectangle2D.Float(10f, 10f, 100f, 20f);

  private float alpha_rectangle = 1f;

  public ColorFadingAnimation() {
      
    new RectRunnable();
  }

  public void paint(Graphics g) {
    super.paint(g);
    Graphics2D g2d = (Graphics2D) g;
    g2d.setColor(new Color(Integer.decode("#EE0000")));
    RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
    g2d.setRenderingHints(rh);
    g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha_rectangle));
    g2d.fill(rect);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Color fading aniamtion");
    frame.add(new ColorFadingAnimation());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(250, 150);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }

  class RectRunnable implements Runnable {
    private final Thread runner;

    public RectRunnable() {
      runner = new Thread(this);
      runner.start();
    }

    public void run() {
      while (alpha_rectangle >= 0) {
        repaint();
        alpha_rectangle += -0.01f;

        if (alpha_rectangle < 0) {
          alpha_rectangle = 0;
        }
        try {
          Thread.sleep(20);
        } catch (Exception e) {
        }
      }
    }
  }
}