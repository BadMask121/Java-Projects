/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratice;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author User
 */
public class DrawOval extends JPanel{
    private int d  = 20;
   private final int circlex = 10;
   private final int circley = 10;
   
    @Override
   public void paintComponent(Graphics g){
       super.paintComponent(g);
       g.fillOval(circlex,circley,d,d);
   
   }
    public void setD(int newD){
    d=(newD >= 0 ? newD :10);
    repaint();
    }
    
    @Override
    public Dimension getPreferredSize(){
    return new Dimension(200,200);
    }
    public Dimension getMinimiumSize(){
    return getPreferredSize();
    }
}
