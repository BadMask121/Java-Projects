package project;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.RootPaneContainer;

public class HomePageFrame extends MusicOnWeb {
	
	JFrame HomeFrame;
	JPanel HomePanel;
	void HomePageFrame()
	{
		HomeFrame = new JFrame();
		
		HomeFrame.setVisible(true);
		HomeFrame.setContentPane(getContentPane());
		HomeFrame.setBackground(Color.BLACK);
		
		HomePanel = new JPanel();
		

		HomePanel.setVisible(true);
		HomePanel.setBackground(Color.BLACK);
		
		
		
		HomeFrame.add(HomePanel);
		
	}
	
	
	
}
