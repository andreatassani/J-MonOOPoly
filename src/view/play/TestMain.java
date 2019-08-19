package view.play;

import java.awt.Color;

import model.allTypeOfCard.EntityDeck;
import model.allTypeOfCard.Property;
import model.player.ListOfPlayers;
import model.player.PlayerImpl;
import view.winner.Winner;
import model.myEnum.Pawns;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        
		ListOfPlayers players = new ListOfPlayers();
		EntityDeck deck = new EntityDeck(players.getPlayerFromIndex(0));
		players.addPlayer(new PlayerImpl("Fabio", Color.PINK, Pawns.BALL), 1);
		players.addPlayer(new PlayerImpl("Andrea", Color.BLUE, Pawns.MOTO), 2);
		players.addPlayer(new PlayerImpl("Michele", Color.GREEN, Pawns.PEN), 3);
        players.addPlayer(new PlayerImpl("Enrico", Color.RED, Pawns.IRON), 4);
        MainExternContainerImpl main = new MainExternContainerImpl(players, deck.getDeck());
		
//		players.getPlayerFromIndex(1).buyProperty((Property) (deck.getDeck().get(3)));
//		players.getPlayerFromIndex(1).buyProperty((Property) (deck.getDeck().get(19)));
//		players.getPlayerFromIndex(1).buyProperty((Property) (deck.getDeck().get(21)));
//		players.getPlayerFromIndex(1).buyProperty((Property) (deck.getDeck().get(31)));
//		players.getPlayerFromIndex(1).buyProperty((Property) (deck.getDeck().get(39)));
//		players.getPlayerFromIndex(1).buyProperty((Property) (deck.getDeck().get(8)));
//		players.getPlayerFromIndex(1).buyProperty((Property) (deck.getDeck().get(15)));
//		players.getPlayerFromIndex(1).buyProperty((Property) (deck.getDeck().get(23)));
//		players.getPlayerFromIndex(1).buyProperty((Property) (deck.getDeck().get(13)));
//		players.getPlayerFromIndex(1).buyProperty((Property) (deck.getDeck().get(11)));
//		players.getPlayerFromIndex(1).buyProperty((Property) (deck.getDeck().get(9)));
//		players.getPlayerFromIndex(1).buyProperty((Property) (deck.getDeck().get(6)));
//		players.getPlayerFromIndex(1).buyProperty((Property) (deck.getDeck().get(1)));
		
		//players.addPlayer(new PlayerImpl("Andrea", Color.BLUE, Pawns.MOTO), 2);
		//players.addPlayer(new PlayerImpl("Michele", Color.GREEN, Pawns.PEN), 3);
                //players.addPlayer(new PlayerImpl("Enrico", Color.RED, Pawns.IRON), 4);
                
		
		
		//Winner main = new Winner(players, deck, null);

	}

}
