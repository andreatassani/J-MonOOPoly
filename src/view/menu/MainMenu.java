package view.menu;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;

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
		private Image img;
		private JLabel logo;
		private JButton newGame;
		private JButton tutorial;
		private JButton settings;
		private Dimension dim;
		private ImageIcon icon;
		private static final int WIDTH = 300;
		private static final int HEIGHT = 40;
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

	  this.img = Toolkit.getDefaultToolkit().createImage("res/sfondo219.png");
	  logo.setIcon(icon);
	  
	  

	  tutorial.setBackground(Color.BLUE);
	  settings.setBackground(Color.BLUE);
	 
	
/**
 * set the layout.
 */
	  this.setLayout(new FlowLayout(FlowLayout.CENTER, 100,(Toolkit.getDefaultToolkit().getScreenSize().height/7)));
	  Image scaledImage = icon.getImage().getScaledInstance(dim.width,dim.height, Image.SCALE_DEFAULT);
	  icon.setImage(scaledImage);
	  
	  
	 
/**
 * imposed the measures of buttons.
 */
	  	newGame.setPreferredSize(dim);
	  	tutorial.setPreferredSize(dim);
	  	settings.setPreferredSize(dim);
	  	logo.setPreferredSize(new Dimension(500,500));
	  	newGame.setIcon(icon);
/**
 * added the buttons and background image to the panel.
 */
	  	
	  	loadImage(img);	    
			
		this.add(newGame);
	  	this.add(settings);
	  	this.add(tutorial);	
	  	this.add(logo);
	  	
}
/**
 * 
 * @param img
 * load the image into the panel.
 */
	private void loadImage(Image img) {
		try {
			MediaTracker track = new MediaTracker(this);
			track.addImage(img, 0);
			track.waitForID(0);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
/**
 * draw the background image continuously
 * to make sure it doesn't disappear.
 * 	
 */
	protected void paintComponent(Graphics g) {
		setOpaque(false);
		g.drawImage(img,0,0, null);
		super.paintComponent(g);
	}
	

}
