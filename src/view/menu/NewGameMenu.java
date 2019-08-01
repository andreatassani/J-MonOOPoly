package view.menu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 * 
 * class for the new game menu.
 *
 */
public class NewGameMenu extends JPanel {
/**
 * New Game menu fields.
 */
	private JButton players;
	private JButton music;
	private JButton currency;
	private JButton start;
	private final Dimension dim;
	private static final int WIDTH = 300;
	private static final int HEIGHT = 50;
/**
 * constructor of the New game menu.
 */
	public NewGameMenu() {
	
		this.dim = new Dimension(WIDTH,HEIGHT);
		this.players = new JButton("Players");
		this.music = new JButton("Music");
		this.currency = new JButton("Currency");
		this.start = new JButton("Start Game");
/**
 * imposed the measures of the buttons.	
 */
		setSize(players);
		setSize(music);
		setSize(currency);
		setSize(start);
/**
 *set the layout.
 */
		this.setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
		this.setBackground(Color.CYAN);
/**
 *i create invisible areas to have space between the buttons
 *and i added the buttons to the panel.
 */
		this.add(Box.createRigidArea(new Dimension(Toolkit.getDefaultToolkit().getScreenSize().height/3,Toolkit.getDefaultToolkit().getScreenSize().height/3)));
		this.add(players);
		this.add(Box.createRigidArea(new Dimension(Toolkit.getDefaultToolkit().getScreenSize().height/2,HEIGHT)));
		this.add(music);
		this.add(Box.createRigidArea(new Dimension(Toolkit.getDefaultToolkit().getScreenSize().height/2,HEIGHT)));
		this.add(currency);
		this.add(Box.createRigidArea(new Dimension(Toolkit.getDefaultToolkit().getScreenSize().height/2,HEIGHT)));
		this.add(start);

	}
/**
 * 
 * @param c generic Swing component
 * set component size.
 * 
 */
	public void setSize(final JComponent c) {
		c.setMaximumSize(dim);
		c.setMinimumSize(dim);
	}
	

}
