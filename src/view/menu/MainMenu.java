package view.menu;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import controller.actionListeners.Audio;

import controller.actionListeners.HowToPlayButton;
import controller.actionListeners.NewGame;
import controller.actionListeners.TutorialButton;
import controller.audio.AudioManager;
import model.customComponent.CustomMethodsImpl;

/**
 * 
 * Class for managing the graphics of the the main menu.
 *
 */
	public class MainMenu extends JFrame {
/**
* MainMenu fields.
*/
		private static final long serialVersionUID = -1L;
		private JLabel logo;
		private JButton newGame;
		private JButton tutorial;
		private static JButton settings;		
		private ImageIcon icon;
		private JPanel north;
		private JPanel south;		
		private AudioManager clipAudio;	
		private Dimension general;	
		private Dimension dim;
		private Dimension dimLogo;
		private CustomMethodsImpl methods = new CustomMethodsImpl();
/**
 * Constructor of the main menu.
 */
  public MainMenu() {
/**
 *Declaration of the fields. 	  								 
 */
	  
	  this.general = new Dimension(methods.getWidth(),methods.getHeight()/2);
	  this.dim  = new Dimension(methods.getWidth()/6,methods.getHeight()/20);
	  this.dimLogo = new Dimension(methods.getWidth()/2,methods.getHeight()/2);	  
	  this.clipAudio = new AudioManager();
	  this.newGame = new JButton("New Game");
	  this.tutorial = new JButton("Tutorial");
	  this.settings = new JButton("Audio Off");
	  this.icon = new ImageIcon("res/menuIcon/Logo Monopoly.png");
	  this.logo = new JLabel();
	  this.north = new JPanel();
	  this.south = new JPanel();	  

/**
 * JComponent customization.	 
 */
	  methods.setPreference(logo, dimLogo , methods.getBackground(), methods.getBackground(), methods.getFont());
	  Image scaledImage = icon.getImage().getScaledInstance(methods.getWidth()/2, methods.getHeight()/2, Image.SCALE_DEFAULT);
	  icon.setImage(scaledImage);
	  logo.setIcon(icon);
	  methods.setPreference(newGame, dim , methods.getButton(), methods.getWriter(),  methods.getFont());
	  methods.setPreference(tutorial, dim,  methods.getButton(), methods.getWriter(), methods.getFont());
	  methods.setPreference(settings, dim,  methods.getButton(), methods.getWriter(), methods.getFont());	
	  methods.setPreference(north, general, methods.getBackground() , methods.getBackground(), methods.getFont());
	  methods.setPreference(south, general, methods.getBackground(), methods.getBackground(), methods.getFont());
/**
 * I add the action listener to the buttons.	  
 */
	  newGame.addActionListener(new NewGame( clipAudio,this));
	  tutorial.addActionListener(new TutorialButton(clipAudio, this));
	  settings.addActionListener(new Audio(clipAudio, settings));	  
/**
 * Set the JPanel layout.
 */
	  this.setLayout(new BorderLayout());	 	 
	  north.setLayout(new FlowLayout(FlowLayout.CENTER, methods.getHeight()/6,250));	 
	  south.setLayout(new FlowLayout(FlowLayout.CENTER));	 		  	
/**
 * Added the JPanel, buttons and background image to the panel.
 */	  	
	  
	  north.add(settings);
	  north.add(newGame);	  	
	  north.add(tutorial);
	  south.add(logo);
	  this.add(north, BorderLayout.CENTER);
	  this.add(south, BorderLayout.SOUTH);	
/**
 * Menu audio track plays in loop.
 */
	  
	  clipAudio.getMusicMenu().loop(); 
	  
}

 /**
  * Allows other frames to know if the audio is to be
  * activated or not.
  * @return a string describing the audio situation
  */
  public static String getTextButton () {
	  return settings.getText();
  }
  

}
	
	
