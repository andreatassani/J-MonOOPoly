package view.menu;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import javax.swing.*;
/**
 * Class that builds a frame and customizes it.
 */
public class MenuGui {
/**
 * Class fields.
 */
	private static Dimension d = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
/**
 * Class Builder.
 * @param c frame to customize
 */
	public MenuGui(final JFrame frame) {
		super();       
		frame.setPreferredSize(d);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_HORIZ);
		frame.setExtendedState(JFrame.MAXIMIZED_VERT);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setSize(d);
		frame.setState(JFrame.MAXIMIZED_BOTH);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setLocationRelativeTo(frame);
		frame.pack();   
		
	}





	 
	 
	 
}




