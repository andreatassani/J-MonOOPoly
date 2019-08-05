package view.menu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import model.utility.Pawns;


/**
 * 
 * class for the setting player menu.
 *
 */
	public class SettingPlayersMenu extends JPanel {				
/**
 * SettingPlayersMenu fields.
 */
		private JPanel left = new JPanel();
		private JPanel right = new JPanel();		
		private JPanel player1 = new JPanel();
		private JTextField namePlayer1  = new JTextField();
		private JComboBox color1 = new JComboBox(model.utility.Colors.values());
		private JComboBox pawn1 = new JComboBox(model.utility.Pawns.values());	
		
		private JPanel player2 = new JPanel();
		private JTextField namePlayer2  = new JTextField();
		private JComboBox color2 = new JComboBox(model.utility.Colors.values());
		private JComboBox pawn2 = new JComboBox(model.utility.Pawns.values());	
		
		private JPanel player3 = new JPanel();
		private JTextField namePlayer3  = new JTextField();
		private JComboBox color3 = new JComboBox(model.utility.Colors.values());
		private JComboBox pawn3 = new JComboBox(model.utility.Pawns.values());	
		
		private JPanel player4 = new JPanel();
		private JTextField namePlayer4  = new JTextField();
		private JComboBox color4 = new JComboBox(model.utility.Colors.values());
		private JComboBox pawn4 = new JComboBox(model.utility.Pawns.values());
		
		private JLabel numPlayer = new JLabel("NUMERO GIOCATORI");
		private JButton done = new JButton("STAR GAME");
		private JComboBox howManyPlayer = new JComboBox(model.utility.NumPlayers.values());
		private JPanel setPlayers = new JPanel();
		private JPanel contentImage = new JPanel();
		private JPanel contentButton = new JPanel();
		private JLabel image = new JLabel();
		private ImageIcon icon = new ImageIcon("res/setGame.png");
		private Color backGround = backGround = new Color(173,238,216);
		private Color button = new Color(242,59,59);
		private Font f = new Font("Cooper Black", Font.CENTER_BASELINE,30);
		
		private static Dimension dimPlayer = new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width/2,
															Toolkit.getDefaultToolkit().getScreenSize().height);
		private static Dimension dimName = new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width/5,
															Toolkit.getDefaultToolkit().getScreenSize().height/28);
		private static Dimension dimCombo = new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width/10,
															Toolkit.getDefaultToolkit().getScreenSize().height/28);
		private static Dimension dimImg = new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width/4,
															Toolkit.getDefaultToolkit().getScreenSize().height/2);
		private static Dimension dimComboColor = new Dimension((Toolkit.getDefaultToolkit().getScreenSize().width/4)/3,
				Toolkit.getDefaultToolkit().getScreenSize().height/28);
		private static Dimension dimNameG = new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width/3,
				Toolkit.getDefaultToolkit().getScreenSize().height/28);

/**
* constructor of the main menu.
*/					
	public SettingPlayersMenu() {
/**
 * set the layout and measurements of 
 * two JLabels containing a button, image, 
 * JFieldTextArea and a JComboCheckBox.
 */
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		image.setLayout(new BoxLayout(image, BoxLayout.Y_AXIS));
		done.setMaximumSize(dimName);
		done.setMinimumSize(dimName);
		image.setPreferredSize(dimPlayer);
		done.setSize(dimName);
		done.setFont(f);
		done.setBackground(button);
		done.setForeground(Color.white);
		done.setBorder(new LineBorder(Color.WHITE,4));
/**
 * i configure the size of the image.
 */		
		Image scaledImage = icon.getImage().getScaledInstance(dimImg.width, dimImg.height, Image.SCALE_DEFAULT);
		icon.setImage(scaledImage);
		image.setIcon(icon);
/**
 * i create panels for customizing the game.
 */
		setMyPanel(left, dimPlayer);
		setMyPanel(right, dimPlayer);
		createSetPlayer(player1, namePlayer1, color1, pawn1,f);
		createSetPlayer(player2, namePlayer2, color2, pawn2,f);
		createSetPlayer(player3, namePlayer3, color3, pawn3,f);
		createSetPlayer(player4, namePlayer4, color4, pawn4,f);
		createNumPlayerPanel(setPlayers, numPlayer, howManyPlayer,f);
/**
 * i add all the panels to the main panel
 */		
		image.add(done);
		right.add(setPlayers);
		right.add(image);				
		left.add(player1);
		left.add(player2);
		left.add(player3);
		left.add(player4);	
		right.setBackground(backGround);
		setPlayers.setBackground(backGround);
		
		this.add(left);
		this.add(right);	
	}
/**
 * method for creating a sub-panel with customized measurements.
 * @param player a JPanel.
 * @param name a JTextField.
 * @param color a JComboBox.
 * @param pawn a JComboBox.
 */
	public void createSetPlayer(JPanel player, JTextField name, JComboBox color, JComboBox pawn, Font f) {
		player.setBackground(backGround);
		player.setLayout(new FlowLayout(FlowLayout.CENTER));
		player.setPreferredSize(dimPlayer);
		name.setBackground(button);
		name.setPreferredSize(dimName);
		name.setFont(f);
		name.setForeground(Color.white);
		name.setBorder(new LineBorder(Color.WHITE,4));
		color.setBackground(backGround);
		color.setPreferredSize(dimComboColor);
		color.setFont(f);
		pawn.setBackground(backGround);
		pawn.setFont(f);		
		pawn.setPreferredSize(dimCombo);		
		player.add(name);
		player.add(color);
		player.add(pawn);
		
													
}
/**
 * method for creating a panel with customized measurements.
 * @param p
 * @param d
 */
	
	public void setMyPanel(JPanel p, Dimension d) {
	  
	  p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
	  p.setPreferredSize(d);	  	  	 	  
	}
/**
* method for creating a panel with customized measurements.
* @param p
* @param d
*/	
	public void createNumPlayerPanel(JPanel p, JLabel l, JComboBox n, Font f) {
		p.setLayout(new FlowLayout(FlowLayout.LEFT));
		p.setPreferredSize(dimPlayer);
		l.setPreferredSize(dimNameG);
		l.setBorder(new LineBorder(Color.black,4));
		l.setForeground(Color.BLACK);
		l.setFont(f);
		n.setFont(f);
		n.setPreferredSize(dimComboColor);
		n.setBackground(backGround);
		p.add(l);
		p.add(n);
		
	}
	

	
	
	
}
	
