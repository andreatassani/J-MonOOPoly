package application;



import java.awt.Color;

import model.allTypeOfCard.EntityDeck;
import model.player.ListOfPlayers;
import model.player.PlayerImpl;
import model.utility.Pawns;
import view.menu.HowToPlay;
import view.menu.MainMenu;
import view.menu.MenuGui;
import view.menu.SettingPlayersMenu;
import view.menu.MenuGui;

import view.play.MainExternContainer;


/**
 * class for launching the application
 */
public class LauncherApplication {
	/**
	 * constructor for this class
	 */
	LauncherApplication() {

	}
	/**
     * main method to run the view
     */
    public static void main(final String[] args) {
        /**
         * run the game
         */
        ListOfPlayers listPl = new ListOfPlayers();
        listPl.addPlayer(new PlayerImpl("Fabio", Color.BLACK, Pawns.APPLE), 1);
        listPl.addPlayer(new PlayerImpl("Andrea", Color.WHITE, Pawns.BALL), 2);
        listPl.addPlayer(new PlayerImpl("Michele", Color.BLUE, Pawns.BIKE), 3);
        listPl.addPlayer(new PlayerImpl("Enrico", Color.CYAN, Pawns.CAR), 4);
        EntityDeck deck = new EntityDeck(listPl.getPlayerFromIndex(0));
    	

   MainExternContainer mnply = new MainExternContainer(listPl, deck.getDeck());
    	
    }
}
