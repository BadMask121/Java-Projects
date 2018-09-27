package javaapplication1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;

import javax.security.auth.callback.PasswordCallback;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.RootPaneContainer;
import javax.swing.SpringLayout;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JTextPane;




public class MusicOnWeb extends JFrame implements ActionListener {
	javax.swing.JFrame MainFrame;
	JMenuBar greenMenuBar;
	javax.swing.JToolBar toolbar;
	private JPanel optionMenuePanel;
	 private JMenuBar menubar1,menubar;
	   JLabel Homepage;
	 ImageIcon HomepageIcon = new ImageIcon("C:\\Users\\user\\Desktop\\project work\\Home.png");
	public void MusicOn()
	{
	 ImageIcon exitIcon = new ImageIcon("C:\\Users\\user\\Desktop\\project work\\exit.png");
		
		MainFrame = new JFrame("");
		MainFrame.setVisible(true);
		MainFrame.setSize(new Dimension(1381, 740));
		MainFrame.setLocation(-9,0);
		MainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		MainFrame.setMinimumSize(new Dimension(900, 500));
		
		Font f = new Font("Candara",9,12);
		
		greenMenuBar = new JMenuBar();
        greenMenuBar.setOpaque(true);
        greenMenuBar.setPreferredSize(new Dimension(200, 20));
        greenMenuBar.setFont(f); 
        greenMenuBar.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

        
       
      
		JMenu m = new JMenu("File");
		m.setMnemonic(KeyEvent.VK_F);
		JMenu m1 = new JMenu("Edit");
		JMenu m2 = new JMenu("Format");
		JMenu m3 = new JMenu("Help");
	
	
		m.setFont(f);
		m1.setFont(f);
		m2.setFont(f);
		m3.setFont(f);
		
		Color c = new Color(239, 198, 240);
		
		JMenuItem NewItem = new JMenuItem("New ");
		NewItem.setToolTipText("New File");
		NewItem.setMnemonic(KeyEvent.VK_E);
		NewItem.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(c),BorderFactory.createEmptyBorder(2,2,2,2)));
		JMenuItem mI1 = new JMenuItem("Open File");
		mI1.setToolTipText("Open File");
		mI1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(c),BorderFactory.createEmptyBorder(5,5,5,5)));
		JMenuItem mI2 = new JMenuItem("Save");
		mI2.setToolTipText("Save File");
		mI2.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(c),BorderFactory.createEmptyBorder(5,5,5,5)));
		JMenuItem mI3 = new JMenuItem("Import");
		mI3.setToolTipText("Import Local File");
		mI3.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(c),BorderFactory.createEmptyBorder(5,5,5,5)));
		JMenuItem mI4 = new JMenuItem("Export");
		mI4.setToolTipText("Export Local File");
		mI3.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(c),BorderFactory.createEmptyBorder(5,5,5,5)));
		JMenuItem mI5 = new JMenuItem(exitIcon);
		mI5.setToolTipText("Exit Application");
		mI5.setBorder(BorderFactory.createTitledBorder("Exit"));
		mI5.setAccelerator(KeyStroke.getKeyStroke(
				KeyEvent.VK_W, ActionEvent.CTRL_MASK));
				mI5.getAccessibleContext().setAccessibleDescription(
				"This doesn't really do anything");
		
		
		
		mI5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ImageIcon icon = new ImageIcon("C:\\Users\\user\\Desktop\\Icons\\warning.png");
				mI5.getAccelerator();
					int n =JOptionPane.showConfirmDialog(MainFrame, "Do you want to close windows","END PROGRAM",JOptionPane.INFORMATION_MESSAGE,JOptionPane.YES_NO_OPTION,icon);
					if (n == JOptionPane.YES_OPTION){
					MainFrame.dispose();
					}
					
					if(n == JOptionPane.NO_OPTION){
					// Do nothing
					}
					
				
			}
		});
		
		mI4.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEtchedBorder(c, c),BorderFactory.createEmptyBorder(5,5,5,5)));

		
		JMenuItem EditItem = new JMenuItem("Undo");
		EditItem.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(c),BorderFactory.createEmptyBorder(5,5,5,5)));
		JMenuItem EditItem1 = new JMenuItem("Redo");
		EditItem1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(c),BorderFactory.createEmptyBorder(5,5,5,5)));
		JMenuItem EditItem2 = new JMenuItem("Copy");
		EditItem2.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(c),BorderFactory.createEmptyBorder(5,5,5,5)));
		JMenuItem EditItem3 = new JMenuItem("Paste");
		EditItem3.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(c),BorderFactory.createEmptyBorder(5,5,5,5)));
		JMenuItem EditItem4 = new JMenuItem("Cut");
		EditItem4.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(c),BorderFactory.createEmptyBorder(5,5,5,5)));
		
		JMenuItem mformat1 = new JMenuItem("Full Screen",KeyEvent.VK_T);
		 

mformat1.setAccelerator(KeyStroke.getKeyStroke(
KeyEvent.VK_1, ActionEvent.ALT_MASK));
mformat1.getAccessibleContext().setAccessibleDescription(
"This doesn't really do anything");
		
		
		
		
		Dimension d = new Dimension(700, 1000);
		
		mformat1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(mformat1 == e.getSource()){
	             MainFrame.setLocation(new Point(-7, 0));
	             MainFrame.setSize(1377,739);

				}
				
				
			}
		});
		JMenuItem mformat2= new JMenuItem("Font...");
	    mformat2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			
				
			}
		});
	    
	    
	    
	    
		m1.add(EditItem);
		m1.add(EditItem1);
		m1.add(EditItem2);
		m1.add(EditItem3);
		m1.add(EditItem4);
	
		
		
		m2.add(mformat1);
		
		
		m2.add(mformat2);
		
		m.add(NewItem);
		m.add(mI1);
		m.add(mI2);
		m.add(mI3);
		m.add(mI4);
		m.add(mI5);
		

		  MouseListener ml = new MouseListener(){
			    public void mouseClicked(MouseEvent e) {
			    	((JMenu)e.getSource()).doClick();
			    }
			    public void mousePressed(MouseEvent e) {}
			    public void mouseReleased(MouseEvent e) {}
			    public void mouseExited(MouseEvent e) {}
			    public void mouseEntered(MouseEvent e) {
			    //	((JMenu)e.getSource()).doClick();
			    	   
			    }
			  };
		
		
		
		greenMenuBar.add(m);
		greenMenuBar.add(m1);
		greenMenuBar.add(m2);
		greenMenuBar.add(m3);
		greenMenuBar.setVisible(true);
		greenMenuBar.setBackground(c);
		

		m.addMouseListener(ml);
		m1.addMouseListener(ml);
		m2.addMouseListener(ml);
		m3.addMouseListener(ml);
		
		
     ImageIcon backpic = new ImageIcon("C:\\Users\\user\\Desktop\\project work\\HomePageBack.jpg");

    	JLabel background=new JLabel(backpic);
    	background.setVisible(true);
    	background.setLayout(new GridBagLayout());
    	background.setBorder(BorderFactory.createEmptyBorder());
    	
    	
    	try {
       MainFrame.setJMenuBar(greenMenuBar);
		MainFrame.add(background);
		 MainFrame.add(Jcategory(null), BorderLayout.NORTH);
		 MainFrame.add(menubar2(null),BorderLayout.NORTH);
		 
		 }catch(Exception e){
			
			 e.printStackTrace();
			 JOptionPane.showMessageDialog(MainFrame,"A Runtime Error Occuried Contact Your operator"+"\n +233245006006",e.getMessage(),JOptionPane.ERROR_MESSAGE);
			 System.exit(EXIT_ON_CLOSE);
		 }
    	
	}
	
	
	public Component Jcategory(Container k)
	{
          
		
		Font f = new Font("Cambria",Font.BOLD,14);

         optionMenuePanel = new JPanel();
       optionMenuePanel.setOpaque(true);
       optionMenuePanel.setVisible(true);
       optionMenuePanel.setBackground(new Color(229, 229, 229));
      
       
       Color MenuColor = new Color(119,112,112);
	   
      
        menubar = new JMenuBar();
       menubar.setLayout(new FlowLayout());
       menubar.setVisible(true);
       menubar.setBorder(BorderFactory.createEmptyBorder());
       menubar.setBackground(Color.white);
    
       
     
       JButton Classic = new JButton("Classic");
       Classic.setBorderPainted(true);
       Classic.setBorder(BorderFactory.createEmptyBorder());
       Classic.setBackground(Color.WHITE);
       
       
       JButton Reggee = new JButton("Reggee/Dancehall");
       Reggee.setBorder(BorderFactory.createEmptyBorder());
       Reggee.setBackground(Color.WHITE);
       
       JButton HipHop = new JButton("Hip Hop/Rap");
       HipHop.setBorder(BorderFactory.createEmptyBorder());
       HipHop.setBackground(Color.WHITE);
       
       JButton Gospel = new JButton("Gospel");
       Gospel.setBorder(BorderFactory.createEmptyBorder());
       Gospel.setBackground(Color.WHITE);
       
       JButton AfroMusic = new JButton("Afro Music");
       AfroMusic.setBorder(BorderFactory.createEmptyBorder());
       AfroMusic.setBackground(Color.WHITE);
       
       JButton saxo = new JButton("Saxo/jazz");
       saxo.setBorder(BorderFactory.createEmptyBorder());
       saxo.setBackground(Color.WHITE);
       
       Classic.setFont(f);
       Reggee.setFont(f);
       HipHop.setFont(f);
       Gospel.setFont(f);
       AfroMusic.setFont(f);
       saxo.setFont(f);
       
      Classic.setForeground(MenuColor);
      Reggee.setForeground(MenuColor);
      HipHop.setForeground(MenuColor);
      Gospel.setForeground(MenuColor);
      AfroMusic.setForeground(MenuColor);
      saxo.setForeground(MenuColor);
      
      Classic.setToolTipText("Classics");
      Reggee.setToolTipText("Reggee/Dancehall");
      HipHop.setToolTipText("HipHop/Rap");
      Gospel.setToolTipText("Gospel");
      AfroMusic.setToolTipText("Afro Music");
      saxo.setToolTipText("saxo/Jazz");
      
      
      
      menubar.add(Box.createRigidArea(new Dimension(50,0)));
  	menubar.add(Classic);
  	 menubar.add(Box.createRigidArea(new Dimension(5,0)));
     menubar.add(Reggee);
       menubar.add(Box.createRigidArea(new Dimension(5,0)));
       menubar.add(HipHop);
       menubar.add(Box.createRigidArea(new Dimension(5,0)));
       menubar.add(Gospel);
       menubar.add(Box.createRigidArea(new Dimension(5,0)));
       menubar.add(AfroMusic);
       menubar.add(Box.createRigidArea(new Dimension(5,0)));
       menubar.add(saxo);
       
      
    return optionMenuePanel.add(menubar);
	}
	
	
	public Component menubar2(Container h)
	{

		 menubar1 = new JMenuBar();
	       menubar1.setLayout(new BorderLayout());
	       menubar1.setVisible(true);
	       menubar1.setBackground(Color.WHITE);
	       
	       
	       JButton HomeIcon = new JButton(HomepageIcon);
	       HomeIcon.setOpaque(true);
	       HomeIcon.setVisible(true);
	       HomeIcon.setBorder(BorderFactory.createEmptyBorder());
	       HomeIcon.setBackground(Color.WHITE);
	       HomeIcon.setToolTipText("Home");
	       
	       HomeIcon.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
				new HomePageFrame();
				
				
			   HomeIcon.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {}
				
				@Override
				public void mousePressed(MouseEvent e) {}
				
				@Override
				public void mouseExited(MouseEvent e) {
					HomeIcon.setBackground(Color.WHITE);
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					HomeIcon.setBackground(Color.BLUE);	
				}
			});
				
			}
		});
	       
	       
	       Font f4 = new Font("Comic Sans MS",Font.BOLD,10);
	       
	      JLabel dateField= new JLabel();
	  	 dateField.setVisible(true);
	  	 dateField.setFocusable(false);
	  	 dateField.setFont(f4);
	  	 dateField.setBackground(Color.WHITE);
	  	 
	  	   javax.swing.Timer t = new javax.swing.Timer(1000, new ActionListener() {
	  		public void actionPerformed(ActionEvent e) {


	  		       Calendar now = Calendar.getInstance();
	  		       int month = now.get(Calendar.MONTH);
	  		       int day = now.get(Calendar.DAY_OF_MONTH);
	  		       int year = now.get(Calendar.YEAR);
	  		       
	  		       int Hour = now.get(Calendar.HOUR_OF_DAY);
	  		       int Minute = now.get(Calendar.MINUTE);
	  		       int Seconds = now.get(Calendar.SECOND);
	  		      // int MiliSeconds = now.get(Calendar.MILLISECOND);
	  		       Date n = now.getTime();
	  		       dateField.setText(" "+now.getTime());
	  		     
	  		}
	  	});
	  	   t.setInitialDelay(1);
	  	   t.start();
			
	  	  
	       
	       
	       
	       menubar1.add(HomeIcon,BorderLayout.WEST);
	       menubar1.add(dateField,BorderLayout.EAST);
	       menubar1.add(menubar);
	       
	       return optionMenuePanel.add(menubar1);
	}
	
    
	public void actionPerformed(ActionEvent e) {
		
		MainFrame.dispose();
		
	}}