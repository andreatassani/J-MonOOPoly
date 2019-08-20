package view.menu;

import java.awt.*;
import javax.swing.*;
import controller.actionListeners.Back;
import controller.actionListeners.BackHowToPlay;
import controller.audio.AudioManager;
import controller.menu.ControllerNewGameMenu;
import model.customComponent.CustomMethodsImpl;
/**
 * 
 * class for tutorial management.
 *
 */
public class HowToPlay extends JFrame {
/**
 * HowToPlay fields.
 */
	private static final long serialVersionUID = -1L;
	private JPanel general;
	private JLabel image;
	private ImageIcon icon;
	private JButton back;
	private ControllerNewGameMenu action;
	private AudioManager clip ;
	private CustomMethodsImpl methods = new CustomMethodsImpl();
	private Dimension dim;
/**
 * Builder of howToPlay.	
 */
	public HowToPlay()  {
/**
 * Declaration of the fields. 
 */
	 this.clip = new AudioManager();
	 this.action = new ControllerNewGameMenu();
	 this.general = new JPanel();
	 this.image = new JLabel();
	 this.icon = new ImageIcon("res/menuIcon/howToPlay.png");
	 this.back = new JButton("Back");
	 this.dim  = new Dimension(methods.getWidth()/6,methods.getHeight()/20);
/**
 *I set the size of the background image, the JComponents that 
 *contain it.     
 */	
	 Image scaledImage = icon.getImage().getScaledInstance(methods.getWidth(), methods.getHeight(), Image.SCALE_DEFAULT);
	 image.setIcon(icon);
	 image.setSize(this.getSize());
	 general.setSize(this.getSize());
/**
 *Imposed the esthetic customizations
 *of the JComponents.  	 
 */	 
	 methods.setPreference(back, dim ,methods.getButton(), Color.black, methods.getFont());
	 general.setBackground(methods.getBackground());
/**
 * I check if i have to stop the sounds.
 */
	 action.musicStop(MainMenu.getTextButton(), clip);
/**
 *I add JComponents to the frame and action listener to the button.
 */	 
	
	 back.addActionListener(new BackHowToPlay(this, clip, MainMenu.getTextButton()));
	 general.add(image);
	 this.add(general, BorderLayout.CENTER);
	 this.add(back, BorderLayout.SOUTH);	 	 
	}

}
