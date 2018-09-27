/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratice;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
/**
 *
 * @author User
 */
public class frame extends JFrame {
    private JSlider slider;
    private DrawOval panel;
    
    public frame(){
        super("DrawOval");
        panel= new DrawOval();
        panel.setBackground(new Color(104,104,104));
        slider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
    slider.setMajorTickSpacing(10);
    slider.setPaintTicks(true);
    
    slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
panel.setD(slider.getValue());
            }
        });
    
    add(slider,BorderLayout.SOUTH);
    add(panel,BorderLayout.CENTER);
    }
}
