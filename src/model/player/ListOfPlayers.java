package model.player;

import java.util.ArrayList;


import model.allTypeOfCard.Entity;
import view.play.MainExternContainerImpl;

public interface ListOfPlayers {


/**
 * updates the value of (int)currentPlayer 
 */
   public void nextPlayer();
/**  
 * 
 * @return the PlayerImpl with index '0': the Bank
 */
   public PlayerImpl getBank();
/**
 *     
 * @param pl
 * @return the index of the PlayerImpl pl in the ArrayList of players
 */
   public int getIndexFromPlayer(final PlayerImpl pl);
/**
 * 
 * @return the player who is playing now
 */
   public PlayerImpl getCurrentPlayer();
/**
 * 
 * @param index
 * @return the PlayerImpl with index index in the Arraylist of players
 */
   public PlayerImpl getPlayerFromIndex (final int index);
/**
 * adds the PlayerImpl pl to the ArrayList of players at the index index and updates the value of numberOfPlayers
 * @param pl
 * @param index
 */
   public void addPlayer(final PlayerImpl pl,final int index);
/**
 * 
 * @return the number of players without the bank
 */
   public int getNumberPlayer();
/**
 * removes the PlayerImpl pl from the arrayList of players and updates all the other values (currentPlayer, numberOfPlayers) and 
 * resents the field 'owner' of the properties of pl with the bank
 * @param pl
 */
   public void removePlayer(final PlayerImpl pl);
/** 
 * if there is only one player left, he's the winner and the screen of winning is showed
 * @param list
 * @param deck
 * @param main
 */
   public void isThereAWinner(final ListOfPlayersImpl list,final ArrayList<Entity> deck,final MainExternContainerImpl main);
/**
 * 
 * @param name
 * @return the (Object)PlayerImpl from his (String)name
 */
   public PlayerImpl getPlayerFromName(final String name);
/**
 * Check if there are two players with the same pawn or color or name.   
 * @return false if they are true to the contrary
 */
   public boolean isPresentSameCustum();
/**
 * Removes all players from the list 
 * and re-enters the bank.   
 */
   public void removeAllPlayers();

/**
 * Check if the list of players is empty.
 * @return true if is empty
 */
   public boolean isEmpty();

}
