package application;



import java.awt.Color;

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
        listPl.addPlayer(new PlayerImpl("Player1", Color.BLACK, Pawns.APPLE), 0);
        listPl.addPlayer(new PlayerImpl("Player2", Color.WHITE, Pawns.BALL), 1);
        listPl.addPlayer(new PlayerImpl("Player3", Color.BLUE, Pawns.BIKE), 2);
        listPl.addPlayer(new PlayerImpl("Player4", Color.CYAN, Pawns.CAR), 3);
        listPl.addBank(new PlayerImpl("Bank", Color.GRAY, Pawns.BUDDHA));
    	

   MainExternContainer mnply = new MainExternContainer(listPl);
    	

    	
    	




    	

    	


    }
}
