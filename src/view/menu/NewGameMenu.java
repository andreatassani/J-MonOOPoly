package view.menu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * 
 * class for the new game menu.
 *
 */
public class NewGameMenu extends JPanel {
/**
 * New Game menu fields.
 */
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
	private JButton start;
	private final Dimension dim;
	private final Dimension dimPanel;
	private ImageIcon icon;
	private JButton back;
	private Font font;
	private Color mainColor;
	private Color lineColor;
	private Color button;
	private LineBorder lineRed;

	
	
	
	private static final int WIDTH = 400;
	private static final int HEIGHT = 50;
/**
 * constructor of the New game menu.
 */
	public NewGameMenu() {
	
		this.dim = new Dimension(WIDTH,HEIGHT);
		this.players = new JButton("Players");
		this.music = new JLabel("Music");
		this.currency = new JLabel("Currency");
		this.start = new JButton("Start Game");
		this.title = new JLabel("MAIN MENU");
		this.choiseMusic = new JComboBox<Enum>(model.utility.Music.values());
		this.choiseCurrency = new JComboBox<Enum>(model.utility.Currency.values());
		this.north = new JPanel();
		this.center = new JPanel();
		this.dimPanel = new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width/2,
										Toolkit.getDefaultToolkit().getScreenSize().height/4);
		this.icon = new ImageIcon("res/mr-monopoly2.png");
		this.back = new JButton("Back");
		this.imageRight = new JLabel();
		this.imageLeft = new JLabel();
		this.font = new Font("Cooper Black",Font.CENTER_BASELINE,50);
		this.mainColor = new Color(173,238,216);;
		this.lineColor = Color.BLACK;
		this.lineRed = new LineBorder(lineColor, 2);
		this.button = new Color(242,59,59);
		
/**
 * imposed the measures of the component.	
 */
		setSize(players ,dim);
		
		setSize(music, dim);
		setSize(choiseMusic, dim);
		setSize(back,dim);		
		setSize(currency,dim);
		setSize(choiseCurrency,dim);		
		setSize(start,dim);		
		Image scaledImage = icon.getImage().getScaledInstance(Toolkit.getDefaultToolkit().getScreenSize().width/7,
				Toolkit.getDefaultToolkit().getScreenSize().height/4, Image.SCALE_DEFAULT);
		icon.setImage(scaledImage);
		
		
/**
 *set the layout.
 */
		this.setLayout(new BorderLayout());
		north.setLayout(new FlowLayout(FlowLayout.CENTER));
		center.setLayout(new FlowLayout(FlowLayout.CENTER,Toolkit.getDefaultToolkit().getScreenSize().height/2,
														Toolkit.getDefaultToolkit().getScreenSize().height/10));
		title.setFont(new Font("Cooper Black",Font.CENTER_BASELINE,70));
		setSettings(music, button, null);
		setSettings(currency,button,null);
		
		setSettings(choiseCurrency,mainColor, null);
		setSettings(choiseMusic, mainColor, null);
		setSettings(players, button, lineRed);
		setSettings(start,button,lineRed);
		setSettings(back, button, lineRed);
		back.setForeground(Color.WHITE);
		players.setForeground(Color.WHITE);
		start.setForeground(Color.white);
		imageRight.setIcon(icon);
		imageLeft.setIcon(icon);
		north.setBackground(mainColor);
		setSize(north,dimPanel);
		center.setBackground(mainColor);		
		this.setBackground(mainColor);
		start.setBorder(new LineBorder(Color.white,4));
		back.setBorder(new LineBorder(Color.white,4));
		players.setBorder(new LineBorder(Color.white,4));
/**
 * i add all the components to the main panel.	
 */
		north.add(imageLeft);
		north.add(title);
		north.add(imageRight);
		center.add(music);
		center.add(currency);		
		center.add(choiseMusic);
		center.add(choiseCurrency);
		center.add(players);		
		center.add(start);
		center.add(back);
		this.add(north, BorderLayout.NORTH);
		this.add(center, BorderLayout.CENTER);
	}
/**
 * 
 * @param c generic Swing component
 * set component size.
 * 
 */
	public void setSize(final JComponent c, Dimension d) {
		c.setMaximumSize(d);
		c.setMinimumSize(d);
		c.setPreferredSize(d);
	}
/**
 * set all the customizations of the components.
 * @param c
 * @param col
 * @param l
 */
	public void setSettings(final JComponent c, Color Background , LineBorder l) {
		c.setFont(font);
		c.setBorder(l);
		c.setBackground(Background);
		
		
		
	}

}
