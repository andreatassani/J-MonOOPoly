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
		players.addPlayer(new PlayerImpl("Fab", Color.BLACK, Pawns.BALL), 1);
		players.addPlayer(new PlayerImpl("Andre", Color.WHITE, Pawns.MOTO), 2);
//		players.addPlayer(new PlayerImpl("Mic", Color.GREEN, Pawns.PEN), 3);
//                players.addPlayer(new PlayerImpl("Enri", Color.BLUE, Pawns.IRON), 4);
                
		EntityDeck deck = new EntityDeck(players.getPlayerFromIndex(0));
		MainExternContainer main = new MainExternContainer(players, deck.getDeck());
	}

}
