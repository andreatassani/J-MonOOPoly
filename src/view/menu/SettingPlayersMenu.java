package view.menu;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.text.html.parser.Entity;

import controller.audio.AudioManager;
import controller.menu.ControllerMainMenu;
import controller.menu.ControllerSettingPlayersMenu;
import model.player.ListOfPlayers;
import model.utility.NumPlayers;
import view.play.MainExternContainer;


/**
 * 
 * class for the setting player menu.
 *
 */
	public class SettingPlayersMenu extends JFrame{				
/**
 * SettingPlayersMenu fields.
 */
		private static final int width = Toolkit.getDefaultToolkit().getScreenSize().width;
		private static final int height = Toolkit.getDefaultToolkit().getScreenSize().height;
		private static final Color backGround = new Color(173,238,216);
		private static final Color button = new Color(242,59,59);
		private static Dimension d = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
		private static final Font f = new Font("Cooper Black", Font.CENTER_BASELINE,30);		
		private static final Dimension dimPlayer = new Dimension(width/2,height);
		private static final Dimension dimName = new Dimension(width/5,height/28);
		private static final Dimension dimCombo = new Dimension(width/10,height/28);
		private static final Dimension dimImg = new Dimension(width/4,height/2);
		private static final Dimension dimComboColor = new Dimension((width/4)/3,height/28);
		private static final Dimension dimNameG = new Dimension(width/3,height/28);
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
		private JButton back = new JButton("BACK");
		private JPanel setPlayers = new JPanel();
		private JLabel image = new JLabel();
		private ImageIcon icon = new ImageIcon("res/setGame.png");
		private String[] numer = {"TWO" , "THREEE"};
		private String due = new String("TWO");
		private JComboBox howManyPlayer = new JComboBox(model.utility.NumPlayers.values());
		private ControllerSettingPlayersMenu action;
		private ArrayList deck;
		private ListOfPlayers list = new ListOfPlayers();

/**
* constructor of the main menu.
*/					
	public SettingPlayersMenu() {				
/**
 * set the layout and measurements of 
 * two JLabels containing a button, image, 
 * JFieldTextArea and a JComboCheckBox.
 */
		this.deck = new ArrayList<Entity>(4);
		this.action = new ControllerSettingPlayersMenu();
		this.setLayout(new BorderLayout());
		image.setLayout(new BoxLayout(image, BoxLayout.Y_AXIS));
		done.setMaximumSize(dimName);
		done.setMinimumSize(dimName);
		image.setPreferredSize(dimPlayer);
		setPreference(done, dimName, button, Color.WHITE, f);
		setPreference(back, dimName, button, Color.WHITE, f);
		back.setMaximumSize(dimName);
		back.setMinimumSize(dimName);
/**
 * actionlistener
 */
		 ActionListener al = (e)->{	
			 action.backNewGame(this);			 
	      };
	      ActionListener bl = (e)->{	
	    	  this.setVisible(false);
				 if(howManyPlayer.getSelectedItem().equals(NumPlayers.TWO)) {
					 new MenuGui(new MainExternContainer(list,deck));
					 
				 }
				 
		      };
	    
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
		
		done.addActionListener(bl);	
		back.addActionListener(al);
		image.add(done);		
		right.add(setPlayers);
		right.add(image);				
		left.add(player1);
		left.add(player2);
		left.add(player3);
		left.add(player4);
		right.add(back);
		right.setBackground(backGround);
		setPlayers.setBackground(backGround);
		

		
		this.add(left,BorderLayout.WEST);
		this.add(right, BorderLayout.EAST);	
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
	
