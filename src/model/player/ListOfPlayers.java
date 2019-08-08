package model.player;

import java.util.ArrayList;

public class ListOfPlayers {
	
    ArrayList<PlayerImpl> listOfPlayers = new ArrayList<>();
    private int numberOfPlayers;
    private int currentPlayer = 0;
    
   public void nextPlayer() {
       if(currentPlayer == (numberOfPlayers-1)) {
           currentPlayer = 0;
       }
       else {
           currentPlayer++;
       }
   }
    
   public PlayerImpl getCurrentPlayer() {
       return this.listOfPlayers.get(currentPlayer);
   }
   public PlayerImpl getPlayer (int index) {
       return listOfPlayers.get(index);
   }
   
   public void addPlayer(PlayerImpl pl, int index) {
       listOfPlayers.add(index, pl);
       this.numberOfPlayers+=1;
   }
   public void addBank(PlayerImpl pl) {
       listOfPlayers.add(4, pl);
   }
   
   public void removePlayer(int index) {
       listOfPlayers.remove(index);
       this.numberOfPlayers-=1;
   }
   
   public int getNumberPlayer() {
       return this.numberOfPlayers;
   }
   

}
