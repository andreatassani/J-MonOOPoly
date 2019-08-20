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
    
/**
 * Class builder    
 * @param frame to close
 * @param list of player participating in the game
 * @param deck list of all cells
 */       
	public StartGame(final JFrame frame,final ListOfPlayers list) {
		super();
		this.frame = frame;
		this.list = list;
		
	}
/**
 * Check that the list of players is created correctly in the positive 
 * case i create the playing field.
 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(list.isEmpty()) {
			JOptionPane.showMessageDialog(null,"No player selected please enter the correct number of players and press done");
		}
		else if ( list.isPresentSameCustum() ) {
    	      frame.dispose();
    	      EntityDeck deck = new EntityDeck(list.getPlayerFromIndex(0));
	    	  new MenuGui(new MainExternContainerImpl(list, deck.getDeck()));	    	  
    		  } else {
    				  JOptionPane.showMessageDialog(null," You have selected a pawn or a color or a name already selected ");
        			  list.removeAllPlayers();
    		                 }
		  
    			  

    		  }
		
	}
	
	


