package view.menu;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;

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
	private static Dimension d = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
	private static final int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	private static final int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	private static final Dimension dim = new Dimension(width/6,height/20);	
	private JPanel general;
	private JLabel img;
	private ImageIcon icon;
	private JButton back;
	private ControllerNewGameMenu action;
	private AudioManager clip ;
	private CustomMethods methods;
/**
 * builder of howToPlay.	
 */
	public HowToPlay() {
/**
 * declaration of the fields. 
 */
	 this.methods = new CustomMethodsImpl();
	 this.clip = new AudioManager();
	 this.action = new ControllerNewGameMenu();
	 this.general = new JPanel();
	 this.img = new JLabel();
	 this.icon = new ImageIcon("res/howToPlay.png");
	 this.back = new JButton("Back");
/**
 *i set the size of the background image, the JComponents that 
 *contain it.     
 */	
	 Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT);
	 img.setIcon(icon);
	 img.setSize(this.getSize());
	 general.setSize(this.getSize());
/**
 *imposed the esthetic customizations
 *of the JComponents.  	 
 */	 
	 methods.setPreference(back, dim,methods.getButton(), Color.black, methods.getFont());
	 general.setBackground(methods.getBackground());
/**
 *i add JComponents to the frame and action listener to the button.
 */	 
	 back.addActionListener(new Back(this, clip, MainMenu.getTextButton()));
	 general.add(img);
	 this.add(general, BorderLayout.CENTER);
	 this.add(back, BorderLayout.SOUTH);	 	 
	}

}
