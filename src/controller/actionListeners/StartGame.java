package controller.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.html.parser.Entity;

import model.allTypeOfCard.EntityDeck;
import model.player.ListOfPlayers;
import view.menu.MenuGui;
import view.play.MainExternContainerImpl;
/**
 * Class that implements the action of the
 * "Start game" button.
 */
public class StartGame implements ActionListener {
/**
 * Class fields.
 */
    private JFrame frame;
    private ListOfPlayers list;
    private ArrayList<Entity> deck;
/**
 * Class builder    
 * @param frame to close
 * @param list of player participating in the game
 * @param deck list of all cells
 */       
	public StartGame(JFrame frame, ListOfPlayers list, ArrayList<Entity> deck) {
		super();
		this.frame = frame;
		this.list = list;
		this.deck = deck;
	}
/**
 * Check that the list of players is created correctly in the positive 
 * case i create the playing field.
 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(list.isEmpty()) {
			JOptionPane.showMessageDialog(null,"Nessun giocatore selezionato \n per favore inserisci il numero di giocatori corretto");
		}
		else if ( list.isPresentSameColor() && list.isPresentSameName() && list.isPresentSamePawn() ) {
    	      frame.dispose();
    	      EntityDeck deck = new EntityDeck(list.getPlayerFromIndex(0));
	    	  new MenuGui(new MainExternContainerImpl(list, deck.getDeck()));	    	  
    		  } else {
    				  JOptionPane.showMessageDialog(null,"Hai selezionato una pedina o un colore o un nome già selezionato \n oppure hai scelto la banca  ");
        			  list.removeAllPlayers();
    		                 }
		  
    			  

    		  }
		
	}
	
	


