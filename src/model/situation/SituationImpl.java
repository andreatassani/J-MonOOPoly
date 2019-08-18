package model.situation;

import java.util.ArrayList;
import java.util.Optional;

import model.allTypeOfCard.Entity;
import model.player.ListOfPlayers;

public class SituationImpl implements Situation {
	
	private final Optional<ListOfPlayers> players;
	private final Optional<ArrayList<Entity>> deck;
	
	
	
	
	
	
	
	
	
	
	
	
	
	public SituationImpl (Optional<ListOfPlayers> players, Optional<ArrayList<Entity>> deck) {
		this.players=players;
		this.deck =deck;
	}
	
	

}
