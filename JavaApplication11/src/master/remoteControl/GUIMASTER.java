package master.remoteControl;

import java.awt.BorderLayout;
import java.awt.Point;

import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

import netPack.KeyEventRAT;
import netPack.MouseEventRAT;

/**
 * The GUI for the master program
 *
 * @author Carl
 *
 */

@SuppressWarnings("serial")
public class GUIMASTER extends JFrame implements MouseListener,MouseMotionListener,KeyListener,WindowListener {
	
	public NetWork nw;
	public ImageIcon ii;
	public JLabel jl;
	public JScrollPane p;
	
	public GUIStatus guis;	
	
	public GUIMASTER(){
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		jl = new JLabel();
		jl.setIcon(this.ii);
		p = new JScrollPane(jl);
		c.add(p,BorderLayout.CENTER);
		p.setFocusable(true);
		
		p.addMouseMotionListener(this);
		p.addKeyListener(this);
		p.addMouseListener(this);
		
		setSize(800,600);
		setTitle("R.A.T by Carl Eriksson");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
		
		guis = new GUIStatus(this);
		nw = new NetWork(this.jl,2000,this);
	}
	public static void main(String[] arg){
		new GUIMASTER();
	}
	public void resetNetwork(){
		jl.setIcon(null);
		nw.closeAllThreads();
		guis.closeThread();
		guis = null;
		guis = new GUIStatus(this);
		nw = null;
		nw = new NetWork(this.jl,2000,this);
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {

	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		System.out.println("Mouse keypressed down");
		if(nw != null){
			if(arg0.getButton() == MouseEvent.BUTTON1){
				//leftclicked
				nw.sendMouseClick((byte)1,(byte)1);
			}
			else if(arg0.getButton() == MouseEvent.BUTTON3){
				//rightclicked
				nw.sendMouseClick((byte)3,(byte)1);
			}		
		}
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		System.out.println("Mouse keypressed released");
		if(nw != null){
			if(arg0.getButton() == MouseEvent.BUTTON1){
				//leftclicked
				nw.sendMouseClick((byte)1,(byte)0);
			}
			else if(arg0.getButton() == MouseEvent.BUTTON3){
				//rightclicked
				nw.sendMouseClick((byte)3,(byte)0);
			}		
		}
		
	}
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		if(nw != null){
			//Get the viewport of the jscrollpane to see if we want to add some
			//to the coordinates
			Point tempPoint = p.getViewport().getViewPosition();
			
			setTitle("X: "+((int)tempPoint.getX()+e.getX())+" , Y: "+((int)tempPoint.getY()+e.getY()));
			nw.sendMouseMove(((int)tempPoint.getX()+e.getX()), ((int)tempPoint.getY()+e.getY()));
		}
	}
	@Override
	public void keyPressed(KeyEvent key) {
		if(nw != null){
			int keyCode = key.getKeyCode();
			nw.sendKeyEvent(keyCode, (byte)1);
		}
		else{
			JOptionPane.showMessageDialog(null,key.getKeyCode());
		}
	}
	@Override
	public void keyReleased(KeyEvent key) {
		// TODO Auto-generated method stub
		if(nw != null){
			int keyCode = key.getKeyCode();
			nw.sendKeyEvent(keyCode, (byte)0);
		}
		else{
			JOptionPane.showMessageDialog(null,key.getKeyCode());
		}
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent arg0) {
		//cs.closeAll();
	
	}
	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
