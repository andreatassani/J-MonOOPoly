package view.menu;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;
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
	private static final Dimension dim = new Dimension(400,50);
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
	private JComboBox<Enum> choiseMusic;
	private JLabel currency;
	private JComboBox choiseCurrency;
//	private JButton start;	
	private ImageIcon icon;
	private JButton back;
	private SettingPlayersMenu menu = new SettingPlayersMenu();
/**
 * constructor of the New game menu.
 */
	public NewGameMenu() {
/**
 * declaration of the fields.	
 */
		this.players = new JButton("Players");
		this.music = new JLabel("Music");
		this.currency = new JLabel("Currency");
//		this.start = new JButton("Start Game");
		this.title = new JLabel("MAIN MENU");
		this.back = new JButton("Back");
		this.icon = new ImageIcon("res/mr-monopoly2.png");
		this.choiseMusic = new JComboBox<Enum>(model.utility.Music.values());
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
//		setPreference(start, dim, button, lineColor, font);
		setPreference(back, dim, button, lineColor, font);
		title.setFont(new Font("Cooper Black",Font.CENTER_BASELINE,70));		
		center.setBackground(mainColor);		
		this.setBackground(mainColor);	
		imageRight.setIcon(icon);
		imageLeft.setIcon(icon);
		Image scaledImage = icon.getImage().getScaledInstance(width/7,height/4, Image.SCALE_DEFAULT);
		icon.setImage(scaledImage);	
		 ActionListener al = (e)->{
			 this.setVisible(false);
			 new MenuGui(new MainMenu());			          
	      };
	      ActionListener bl = (e)->{
				 this.setVisible(false);
				 this.setEnabled(false);
				 new MenuGui(menu);			          
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
//		center.add(start);
		center.add(back);
		this.add(north, BorderLayout.NORTH);
		this.add(center, BorderLayout.CENTER);
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
