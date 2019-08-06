package view.menu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import controller.menu.ControllerMainMenu;
/**
 * 
 * class for managing the graphics of the the main menu.
 *
 */

import controller.menu.ControllerMainMenu;
	public class MainMenu extends JFrame {
/**
* MainMenu fields.
*/
		private static final long serialVersionUID = -8022354307741023282L;
		private static final int width = Toolkit.getDefaultToolkit().getScreenSize().width;
		private static final int height = Toolkit.getDefaultToolkit().getScreenSize().height;
		private  static final Dimension general = new Dimension(width,height/2);
		private static final Font f = new Font("Cooper Black", Font.CENTER_BASELINE,30);
		private static final Color backGround = new Color(173,238,216);
		private static final Color button = new Color(242,59,59);
		private static final Color writer = Color.white;
		private static final Dimension dim = new Dimension(300,40);
		private static final Dimension dimLogo = new Dimension(width/2,height/2);
		private JLabel logo;
		private JButton newGame;
		private JButton tutorial;
		private JButton settings;		
		private ImageIcon icon;
		private JPanel north;
		private JPanel south;
		private ControllerMainMenu fun = new ControllerMainMenu();

		
		
/**
 * constructor of the main menu.
 */
  public MainMenu() {
/**
 *declaration of the fields. 	  								 
 */
	  this.newGame = new JButton("New Game");
	  this.tutorial = new JButton("How To Play");
	  this.settings = new JButton("Audio");
	  this.icon = new ImageIcon("res/Logo Monopoly.png");
	  this.logo = new JLabel();
	  this.north = new JPanel();
	  this.south = new JPanel();
	  ActionListener al = (e)->{
		 fun.newGame(this);
		          
      };
/**
 * JComponent customization.	 
 */
	  setPreference(logo, dimLogo , null, backGround, null);
	  Image scaledImage = icon.getImage().getScaledInstance(width/2, height/2, Image.SCALE_DEFAULT);
	  icon.setImage(scaledImage);
	  logo.setIcon(icon);
	  setPreference(newGame, dim , button, writer, f);
	  setPreference(tutorial, dim, button, writer, f);
	  setPreference(settings, dim, button, writer, f);	
	  setPreference(north, general, backGround , backGround, f);
	  setPreference(south, general, backGround, backGround, f);
	  
	  newGame.addActionListener(al);
/**
 * set the JPanel layout.
 */
	  this.setLayout(new BorderLayout());	 	 
	  north.setLayout(new FlowLayout(FlowLayout.CENTER, height/6,250));	 
	  south.setLayout(new FlowLayout(FlowLayout.CENTER));	 		  	
/**
 * added the JPanel, buttons and background image to the panel.
 */	  		     			
	  north.add(settings);
	  north.add(newGame);
	  	
	  	north.add(tutorial);	  	
	  	south.add(logo);
	  	this.add(north, BorderLayout.CENTER);
	  	this.add(south, BorderLayout.SOUTH);
	  	
}
/**
 * method for customizing a JComponent.	  
 * @param j JComponent to customize
 * @param d JComponent size
 * @param back JComponent background color
 * @param write JComponent foreground color
 * @param f JComponent font
 * 
 */
  public void setPreference(JComponent j , Dimension d , Color back, Color write, Font f) {
	  j.setPreferredSize(d);
	  j.setSize(d);
	  j.setFont(f);
	  j.setBackground(back);
	  j.setForeground(write);
	  j.setBorder(new LineBorder(write,3));	  
  		}		
}
	
	
