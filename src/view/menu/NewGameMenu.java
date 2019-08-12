package view.menu;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;

import controller.audio.AudioManager;
import controller.menu.ControllerNewGameMenu;
import model.utility.Music;
/**
 * 
 * class for the managing the graphics new game menu.
 *
 */
public class NewGameMenu extends JFrame {
/**
 * New Game menu fields.
 */
	private static final long serialVersionUID = -1351952748912231272L;
	private static Dimension d = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
	private static final int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	private static final int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	private static final Dimension dim = new Dimension(width/6 ,height/20);
	private static final Dimension dimPanel  = new Dimension(width/2,height/4);
	private static final Font font = new Font("Cooper Black",Font.CENTER_BASELINE,50);
	private static final Color mainColor  = new Color(173,238,216);
	private static final Color lineColor = Color.WHITE;
	private static final Color button = new Color(242,59,59);	
	private JPanel north;
	private JPanel center;
	private JLabel title;
	private JLabel imageRight;
	private JLabel imageLeft;
	private JButton players;
	private JLabel music;
	private JComboBox<Music> choiseMusic;
	private JLabel currency;
	private JComboBox choiseCurrency;
	private ImageIcon icon;
	private JButton back;
	private ControllerNewGameMenu action;
	private static AudioManager clip = new AudioManager();
	private static AudioManager clip2 = new AudioManager();
	private static String audio = MainMenu.getTextButton();

/**
 * constructor of the New game menu.
 */
	public NewGameMenu() {
/**
 * declaration of the fields.	
 */
		this.action = new ControllerNewGameMenu();
		this.players = new JButton("Players");
		this.music = new JLabel("Music");
		this.currency = new JLabel("Currency");
		this.title = new JLabel("MAIN MENU");
		this.back = new JButton("Back");
		this.icon = new ImageIcon("res/mr-monopoly2.png");
		this.choiseMusic = new JComboBox<Music>(Music.values());
		this.choiseCurrency = new JComboBox<Enum>(model.utility.Currency.values());
		this.north = new JPanel();
		this.center = new JPanel();			
		this.imageRight = new JLabel();
		this.imageLeft = new JLabel();
		
/**
 * JComponent customization.
 */
		
		setPreference(north, dimPanel, mainColor, mainColor, font);
		setPreference(players, dim, button, lineColor, font);
		setPreference(music, dim, mainColor, Color.black, font);
		setPreference(choiseCurrency, dim, mainColor, Color.black, font);
		setPreference(choiseMusic, dim, mainColor, Color.black, font);
		setPreference(currency, dim, mainColor, Color.black, font);
		setPreference(back, dim, button, lineColor, font);
		title.setFont(new Font("Cooper Black",Font.CENTER_BASELINE,70));		
		center.setBackground(mainColor);		
		this.setBackground(mainColor);	
		imageRight.setIcon(icon);
		imageLeft.setIcon(icon);
		Image scaledImage = icon.getImage().getScaledInstance(width/7,height/4, Image.SCALE_DEFAULT);
		icon.setImage(scaledImage);	
/**
 * Action listener that back to the main menu and checks if the audio is to be
 * activated or not.
 */
		 ActionListener al = (e)->{
			action.back(this);
			action.musicStop(MainMenu.getTextButton(), clip);
			clip.getMusicMenu().stop();			 
	      };
/**
 *Action Listener chooses the audio track to listen to during the game and opens
 *the menu for customizing players and controls whether the audio is to be activated or 
 *not. 
 */
	      ActionListener bl = (e)->{
	    	  action.music(choiseMusic.getSelectedIndex(), clip2);
	    	  action.players(this);	
	    	  clip.getMusicMenu().stop();
		      };   
/**
 *set the JPanel layout.
 */
		this.setLayout(new BorderLayout());
		north.setLayout(new FlowLayout(FlowLayout.CENTER));
		center.setLayout(new FlowLayout(FlowLayout.CENTER,height/2,height/10));			
/**
 * i add all the components to the main panel.	
 */
		back.addActionListener(al);
		players.addActionListener(bl);
		north.add(imageLeft);
		north.add(title);
		north.add(imageRight);
		center.add(music);
		center.add(currency);		
		center.add(choiseMusic);
		center.add(choiseCurrency);
		center.add(players);		
		center.add(back);
		this.add(north, BorderLayout.NORTH);
		this.add(center, BorderLayout.CENTER);
/**
 * check if the audio is active or not.
 */
		action.musicStop(MainMenu.getTextButton(), clip);
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
 * communicates to the next frame if the audio is active or not. 
 * @return a string with the audio status
 */
	public static String getAudio() {
		return audio;
	}
/**
 * allows you to activate or deactivate the audio track of the
 * frame.	
 * @return audio track to activate or deactivate
 */
	public static AudioManager getClip() {
		return clip2;
	}

}
