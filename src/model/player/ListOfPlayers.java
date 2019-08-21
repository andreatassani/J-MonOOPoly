package model.player;


import java.awt.Color;

import java.util.ArrayList;


import model.allTypeOfCard.Entity;
import model.allTypeOfCard.Property;
import model.myEnum.Pawns;
import view.play.MainExternContainerImpl;
import view.winner.Winner;

public class ListOfPlayers {
/**
 * fields
 */
    private final ArrayList<PlayerImpl> list = new ArrayList<>();
    private int numberOfPlayers;
    private int currentPlayer = 1;
/**
 * constructor
 */
    public ListOfPlayers() {
        final PlayerImpl bank = new PlayerImpl("Bank", Color.WHITE, Pawns.BANK, "EASY");
        bank.setMoney(500000);
        this.list.add(bank);
    }
/**
 * updates the value of (int)currentPlayer 
 */
   public void nextPlayer() {
       if(currentPlayer == (numberOfPlayers)) {
           currentPlayer = 1;
       }
       else {
           currentPlayer++;
       }
   }
/**  
 * 
 * @return the PlayerImpl with index '0': the Bank
 */
   public PlayerImpl getBank() {
       return this.getPlayerFromIndex(0);
   }
/**
 *     
 * @param pl
 * @return the index of the PlayerImpl pl in the ArrayList of players
 */
   public int getIndexFromPlayer(final PlayerImpl pl) {
       return list.indexOf(pl);
   }
/**
 * 
 * @return the player who is playing now
 */
   public PlayerImpl getCurrentPlayer() {
       return this.list.get(currentPlayer);
   }
/**
 * 
 * @param index
 * @return the PlayerImpl with index index in the Arraylist of players
 */
   public PlayerImpl getPlayerFromIndex (final int index) {
       return list.get(index);
   }
/**
 * adds the PlayerImpl pl to the ArrayList of players at the index index and updates the value of numberOfPlayers
 * @param pl
 * @param index
 */
   public void addPlayer(final PlayerImpl pl,final int index) {
       list.add(index, pl);
       this.numberOfPlayers+=1;
   }
/**
 * 
 * @return the number of players without the bank
 */
   public int getNumberPlayer() {
       return this.numberOfPlayers;
   }
/**
 * removes the PlayerImpl pl from the arrayList of players and updates all the other values (currentPlayer, numberOfPlayers) and 
 * resents the field 'owner' of the properties of pl with the bank
 * @param pl
 */
   public void removePlayer(final PlayerImpl pl) {
       if(this.getIndexFromPlayer(pl) == this.numberOfPlayers) {
           this.currentPlayer = 1;
           this.numberOfPlayers-=1;
           list.remove(this.getIndexFromPlayer(pl));
       } else {
           list.remove(this.getIndexFromPlayer(pl));
           this.numberOfPlayers-=1;
       }
       for(final Property pr : pl.getListOfProperties()) {
           pr.setNewOwner(this.getBank());
       }
       }
/** 
 * if there is only one player left, he's the winner and the screen of winning is showed
 * @param list
 * @param deck
 * @param main
 */
   public void isThereAWinner(final ListOfPlayers list,final ArrayList<Entity> deck,final MainExternContainerImpl main) {
       if(this.numberOfPlayers == 1) {
           new Winner(list, deck, main);
       }
   }
/**
 * 
 * @param name
 * @return the (Object)PlayerImpl from his (String)name
 */
   public PlayerImpl getPlayerFromName(final String name) {
       for(int i = 1; i<= numberOfPlayers; i++) {
           if(this.list.get(i).getName().equals(name)) {
               return this.list.get(i);
           }
       }
       System.out.println("Utente non trovato!");
       return null;
   }
/**
 * Check if there are two players with the same pawn or color or name.   
 * @return false if they are true to the contrary
 */
   public boolean isPresentSameCustum() {
	   boolean res = true;
	   for(int i = 1;i<numberOfPlayers+1;i++ ) {
		   if(getPlayerFromIndex(i-1).getPawn().equals(getPlayerFromIndex(i).getPawn()) || 
				   getPlayerFromIndex(i-1).getColors().equals(getPlayerFromIndex(i).getColors()) || 
				   			getPlayerFromIndex(i-1).getName().equals(getPlayerFromIndex(i).getName())) {
			   res = false;
		   }
	   }
	   return res;
   }
/**
 * Removes all players from the list 
 * and re-enters the bank.   
 */
   public void removeAllPlayers() { 
		   list.clear();
		   final PlayerImpl bank = new PlayerImpl("Bank", Color.WHITE, Pawns.BANK, "EASY");
		   numberOfPlayers = 0;
	       bank.setMoney(500000);
		   this.list.add(bank);
   }

/**
 * Check if the list of players is empty.
 * @return true if is empty
 */
   public boolean isEmpty() {
		  boolean res = false;
		  if(numberOfPlayers == 0) {
			  res = true;
		  }
		  return res;
			  
	  }


}
