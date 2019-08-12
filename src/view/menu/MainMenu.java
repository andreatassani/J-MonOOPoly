package view.menu;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.sql.Time;
import java.util.*;
import java.util.Timer;

import javax.swing.*;
import javax.swing.border.LineBorder;


import controller.audio.AudioManager;
import controller.audio.AudioSetting;
import controller.audio.AudioSettingImpl;





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
		private static Dimension d = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
		private static final int width = Toolkit.getDefaultToolkit().getScreenSize().width;
		private static final int height = Toolkit.getDefaultToolkit().getScreenSize().height;
		private  static final Dimension general = new Dimension(width,height/2);
		private static final Font f = new Font("Cooper Black", Font.CENTER_BASELINE,30);
		private static final Color backGround = new Color(173,238,216);
		private static final Color button = new Color(242,59,59);
		private static final Color writer = Color.white;
		private static final Dimension dim = new Dimension(width/6,height/20);
		private static final Dimension dimLogo = new Dimension(width/2,height/2);
		private JLabel logo;
		private JButton newGame;
		private JButton tutorial;
		private static JButton settings;		
		private ImageIcon icon;
		private JPanel north;
		private JPanel south;
		private ControllerMainMenu action;	
		private static AudioManager clip;
		
		

		
/**
 * constructor of the main menu.
 */
  public MainMenu() {
/**
 *declaration of the fields. 	  								 
 */

	  this.clip = new AudioManager();
	  this.action = new ControllerMainMenu();
	  this.newGame = new JButton("New Game");
	  this.tutorial = new JButton("How To Play");
	  this.settings = new JButton("Audio Off");
	  this.icon = new ImageIcon("res/Logo Monopoly.png");
	  this.logo = new JLabel();
	  this.north = new JPanel();
	  this.south = new JPanel();
	  

	  

/**
 * a
 */
	  ActionListener al = (e)->{
	   	action.newGame(this);
	   	clip.getMusicMenu().stop();
      };
	  ActionListener bl = (e)->{
		action.tutorial(this);
		clip.getMusicMenu().stop();
      }; 
	  ActionListener cl = (e)->{
	 action.Audio(clip, settings);
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
	  tutorial.addActionListener(bl);
	  settings.addActionListener(cl);
	  
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
	  clip.getMusicMenu().play();
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
 /**
  * 
  * @return
  */
  public static String getTextButton () {
	  return settings.getText();
  }
  
  public static AudioManager getClip() {
	  return clip;
  }

}
	
	
