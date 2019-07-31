package view.menu;
import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.*;

import view.history.HistoryGUI;
/**
 * class for creating the GUI for the main menu
 * @author user
 *
 */
public class MenuGui extends JFrame {
/**
 * frame settings
 */
	public MenuGui() {
		super();

    	this.setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
    	this.setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(true);
		this.setExtendedState(JFrame.MAXIMIZED_HORIZ);
		this.setExtendedState(JFrame.MAXIMIZED_VERT);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setVisible(true);
		this.add(new NewGameMenu());
        this.pack();
	}

	 
	 
	 
}




