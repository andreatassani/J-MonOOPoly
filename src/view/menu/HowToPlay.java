package view.menu;

import java.awt.*;
import javax.swing.*;
import controller.actionListeners.Back;
import controller.audio.AudioManager;
import controller.menu.ControllerNewGameMenu;
/**
 * 
 * class for tutorial management.
 *
 */
public class HowToPlay extends JFrame {
/**
 * HowToPlay fields.
 */
	private static final long serialVersionUID = -8050329563867823166L;
	private JPanel general;
	private JLabel img;
	private ImageIcon icon;
	private JButton back;
	private ControllerNewGameMenu action;
	private AudioManager clip ;
	private CustomMethodsImpl methods = new CustomMethodsImpl();
	private Dimension dim;
/**
 * Builder of howToPlay.	
 */
	public HowToPlay() {
/**
 * Declaration of the fields. 
 */
	 this.clip = new AudioManager();
	 this.action = new ControllerNewGameMenu();
	 this.general = new JPanel();
	 this.img = new JLabel();
	 this.icon = new ImageIcon("res/howToPlay.png");
	 this.back = new JButton("Back");
	 this.dim  = new Dimension(methods.getWidth()/6,methods.getHeight()/20);
/**
 *I set the size of the background image, the JComponents that 
 *contain it.     
 */	
	 Image scaledImage = icon.getImage().getScaledInstance(methods.getWidth(), methods.getHeight(), Image.SCALE_DEFAULT);
	 img.setIcon(icon);
	 img.setSize(this.getSize());
	 general.setSize(this.getSize());
/**
 *Imposed the esthetic customizations
 *of the JComponents.  	 
 */	 
	 methods.setPreference(back, dim ,methods.getButton(), Color.black, methods.getFont());
	 general.setBackground(methods.getBackground());
/**
 *I add JComponents to the frame and action listener to the button.
 */	 
	 action.musicStop(MainMenu.getTextButton(), clip);
	 back.addActionListener(new Back(this, clip, MainMenu.getTextButton()));
	 general.add(img);
	 this.add(general, BorderLayout.CENTER);
	 this.add(back, BorderLayout.SOUTH);	 	 
	}

}
