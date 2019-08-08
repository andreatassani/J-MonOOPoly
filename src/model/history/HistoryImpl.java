package model.history;

import model.allTypeOfCard.Entity;
import model.player.Player;

public class HistoryImpl implements History {

	@Override
	public void printPositionPlayer(Player player) {
		System.out.println("" + player.getName() + " è finito nella casella numero " + player.getPosition() + "");
	}

	@Override
	public void printStartGame() {
		System.out.println("La partita è iniziata! Buona fortuna a tutti");
	}

	@Override
	public void buyPropriety(Player player, Entity entity) {
		System.out.println("" + player.getName() + " ha comprato la proprietà " + entity.getName() +"");
		
	}

	@Override
	public void startTurn(Player player) {
		System.out.println("E' il turno di " + player.getName());
		
	}
}

