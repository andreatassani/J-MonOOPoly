package view.menu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * 
 * class for the main menu.
 *
 */
	public class MainMenu extends JPanel{
/**
* MainMenu fields.
*/
		private JButton newGame;
		private JButton tutorial;
		private JButton settings;
		private Dimension dim;
		private static final int WIDTH = 300;
		private static final int HEIGHT = 50;
/**
 * constructor of the main menu.
 */
  public MainMenu() {

	  this.dim = new Dimension(WIDTH,HEIGHT);
	  this.newGame = new JButton("New Game");
	  this.tutorial = new JButton("Tutorial");
	  this.settings = new JButton("Settings");
	  newGame.setBackground(new Color(14,141,195));
	  tutorial.setBackground(new Color(14,141,195));
	  settings.setBackground(new Color(14,141,195));
/**
 * set the layout.
 */
	  this.setLayout(new FlowLayout(FlowLayout.CENTER, 100,(Toolkit.getDefaultToolkit().getScreenSize().height/3)));
/**
 * imposed the measures of buttons.
 */
	  	newGame.setPreferredSize(dim);
	  	tutorial.setPreferredSize(dim);
	  	settings.setPreferredSize(dim);
/**
 * added the buttons to the panel.
 */
	  	this.add(newGame);
	  	this.add(settings);
	  	this.add(tutorial);

}
}
