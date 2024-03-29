package slave.remoteControl;

import java.awt.event.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;

public class GUISLAVE extends JFrame implements ActionListener,WindowListener{
	
	private static final long serialVersionUID = -4519823190906100723L;
	private JLabel info;
	private JButton quit;
	private JPanel center,south;
	private String IP;
	private String NAME;
	
	private RemoteHandler rh;

	public GUISLAVE(String host,int port){
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		try{
			InetAddress ia = InetAddress.getLocalHost();
			IP = ia.getHostAddress();
			NAME = ia.getHostName();
		}
		catch(Exception e){
			e.printStackTrace();
		} 
		
		info = new JLabel("Lan info: "+NAME+" ("+IP+")");
		quit = new JButton("Exit");
		center = new JPanel();
		south = new JPanel();
		
		center.add(info);
		south.add(quit);
		
		c.add(center,BorderLayout.CENTER);
		c.add(south,BorderLayout.SOUTH);
		
		quit.addActionListener(this);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("R.A.T by Carl Eriksson");
		setSize(300,100);
		
		//String host = JOptionPane.showInputDialog(null,"Host:");
				
		rh = new RemoteHandler(host,port);
		rh.initializeThreads();
		rh.startThreads();
	}
	
	public static void main(String[] args) {
		if(args.length > 0){
			new GUISLAVE(args[0],Integer.parseInt(args[1]));
		}
		else{
			new GUISLAVE(JOptionPane.showInputDialog(null,"Host:"),2000);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == quit){
			rh.stopThreads();
			System.exit(0);
		}
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		//nw.closeAll();	
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
