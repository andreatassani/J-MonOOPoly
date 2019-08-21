package view.menu;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.text.html.parser.Entity;
import controller.actionListeners.BackSettingsMenu;
import controller.actionListeners.NumberOfPlayer;
import controller.actionListeners.StartGame;
import controller.audio.AudioManager;
import controller.menu.ControllerSettingPlayersMenu;
import model.customComponent.CustomMethodsImpl;
import model.myEnum.Colors;
import model.myEnum.Pawns;
import model.player.ListOfPlayersImpl;


/**
 * 
 * Class for the setting player menu.
 *
 */
	public class SettingPlayersMenu extends JFrame{				
/**
 * SettingPlayersMenu fields.
 */
		private static final long serialVersionUID = 1L;
		private final CustomMethodsImpl methods = new CustomMethodsImpl();
		private JPanel right = new JPanel();
		private JPanel left = new JPanel();		
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
		private JComboBox<Pawns> pawn3 = new JComboBox<Pawns>(model.myEnum.Pawns.values());			
		private JPanel player4 = new JPanel();
		private JTextField namePlayer4  = new JTextField();
		private JComboBox<Colors>  color4 = new JComboBox<Colors> (Colors.values());
		private JComboBox<Pawns> pawn4 = new JComboBox<Pawns>(Pawns.values());		
		private JLabel numPlayer = new JLabel("NUMBER OF PLAYERS");
		private JButton start = new JButton("STAR GAME");
		private JButton back = new JButton("BACK MAIN MENU");
		private JPanel setPlayers = new JPanel();
		private JLabel image = new JLabel();
		private ImageIcon icon = new ImageIcon(this.getClass().getResource("/menuIcon/setGame.png"));
		private ControllerSettingPlayersMenu action;
		private ListOfPlayersImpl list = new ListOfPlayersImpl();
		private AudioManager clip;	
		private JButton done;
		private JButton howManyPlayer = new JButton("4");
		private String namePlayer;
		private Dimension dimPlayer;
		private Dimension dimName;
		private Dimension dimNameG;
/**
* Constructor of the main menu.
*/					
	public SettingPlayersMenu(String difficulty) {	

/**
 * Set the layout and measurements of 
 * two JLabels containing a button, image, 
 * JFieldTextArea and a JComboCheckBox.
 */
		this.namePlayer = "Name Player";
		this.done = new JButton("DONE");
		this.clip = new AudioManager();
		this.action = new ControllerSettingPlayersMenu();
		this.setLayout(new BorderLayout());
		this.dimPlayer = new Dimension(methods.getWidth()/2,methods.getHeight());
		this.dimName = new Dimension((methods.getWidth()/5),methods.getHeight()/28);
		this.dimNameG = new Dimension((methods.getWidth()/3),methods.getHeight()/28);
/**
 * Customize JComponents.		
 */
		image.setLayout(new BoxLayout(image, BoxLayout.Y_AXIS));
		start.setMaximumSize(dimName);
		start.setMinimumSize(dimName);
		image.setPreferredSize(dimPlayer);
		methods.setPreference(start, dimName, methods.getButton(), methods.getWriter(), methods.getFont());
		methods.setPreference(back, dimName, methods.getButton(),  methods.getWriter(), methods.getFont());
		methods.setPreference(done, dimNameG, methods.getButton(),  methods.getWriter(), methods.getFont());
		methods.setPreference(howManyPlayer, dimNameG, methods.getButton(), Color.BLACK , methods.getFont());
		back.setMaximumSize(dimName);
		back.setMinimumSize(dimName);
		left.setBackground(methods.getBackground());
		right.setBackground(methods.getBackground());
		setPlayers.setBackground(methods.getBackground());		
		namePlayer1.setText(namePlayer);
		namePlayer2.setText(namePlayer);
		namePlayer3.setText(namePlayer);
		namePlayer4.setText(namePlayer);
		pawn1.removeItem(Pawns.BANK);
		pawn2.removeItem(Pawns.BANK);
		pawn3.removeItem(Pawns.BANK);
		pawn4.removeItem(Pawns.BANK);
/**
 * Check the number of players and create the list of players based
 * on the number chosen. 
 */	      
	      ActionListener actionDone = (e)->{		    	  
	    	if(howManyPlayer.getText().equals("4")) {
	    	list.addPlayer(action.start(namePlayer1.getText(),action.chosenColor(color1.getSelectedIndex()) , 
	    			action.chosenPawn(pawn1.getSelectedIndex()),difficulty), list.getNumberPlayer()+1);
	    	list.addPlayer(action.start(namePlayer2.getText(),action.chosenColor(color2.getSelectedIndex()) , 
	    			action.chosenPawn(pawn2.getSelectedIndex()),difficulty), list.getNumberPlayer()+1);
	    	list.addPlayer(action.start(namePlayer3.getText(),action.chosenColor(color3.getSelectedIndex()) , 
	    			action.chosenPawn(pawn3.getSelectedIndex()),difficulty), list.getNumberPlayer()+1);
	    	list.addPlayer(action.start(namePlayer4.getText(), action.chosenColor(color4.getSelectedIndex()) , 
	    			action.chosenPawn(pawn4.getSelectedIndex()),difficulty), list.getNumberPlayer()+1);
	    	}	    	
	    	if(howManyPlayer.getText().equals("3")) {
	    		list.addPlayer(action.start(namePlayer1.getText(),action.chosenColor(color1.getSelectedIndex()) , 
	    				action.chosenPawn(pawn1.getSelectedIndex()),difficulty), list.getNumberPlayer()+1);
	    		list.addPlayer(action.start(namePlayer2.getText(),action.chosenColor(color2.getSelectedIndex()) , 
	    			    action.chosenPawn(pawn2.getSelectedIndex()),difficulty), list.getNumberPlayer()+1);
	    		list.addPlayer(action.start(namePlayer3.getText(),action.chosenColor(color3.getSelectedIndex()) , 
	    			    action.chosenPawn(pawn3.getSelectedIndex()),difficulty), list.getNumberPlayer()+1);
	    	}	    	
	    	if(howManyPlayer.getText().equals("2")) {
	    		list.addPlayer(action.start(namePlayer1.getText(),action.chosenColor(color1.getSelectedIndex()) , 
	    				action.chosenPawn(pawn1.getSelectedIndex()),difficulty), list.getNumberPlayer()+1);
	    		list.addPlayer(action.start(namePlayer2.getText(),action.chosenColor(color2.getSelectedIndex()) , 
	    			    action.chosenPawn(pawn2.getSelectedIndex()),difficulty), list.getNumberPlayer()+1);
	    	}
	    	done.setEnabled(false);
		      };	
/**
 * I configure the size of the image.
 */		
		Image scaledImage = icon.getImage().getScaledInstance(methods.getDimImg().width, methods.getDimImg().height, Image.SCALE_DEFAULT);
		icon.setImage(scaledImage);
		image.setIcon(icon);
		
/**
 * I create panels for customizing the game.
 */
		methods.setMyPanel(right, dimPlayer);
		methods.setMyPanel(left, dimPlayer);
		methods.createSetPlayer(player1, namePlayer1, color1, pawn1,methods.getFont());
		methods.createSetPlayer(player2, namePlayer2, color2, pawn2,methods.getFont());
		methods.createSetPlayer(player3, namePlayer3, color3, pawn3,methods.getFont());
		methods.createSetPlayer(player4, namePlayer4, color4, pawn4,methods.getFont());		
		methods.createNumPlayerPanel(setPlayers, numPlayer, howManyPlayer ,methods.getFont());
/**
 * I add all the panels to the main panel
 */		
		howManyPlayer.addActionListener(new NumberOfPlayer(player3, player4, howManyPlayer));
		start.addActionListener(new StartGame(this, list, done));
		done.addActionListener(actionDone);	
		back.addActionListener(new BackSettingsMenu(this,NewGameMenu.getClip()));
		image.add(start);		
		left.add(setPlayers);
		left.add(image);				
		right.add(player1);
		right.add(player2);
		right.add(player3);
		right.add(player4);
		right.add(done);
		left.add(back);
		this.add(right,BorderLayout.EAST);
		this.add(left, BorderLayout.WEST);		
/**
 * Stops the music of the game in case at the
 * beginning you have chosen audio off.		
 */
		action.musicStop(NewGameMenu.getAudio(), clip);
		clip.getMusicMenu().stop();								
	}
}
	
