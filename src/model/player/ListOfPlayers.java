package model.player;


import java.awt.Color;

import java.util.ArrayList;

import model.utility.Colors;

public class ListOfPlayers {
	 ArrayList<PlayerImpl> list = new ArrayList<>();
	    private int numberOfPlayers;
	    private int currentPlayer = 1;
	    	 
    public ListOfPlayers() {
        PlayerImpl bank = new PlayerImpl("Bank", Colors.BANK, null);
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
   public void removePlayer(int index) {
       list.remove(index);

       this.numberOfPlayers-=1;
   }  
   public int getNumberPlayer() {
       return this.numberOfPlayers;
   }
   public PlayerImpl getPlayerFromName(String name) {
       for(int i = 1; i<= numberOfPlayers; i++) {
           if(this.list.get(i).getName() == name) {
               return this.list.get(i);
           }
       }
       System.out.println("Utente non trovato!");
       return null;
   }


}
