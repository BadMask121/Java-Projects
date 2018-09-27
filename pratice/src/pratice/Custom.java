/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratice;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;
/**
 *
 * @author User
 */
public class Custom extends JPanel
{
public Custom(){
setBackground(new Color(0, 255, 0, 0));
    
}
int progress = 0;
    public void UpdateProgress (int progress_value){
    progress = progress_value;
    }
    
@Override
public void paint(Graphics g){
super.paint(g);
Graphics2D g2 = (Graphics2D)g;
g2.translate(this.getWidth()/2, this.getHeight()/2);
g2.rotate(Math.toRadians(270));
g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
 g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.8f));
 
Arc2D.Float arc = new Arc2D.Float(Arc2D.PIE );
    Ellipse2D circle = new Ellipse2D.Float(0,0,110,110);
arc.setFrameFromCenter(new Point(0,0), new Point(120,120));
circle.setFrameFromCenter(new Point(0,0), new Point(110,110));

arc.setAngleStart(1);
arc.setAngleExtent(-progress*3.6);
g2.setColor(new Color(20, 7, 21));
g2.draw(arc);
g2.fill(arc);
g2.setColor(new Color(241, 223, 212));
g2.draw(circle);
g2.fill(circle);
g2.setColor(new Color(20, 7, 21));
g2.rotate(Math.toRadians(90));
g2.setFont(new Font("Candara",Font.BOLD,50));
FontMetrics gm = g2.getFontMetrics();
Rectangle2D r = gm.getStringBounds(progress+"%", g);
int x=(0-(int)r.getWidth())/2;
int y=(0-(int)r.getHeight())/2 + gm.getAscent();
g2.drawString(progress+"%",x,y);

}    
}
