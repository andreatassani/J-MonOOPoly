package model.player;


import java.awt.Color;

import java.util.ArrayList;

import model.utility.Colors;
import model.utility.Pawns;

public class ListOfPlayers {
	 ArrayList<PlayerImpl> list = new ArrayList<>();
	    private int numberOfPlayers;
	    private int currentPlayer = 1;
	    	 
    public ListOfPlayers() {
        PlayerImpl bank = new PlayerImpl("Bank", Color.BLACK, Pawns.BANK);
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
/**
 * Check if there are two players with the same name.
 * @return false if they are true to the contrary
 */
   
   public boolean isPresentSameName() {
	   boolean res = true;
	   for(int i = 1; i< numberOfPlayers; i++) {
		   if(getPlayerFromIndex(i-1).getName().equals(getPlayerFromIndex(i).getName())) {
			   res = false;
		   }
		   
	   }
	   return res;
   }
/**
 * Check if there are two players with the same pawn.   
 * @return false if they are true to the contrary
 */
   public boolean isPresentSamePawn() {
	   boolean res = true;
	   for(int i = 1;i<numberOfPlayers;i++ ) {
		   if(getPlayerFromIndex(i-1).getPawn().equals(getPlayerFromIndex(i).getPawn())) {
			   res = false;
		   }
	   }
	   return res;
   }
/**
 * Check if there are two players with the same color.   
 * @return false if they are true to the contrary
 */
   public boolean isPresentSameColor() {
	   boolean res = true;
	   for(int i = 1; i< numberOfPlayers; i++) {
		   if(getPlayerFromIndex(i-1).getColors().equals(getPlayerFromIndex(i).getColors())) {
			   res = false;
		   }
	   }
	   return res;
   }
   
   public void removeAllPlayers() { 
		   list.clear();
		   PlayerImpl bank = new PlayerImpl("Bank", Color.BLACK, Pawns.BANK);
		   numberOfPlayers = 1;
	        bank.setMoney(500000);
		   this.list.add(bank);
   }
   

   public boolean rightNumberOfPlayers(Integer n) {
	   boolean res = false;
	   if(n.equals(0) && (numberOfPlayers == 2)) {
		   res = true;
	   }
	   if(n.equals(1) && (numberOfPlayers == 3)) {
		   res = true;
	   }
	   if(n.equals(2) && (numberOfPlayers == 4)) {
		   res = true;
	   }
	   return res;
   }
   


}
