package view.menu;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
/**
 * class for creating the GUI for the main menu
 * @author user
 *
 */

import controller.audio.AudioManager;
public class MenuGui extends JFrame {
	
/**
 * frame settings
 */
	private static Dimension d = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());

	public MenuGui(JFrame c) {
		super();
        
    	c.setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
    	c.setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        c.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        c.setResizable(true);
		c.setExtendedState(JFrame.MAXIMIZED_HORIZ);
		c.setExtendedState(JFrame.MAXIMIZED_VERT);
		c.setExtendedState(JFrame.MAXIMIZED_BOTH);
		c.setState(JFrame.NORMAL);
		c.setMaximumSize(d);
		c.setMinimumSize(d);
		c.setPreferredSize(d);
		c.setSize(d);
		c.setVisible(true);
        c.pack();
      
	}





	 
	 
	 
}




