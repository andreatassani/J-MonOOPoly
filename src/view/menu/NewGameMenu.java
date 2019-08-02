package view.menu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
	private JButton players;
	private JLabel music;
	private JComboBox<Enum> choiseMusic;
	private JLabel currency;
	private JComboBox choiseCurrency;
	private JButton start;
	private final Dimension dim;
	private final Dimension dimPanel;
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
		this.title = new JLabel("MENU PRINCIPALE");
		this.choiseMusic = new JComboBox<Enum>(model.utility.Music.values());
		this.choiseCurrency = new JComboBox<Enum>(model.utility.Currency.values());
		this.north = new JPanel();
		this.center = new JPanel();
		this.dimPanel = new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width/2,Toolkit.getDefaultToolkit().getScreenSize().height/5);
/**
 * imposed the measures of the component.	
 */
		setSize(players);
		players.setBackground(Color.blue);
		setSize(music);
		setSize(choiseMusic);
		music.setBackground(Color.blue);
		setSize(currency);
		setSize(choiseCurrency);
		currency.setBackground(Color.blue);
		setSize(start);
		start.setBackground(Color.blue);
		
/**
 *set the layout.
 */
		this.setLayout(new BorderLayout());
		north.setLayout(new FlowLayout(FlowLayout.CENTER));
		center.setLayout(new FlowLayout(FlowLayout.CENTER,Toolkit.getDefaultToolkit().getScreenSize().height/2,Toolkit.getDefaultToolkit().getScreenSize().height/10));
		north.setBackground(Color.BLACK);
		north.setPreferredSize(dimPanel);
		//center.setPreferredSize(dimPanel);
		center.setBackground(Color.RED);		
		this.setBackground(Color.red);
/**
 *i create invisible areas to have space between the buttons
 *and i added the buttons to the panel.
 */
//		this.add(Box.createRigidArea(new Dimension(Toolkit.getDefaultToolkit().getScreenSize().height/3,Toolkit.getDefaultToolkit().getScreenSize().height/3)));
//		this.add(players);
//		this.add(Box.createRigidArea(new Dimension(Toolkit.getDefaultToolkit().getScreenSize().height/2,HEIGHT)));
//		this.add(music);
//		this.add(Box.createRigidArea(new Dimension(Toolkit.getDefaultToolkit().getScreenSize().height/2,0)));
//
//		this.add(choiseMusic);
//		this.add(Box.createRigidArea(new Dimension(Toolkit.getDefaultToolkit().getScreenSize().height/2,HEIGHT)));
//		this.add(currency);
//		this.add(Box.createRigidArea(new Dimension(Toolkit.getDefaultToolkit().getScreenSize().height/2,HEIGHT)));
//		this.add(start);
		north.add(title);
		center.add(music);
		center.add(currency);
		
		center.add(choiseMusic);
		center.add(choiseCurrency);
		center.add(players);
		
		center.add(start);
		this.add(north, BorderLayout.NORTH);
		this.add(center, BorderLayout.CENTER);
	}
/**
 * 
 * @param c generic Swing component
 * set component size.
 * 
 */
	public void setSize(final JComponent c) {
		c.setMaximumSize(dim);
		c.setMinimumSize(dim);
		c.setPreferredSize(dim);
	}
	

}
