package view.menu;

import java.awt.Toolkit;
import javax.swing.*;
/**
 * class for creating the GUI for the main menu
 * @author user
 *
 */
public class MenuGui extends JFrame {
/**
 * frame settings
 */
	
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
		c.setVisible(true);
		c.setUndecorated(true);
        c.pack();
      
	}

	 
	 
	 
}




