package view.play;


import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/*
 * class for the main frame
 */
public class MonopolyFrame extends JFrame {
	
	/*
	 * constructor for the class
	 */
	public MonopolyFrame() {
		super();

    	this.setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
    	this.setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(true);
		this.setExtendedState(JFrame.MAXIMIZED_HORIZ);
		this.setExtendedState(JFrame.MAXIMIZED_VERT);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setVisible(true);
		this.add(new Playing());
        this.pack();
	}
}
