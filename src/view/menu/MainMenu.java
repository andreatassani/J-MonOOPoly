package view.menu;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import controller.actionListeners.Audio;
import controller.actionListeners.HowToPlay;
import controller.actionListeners.NewGame;
import controller.audio.AudioManager;

/**
 * 
 * Class for managing the graphics of the the main menu.
 *
 */
	public class MainMenu extends JFrame {
/**
* MainMenu fields.
*/
		private static final long serialVersionUID = -8022354307741023282L;
		private static Dimension d = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
		private static final int width = Toolkit.getDefaultToolkit().getScreenSize().width;
		private static final int height = Toolkit.getDefaultToolkit().getScreenSize().height;
		private  static final Dimension general = new Dimension(width,height/2);	
		private static final Dimension dim = new Dimension(width/6,height/20);
		private static final Dimension dimLogo = new Dimension(width/2,height/2);
		private JLabel logo;
		private JButton newGame;
		private JButton tutorial;
		private static JButton settings;		
		private ImageIcon icon;
		private JPanel north;
		private JPanel south;		
		private  static AudioManager clipAudio;	
		private CustomMethodsImpl methods;
/**
 * constructor of the main menu.
 */
  public MainMenu() {
/**
 *declaration of the fields. 	  								 
 */
	 
	  this.methods = new CustomMethodsImpl();
	  this.clipAudio = new AudioManager();
	  this.newGame = new JButton("New Game");
	  this.tutorial = new JButton("How To Play");
	  this.settings = new JButton("Audio Off");
	  this.icon = new ImageIcon("res/Logo Monopoly.png");
	  this.logo = new JLabel();
	  this.north = new JPanel();
	  this.south = new JPanel();	  

/**
 * JComponent customization.	 
 */
	  methods.setPreference(logo, dimLogo , methods.getBackground(), methods.getBackground(), methods.getFont());
	  Image scaledImage = icon.getImage().getScaledInstance(width/2, height/2, Image.SCALE_DEFAULT);
	  icon.setImage(scaledImage);
	  logo.setIcon(icon);
	  methods.setPreference(newGame, dim , methods.getButton(), methods.getWriter(),  methods.getFont());
	  methods.setPreference(tutorial, dim,  methods.getButton(), methods.getWriter(), methods.getFont());
	  methods.setPreference(settings, dim,  methods.getButton(), methods.getWriter(), methods.getFont());	
	  methods.setPreference(north, general, methods.getBackground() , methods.getBackground(), methods.getFont());
	  methods.setPreference(south, general, methods.getBackground(), methods.getBackground(), methods.getFont());
/**
 * i add the action listener to the buttons.	  
 */
	  newGame.addActionListener(new NewGame( clipAudio,this));
	  tutorial.addActionListener(new HowToPlay(clipAudio, this));
	  settings.addActionListener(new Audio(clipAudio, settings));	  
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
	  JComponent.setDefaultLocale(java.util.Locale.ITALIAN);
	  JFileChooser chooser = new JFileChooser();
	  chooser.setLocale(Locale.getDefault());
	  chooser.updateUI();
	  south.add(logo);
	  this.add(north, BorderLayout.CENTER);
	  this.add(south, BorderLayout.SOUTH);	
/**
 * menu audio track plays in loop.
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
	
	
