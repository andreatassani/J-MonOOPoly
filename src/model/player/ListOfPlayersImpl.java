package model.player;


import java.awt.Color;

import java.util.ArrayList;


import model.allTypeOfCard.Entity;
import model.allTypeOfCard.Property;
import model.myEnum.Pawns;
import view.play.MainExternContainerImpl;
import view.winner.Winner;

public class ListOfPlayersImpl implements ListOfPlayers{
/**
 * fields
 */
    private final ArrayList<PlayerImpl> list = new ArrayList<>();
    private int numberOfPlayers;
    private int currentPlayer = 1;
/**
 * constructor
 */
    public ListOfPlayersImpl() {
        final PlayerImpl bank = new PlayerImpl("Bank", Color.WHITE, Pawns.BANK, "EASY");
        bank.setMoney(500000);
        this.list.add(bank);
    }
/**
 * {@inheritDoc}
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
    * {@inheritDoc}
    */   
   public PlayerImpl getBank() {
       return this.getPlayerFromIndex(0);
   }
   /**
    * {@inheritDoc}
    */
   public int getIndexFromPlayer(final PlayerImpl pl) {
       return list.indexOf(pl);
   }
   /**
    * {@inheritDoc}
    */
   public PlayerImpl getCurrentPlayer() {
       return this.list.get(currentPlayer);
   }
   /**
    * {@inheritDoc}
    */
   public PlayerImpl getPlayerFromIndex (final int index) {
       return list.get(index);
   }
   /**
    * {@inheritDoc}
    */
   public void addPlayer(final PlayerImpl pl,final int index) {
       list.add(index, pl);
       this.numberOfPlayers+=1;
   }
   /**
    * {@inheritDoc}
    */
   public int getNumberPlayer() {
       return this.numberOfPlayers;
   }
   /**
    * {@inheritDoc}
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
    * {@inheritDoc}
    */
   public void isThereAWinner(final ListOfPlayersImpl list,final ArrayList<Entity> deck,final MainExternContainerImpl main) {
       if(this.numberOfPlayers == 1) {
           new Winner(list, deck, main);
       }
   }
   /**
    * {@inheritDoc}
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
    * {@inheritDoc}
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
    * {@inheritDoc}
    */
   public void removeAllPlayers() { 
		   list.clear();
		   final PlayerImpl bank = new PlayerImpl("Bank", Color.WHITE, Pawns.BANK, "EASY");
		   numberOfPlayers = 0;
	       bank.setMoney(500000);
		   this.list.add(bank);
   }

   /**
    * {@inheritDoc}
    */
   public boolean isEmpty() {
		  boolean res = false;
		  if(numberOfPlayers == 0) {
			  res = true;
		  }
		  return res;
			  
	  }


}
