package model.player;

public interface ListOfPlayers {
	
	
	
   Player getPlayer (int index);
   
   
   void addPlayer(Player player);
   
   void removePlayer(int index);
   
   int getNumberPlayer();
   

}
