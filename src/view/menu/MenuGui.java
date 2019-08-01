package view.menu;

import java.awt.Toolkit;

import javax.swing.*;

import view.history.HistoryGUI;
<<<<<<< HEAD

=======
>>>>>>> c36b9a9f8d1d91dee7feed1109fa00a7bfe4f2ab
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
		this.add(new MainMenu());
        this.pack();
        System.out.println(Toolkit.getDefaultToolkit().getScreenSize().height  + "|" + Toolkit.getDefaultToolkit().getScreenSize().width);
	}

	 
	 
	 
}




