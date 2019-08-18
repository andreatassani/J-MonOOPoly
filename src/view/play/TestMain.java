package view.play;

import java.awt.Color;

import model.allTypeOfCard.EntityDeck;
import model.player.ListOfPlayers;
import model.player.PlayerImpl;
import model.myEnum.Pawns;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListOfPlayers players = new ListOfPlayers();
		players.addPlayer(new PlayerImpl("Fabio", Color.PINK, Pawns.BALL), 1);
		players.addPlayer(new PlayerImpl("Andrea", Color.BLUE, Pawns.MOTO), 2);
		players.addPlayer(new PlayerImpl("Michele", Color.GREEN, Pawns.PEN), 3);
        players.addPlayer(new PlayerImpl("Enrico", Color.RED, Pawns.IRON), 4);
                
		EntityDeck deck = new EntityDeck(players.getPlayerFromIndex(0));
		
		MainExternContainerImpl main = new MainExternContainerImpl(players, deck.getDeck());
	}

}
