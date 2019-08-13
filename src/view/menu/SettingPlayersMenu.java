package view.menu;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.text.html.parser.Entity;

import controller.audio.AudioManager;
import controller.menu.ControllerMainMenu;
import controller.menu.ControllerNewGameMenu;
import controller.menu.ControllerSettingPlayersMenu;
import model.allTypeOfCard.EntityDeck;
import model.player.ListOfPlayers;
import model.player.Player;
import model.player.PlayerImpl;
import model.utility.Colors;
import model.utility.NumPlayers;
import model.utility.Pawns;
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
		private JComboBox<Colors> color1 = new JComboBox<Colors>(Colors.values());
		private JComboBox<Pawns> pawn1 = new JComboBox<Pawns>(Pawns.values());			
		private JPanel player2 = new JPanel();
		private JTextField namePlayer2  = new JTextField();
		private JComboBox<Colors> color2 = new JComboBox<Colors> (Colors.values());
		private JComboBox<Pawns> pawn2 = new JComboBox<Pawns>(Pawns.values());			
		private JPanel player3 = new JPanel();
		private JTextField namePlayer3  = new JTextField();
		private JComboBox<Colors>  color3 = new JComboBox<Colors> (Colors.values());
		private JComboBox<Pawns> pawn3 = new JComboBox<Pawns>(model.utility.Pawns.values());			
		private JPanel player4 = new JPanel();
		private JTextField namePlayer4  = new JTextField();
		private JComboBox<Colors>  color4 = new JComboBox<Colors> (Colors.values());
		private JComboBox<Pawns> pawn4 = new JComboBox<Pawns>(Pawns.values());		
		private JLabel numPlayer = new JLabel("NUMBER OF PLAYERS");
		private JButton start = new JButton("STAR GAME");
		private JButton back = new JButton("BACK MAIN MENU");
		private JPanel setPlayers = new JPanel();
		private JLabel image = new JLabel();
		private ImageIcon icon = new ImageIcon("res/setGame.png");
		private JComboBox<NumPlayers> howManyPlayer = new JComboBox<NumPlayers>(NumPlayers.values());
		private ControllerSettingPlayersMenu action;
		private ArrayList<Entity> deck;
		private ListOfPlayers list = new ListOfPlayers();
		private  AudioManager clip;	
		
		
		private JButton done;
/**
* constructor of the main menu.
*/					
	public SettingPlayersMenu() {				
/**
 * set the layout and measurements of 
 * two JLabels containing a button, image, 
 * JFieldTextArea and a JComboCheckBox.
 */
		
		this.done = new JButton("DONE");
		this.clip = new AudioManager();
		this.deck = new ArrayList<Entity>(4);
		this.action = new ControllerSettingPlayersMenu();
		this.setLayout(new BorderLayout());
		image.setLayout(new BoxLayout(image, BoxLayout.Y_AXIS));
		start.setMaximumSize(dimName);
		start.setMinimumSize(dimName);
	
		image.setPreferredSize(dimPlayer);
		setPreference(start, dimName, button, Color.WHITE, f);
		setPreference(back, dimName, button, Color.WHITE, f);
		setPreference(done, dimNameG, button, Color.WHITE, f);
		back.setMaximumSize(dimName);
		back.setMinimumSize(dimName);
/**
 * actionlistener
 */
		 ActionListener actionBack = (e)->{	
		  action.backNewGame(this);
		  
		NewGameMenu.getClip().getRockMusic().stop();
		NewGameMenu.getClip().getClassicMusic().stop();
		NewGameMenu.getClip().getTecnoMusic().stop();
		NewGameMenu.getClip().getPopMusic().stop();
		   
	      };

	      
	      ActionListener actionDone = (e)->{	
	    	  
	    	
	    	list.addPlayer(action.start(namePlayer1.getText(),action.chosenColor(color1.getSelectedIndex()) , 
	    			action.chosenPawn(pawn1.getSelectedIndex())), 1);
	    	list.addPlayer(action.start(namePlayer2.getText(),action.chosenColor(color2.getSelectedIndex()) , 
	    			action.chosenPawn(pawn2.getSelectedIndex())), 2);
	    	list.addPlayer(action.start(namePlayer3.getText(),action.chosenColor(color3.getSelectedIndex()) , 
	    			action.chosenPawn(pawn3.getSelectedIndex())), 3);
	    	list.addPlayer(action.start(namePlayer4.getText(), action.chosenColor(color4.getSelectedIndex()) , 
	    			action.chosenPawn(pawn4.getSelectedIndex())), 4);

		      };
		      ActionListener actionStart = (e)->{	
		    	 
		    	  
		    	 
		    	
		    	
		    		  EntityDeck deck = new EntityDeck(list.getPlayerFromIndex(0));
			    	  new MenuGui(new MainExternContainer(list, deck.getDeck()));
		    	  
						 
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
		start.addActionListener(actionStart);
		done.addActionListener(actionDone);	
		back.addActionListener(actionBack);
		image.add(start);		
		right.add(setPlayers);
		right.add(image);				
		left.add(player1);
		left.add(player2);
		left.add(player3);
		left.add(player4);
		left.add(done);
		right.add(back);
		right.setBackground(backGround);
		left.setBackground(backGround);
		setPlayers.setBackground(backGround);
		
		
		action.musicStop(NewGameMenu.getAudio(), clip);
		clip.getMusicMenu().stop();
		
		
		
		
		this.add(left,BorderLayout.EAST);
		this.add(right, BorderLayout.WEST);	
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
	
