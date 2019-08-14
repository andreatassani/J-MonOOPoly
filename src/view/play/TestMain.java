package view.play;

import java.awt.Color;

import model.allTypeOfCard.EntityDeck;
import model.player.ListOfPlayers;
import model.player.PlayerImpl;
import model.utility.Pawns;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListOfPlayers players = new ListOfPlayers();
		players.addPlayer(new PlayerImpl("Mic", Color.BLACK, Pawns.BALL), 1);
//		players.addPlayer(new PlayerImpl("Fab", Color.WHITE, Pawns.BANK), 2);
		
		EntityDeck deck = new EntityDeck(players.getPlayerFromIndex(0));
		
		
		MainExternContainer main = new MainExternContainer(players, deck.getDeck());
	}

}
