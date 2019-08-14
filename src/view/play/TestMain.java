package view.play;

import model.allTypeOfCard.EntityDeck;
import model.player.ListOfPlayers;
import model.player.PlayerImpl;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListOfPlayers players = new ListOfPlayers();
		players.addPlayer(new PlayerImpl("Mic", null, null), 1);
		players.addPlayer(new PlayerImpl("Fab", null, null), 1);
		
		EntityDeck deck = new EntityDeck(players.getPlayerFromIndex(0));
		
		
		MainExternContainer main = new MainExternContainer(players, deck.getDeck());
	}

}
