package model.player;

import java.util.ArrayList;

public class ListOfPlayers {
	
    ArrayList<Player> listOfPlayers = new ArrayList<>();
    private int numberOfPlayers;
	
   Player getPlayer (int index) {
       return listOfPlayers.get(index);
   }
   
   void addPlayer(Player pl) {
       listOfPlayers.add(pl);
       this.numberOfPlayers+=1;
   }
   void addBank(Player pl) {
       listOfPlayers.add(4, pl);
   }
   
   void removePlayer(int index) {
       listOfPlayers.remove(index);
       this.numberOfPlayers-=1;
   }
   
   int getNumberPlayer() {
       return this.numberOfPlayers;
   }
   

}
