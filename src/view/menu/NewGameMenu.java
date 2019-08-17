package view.menu;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;

import controller.actionListeners.Back;
import controller.actionListeners.Players;
import controller.audio.AudioManager;
import controller.menu.ControllerNewGameMenu;
import model.myEnum.Music;
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
	private CustomMethods methods;
	private static AudioManager clip = new AudioManager();
	private static AudioManager clip2 = new AudioManager();
	private static String audio = MainMenu.getTextButton();
	public static int i= 0;
	


/**
 * constructor of the New game menu.
 */
	public NewGameMenu() {
/**
 * declaration of the fields.	
 */
		this.methods = new CustomMethodsImpl();
		this.action = new ControllerNewGameMenu();
		this.players = new JButton("Players");
		this.music = new JLabel("Music");
		this.currency = new JLabel("Currency");
		this.title = new JLabel("MAIN MENU");
		this.back = new JButton("Back");
		this.icon = new ImageIcon("res/mr-monopoly2.png");
		
		this.choiseMusic = new JComboBox<Music>(Music.values());
		this.choiseCurrency = new JComboBox<Enum>(model.myEnum.Currency.values());
		this.north = new JPanel();
		this.center = new JPanel();			
		this.imageRight = new JLabel();
		this.imageLeft = new JLabel();

		
		
/**
 * JComponent customization.
 */
		methods.setPreference(north, dimPanel, methods.getBackground(), methods.getBackground(), methods.getFont());
		methods.setPreference(players, dim, methods.getButton(), methods.getWriter(), methods.getFont());
		methods.setPreference(music, dim, methods.getBackground(), Color.black, methods.getFont());
		methods.setPreference(choiseCurrency, dim, methods.getBackground(), Color.black, methods.getFont());
		methods.setPreference(choiseMusic, dim,methods.getBackground(), Color.black, methods.getFont());
		methods.setPreference(currency, dim, methods.getBackground(), Color.black, methods.getFont());
		methods.setPreference(back, dim, methods.getButton(), methods.getWriter(), methods.getFont());
		title.setFont(new Font("Cooper Black",Font.CENTER_BASELINE,70));		
		center.setBackground(methods.getBackground());		
		this.setBackground(methods.getBackground());	
		imageRight.setIcon(icon);
		imageLeft.setIcon(icon);
		Image scaledImage = icon.getImage().getScaledInstance(width/7,height/4, Image.SCALE_DEFAULT);
		icon.setImage(scaledImage);	

/**
 *Action Listener chooses the audio track to listen to during the game and opens
 *the menu for customizing players and controls whether the audio is to be activated or 
 *not. 
 */
		ActionListener actionPlayers = (e)->{	
	    	  action.music(choiseMusic.getSelectedIndex(), clip2);
	    	  clip.getMusicMenu().stop();
	    	  action.players(this);
	    	  JOptionPane.showMessageDialog(null, "SELEZIONARE IL NUMERO DI GICOATORI");
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
		
		back.addActionListener(new Back(this, clip, MainMenu.getTextButton()));
		players.addActionListener(new Players(this, clip, clip2, choiseMusic.getSelectedIndex()));
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
