package model.player;


import java.awt.Color;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.allTypeOfCard.Entity;
import model.allTypeOfCard.EntityDeck;
import model.allTypeOfCard.Property;
import model.myEnum.Pawns;
import view.play.MainExternContainerImpl;
import view.winner.Winner;

public class ListOfPlayers {
	 ArrayList<PlayerImpl> list = new ArrayList<>();
	    private int numberOfPlayers=0;
	    private int currentPlayer = 1;
	    	 
    public ListOfPlayers() {
        PlayerImpl bank = new PlayerImpl("Bank", Color.WHITE, Pawns.BANK, "EASY");
        bank.setMoney(500000);
        this.list.add(bank);
    }
    
   public void nextPlayer() {
       if(currentPlayer == (numberOfPlayers)) {
           currentPlayer = 1;

       }
       else {
           currentPlayer++;
       }
   }
   
   public PlayerImpl getBank() {
       return this.getPlayerFromIndex(0);
   }
    
   public int getIndexFromPlayer(PlayerImpl pl) {
       return list.indexOf(pl);
   }
   public PlayerImpl getCurrentPlayer() {
       return this.list.get(currentPlayer);
   }
   public PlayerImpl getPlayerFromIndex (int index) {
       return list.get(index);
   }
   public void addPlayer(PlayerImpl pl, int index) {
       list.add(index, pl);
       this.numberOfPlayers+=1;
   }
   public int getNumberPlayer() {
       return this.numberOfPlayers;
   }
   
   public void removePlayer(PlayerImpl pl) {
       if(this.getIndexFromPlayer(pl) == this.numberOfPlayers) {
           this.currentPlayer = 1;
           this.numberOfPlayers-=1;
           list.remove(this.getIndexFromPlayer(pl));
       } else {
           list.remove(this.getIndexFromPlayer(pl));
           this.numberOfPlayers-=1;
       }
       for(Property pr : pl.getListOfProperties()) {
           pr.setNewOwner(this.getPlayerFromIndex(0));
       }
       }
   
   public void isThereAWinner(ListOfPlayers list, ArrayList<Entity> deck, MainExternContainerImpl main) {
       if(this.numberOfPlayers == 1) {
           new Winner(list, deck, main);
       }
   }
   
   public PlayerImpl getPlayerFromName(String name) {
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
		   PlayerImpl bank = new PlayerImpl("Bank", Color.WHITE, Pawns.BANK, "EASY");
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
