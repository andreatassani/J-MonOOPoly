package view.menu;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;



/**
 * 
 * class for the main menu.
 *
 */
	public class MainMenu extends JPanel{
/**
* MainMenu fields.
*/
		
		private JLabel logo;
		private JButton newGame;
		private JButton tutorial;
		private JButton settings;
		private Dimension dim;
		private ImageIcon icon;
		private JPanel north;
		private JPanel south;
		private static final int WIDTH = 300;
		private static final int HEIGHT = 40;
		private Dimension general;
/**
 * constructor of the main menu.
 */
  public MainMenu() {
	  
	 
	  this.dim = new Dimension(WIDTH,HEIGHT);
	  this.newGame = new JButton("New Game");
	  this.tutorial = new JButton("Tutorial");
	  this.settings = new JButton("Settings");
	  this.icon = new ImageIcon("res/logo.png");
	  this.logo = new JLabel();
	  this.north = new JPanel();
	  this.south = new JPanel();
	  this.general = new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height/2);

	
	  logo.setIcon(icon);
	  
	  
	  newGame.setBackground(Color.BLUE);
	  tutorial.setBackground(Color.BLUE);
	  settings.setBackground(Color.BLUE);
	  south.setBackground(Color.RED);
	  north.setBackground(Color.red);
	 
	
/**
 * set the layout.
 */
	  this.setLayout(new BorderLayout());
	  Image scaledImage = icon.getImage().getScaledInstance(Toolkit.getDefaultToolkit().getScreenSize().width/4,Toolkit.getDefaultToolkit().getScreenSize().height/4, Image.SCALE_DEFAULT);
	  icon.setImage(scaledImage);
	  north.setLayout(new FlowLayout(FlowLayout.CENTER, Toolkit.getDefaultToolkit().getScreenSize().height/6,250));
	  south.setLayout(new FlowLayout(FlowLayout.CENTER));
	  
	  
	 
/**
 * imposed the measures of buttons.
 */
	  	newGame.setPreferredSize(dim);
	  	tutorial.setPreferredSize(dim);
	  	settings.setPreferredSize(dim);
	  	logo.setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width/4,Toolkit.getDefaultToolkit().getScreenSize().height/4));
	  	
	  	north.setPreferredSize(general);
	  	south.setPreferredSize(general);
/**
 * added the buttons and background image to the panel.
 */
	  	
	     
			
		north.add(newGame);
	  	north.add(settings);
	  	north.add(tutorial);
	  	
	  	south.add(logo);
	  	this.add(north, BorderLayout.CENTER);
	  	this.add(south, BorderLayout.SOUTH);
	  	
}

	

}
