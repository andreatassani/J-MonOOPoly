package view.menu;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.text.html.parser.Entity;

import controller.actionListeners.BackFromSettingsMenu;

import controller.actionListeners.NumberOfPlayer;
import controller.actionListeners.StartGame;
import controller.audio.AudioManager;
import controller.menu.ControllerSettingPlayersMenu;
import model.allTypeOfCard.EntityDeck;
import model.myEnum.Colors;
import model.myEnum.Pawns;
import model.player.ListOfPlayers;
import view.play.MainExternContainerImpl;


/**
 * 
 * Class for the setting player menu.
 *
 */
	public class SettingPlayersMenu extends JFrame{				
/**
 * SettingPlayersMenu fields.
 */
		
		private CustomMethodsImpl methods = new CustomMethodsImpl();
		private static final int width = Toolkit.getDefaultToolkit().getScreenSize().width;
		private static final int height = Toolkit.getDefaultToolkit().getScreenSize().height;
		private static final Dimension dimPlayer = new Dimension(width/2,height);
		private static final Dimension dimName = new Dimension(width/5,height/28);
		private static final Dimension dimCombo = new Dimension(width/10,height/28);
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
		private ImageIcon icon = new ImageIcon("res/setGame.png");
		private ControllerSettingPlayersMenu action;
		private ArrayList<Entity> deck;
		private ListOfPlayers list = new ListOfPlayers();
		private  AudioManager clip;	
		private JButton done;
		private JButton howManyPlayer = new JButton("4");
		private String namePlayer;		
/**
* Constructor of the main menu.
*/					
	public SettingPlayersMenu() {	

/**
 * Set the layout and measurements of 
 * two JLabels containing a button, image, 
 * JFieldTextArea and a JComboCheckBox.
 */
		this.namePlayer = "Name Player";
		this.done = new JButton("DONE");
		this.clip = new AudioManager();
		this.deck = new ArrayList<Entity>(0);
		this.action = new ControllerSettingPlayersMenu();
		this.setLayout(new BorderLayout());
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
		right.setBackground(methods.getBackground());
		left.setBackground(methods.getBackground());
		setPlayers.setBackground(methods.getBackground());
		
		namePlayer1.setText(namePlayer);
		namePlayer2.setText(namePlayer);
		namePlayer3.setText(namePlayer);
		namePlayer4.setText(namePlayer);


	      
	      ActionListener actionDone = (e)->{	
	    	  
	    	if(howManyPlayer.getText().equals("4")) {
	    	list.addPlayer(action.start(namePlayer1.getText(),action.chosenColor(color1.getSelectedIndex()) , 
	    			action.chosenPawn(pawn1.getSelectedIndex())), list.getNumberPlayer()+1);
	    	list.addPlayer(action.start(namePlayer2.getText(),action.chosenColor(color2.getSelectedIndex()) , 
	    			action.chosenPawn(pawn2.getSelectedIndex())), list.getNumberPlayer()+1);
	    	list.addPlayer(action.start(namePlayer3.getText(),action.chosenColor(color3.getSelectedIndex()) , 
	    			action.chosenPawn(pawn3.getSelectedIndex())), list.getNumberPlayer()+1);
	    	list.addPlayer(action.start(namePlayer4.getText(), action.chosenColor(color4.getSelectedIndex()) , 
	    			action.chosenPawn(pawn4.getSelectedIndex())), list.getNumberPlayer()+1);
	    	}
	    	
	    	if(howManyPlayer.getText().equals("3")) {
	    		list.addPlayer(action.start(namePlayer1.getText(),action.chosenColor(color1.getSelectedIndex()) , 
	    				action.chosenPawn(pawn1.getSelectedIndex())), list.getNumberPlayer()+1);
	    		list.addPlayer(action.start(namePlayer2.getText(),action.chosenColor(color2.getSelectedIndex()) , 
	    			    action.chosenPawn(pawn2.getSelectedIndex())), list.getNumberPlayer()+1);
	    		list.addPlayer(action.start(namePlayer3.getText(),action.chosenColor(color3.getSelectedIndex()) , 
	    			    action.chosenPawn(pawn3.getSelectedIndex())), list.getNumberPlayer()+1);
	    	}
	    	
	    	if(howManyPlayer.getText().equals("2")) {
	    		list.addPlayer(action.start(namePlayer1.getText(),action.chosenColor(color1.getSelectedIndex()) , 
	    				action.chosenPawn(pawn1.getSelectedIndex())), list.getNumberPlayer()+1);
	    		list.addPlayer(action.start(namePlayer2.getText(),action.chosenColor(color2.getSelectedIndex()) , 
	    			    action.chosenPawn(pawn2.getSelectedIndex())), list.getNumberPlayer()+1);
	    	}
	  
		      };
		      ActionListener actionStart = (e)->{
		    	  	
		    		  if( list.isPresentSameColor() && list.isPresentSameName() && list.isPresentSamePawn() ) {
		    	      this.dispose();
		    	      EntityDeck deck = new EntityDeck(list.getPlayerFromIndex(0));
			    	  new MenuGui(new MainExternContainerImpl(list, deck.getDeck()));
		    		  }else {
		    			  JOptionPane.showMessageDialog(null,"hai selezionato una pedina o un colore o un nome già selezionato ");
		    			  list.removeAllPlayers();

		    		  }
		      };
		      
		      ActionListener actionNum = (e)->{	
		    	  action.numPlayer(howManyPlayer, player3, player4);
		    	  
					
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
		methods.setMyPanel(left, dimPlayer);
		methods.setMyPanel(right, dimPlayer);
		methods.createSetPlayer(player1, namePlayer1, color1, pawn1,methods.getFont());
		methods.createSetPlayer(player2, namePlayer2, color2, pawn2,methods.getFont());
		methods.createSetPlayer(player3, namePlayer3, color3, pawn3,methods.getFont());
		methods.createSetPlayer(player4, namePlayer4, color4, pawn4,methods.getFont());		
		methods.createNumPlayerPanel(setPlayers, numPlayer, howManyPlayer ,methods.getFont());
/**
 * I add all the panels to the main panel
 */		
		howManyPlayer.addActionListener(new NumberOfPlayer(player3, player4, howManyPlayer));
		start.addActionListener(new StartGame(this, list, deck));
		done.addActionListener(actionDone);	
		back.addActionListener(new BackFromSettingsMenu(this,NewGameMenu.getClip()));
		image.add(start);		
		right.add(setPlayers);
		right.add(image);				
		left.add(player1);
		left.add(player2);
		left.add(player3);
		left.add(player4);
		left.add(done);
		right.add(back);
		this.add(left,BorderLayout.EAST);
		this.add(right, BorderLayout.WEST);	

		
/**
 * 		
 */

		action.musicStop(NewGameMenu.getAudio(), clip);
		clip.getMusicMenu().stop();
		
		
		
		

	}



	



	
}
	
