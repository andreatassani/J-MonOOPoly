package model.player;

import model.allTypeOfCard.Property2;
import model.utility.Colors;
import model.utility.Pawns;

/**
 * Interface for player management.
 * 
 *
 */
public interface Player {
/**
 * Pawn creation.
 * @return the type of pawn chosen.
 */
Pawns getPawn(); 
/**
 * @param pawns
 * Pawns setting.
 * 
 */
Colors getColors();
 /**
  * @param color
  * Colors setting.
  * 
  */
String getName(); 
 /**
  * @param name
  * Name setting.
  * 
  */
void setMoney(int money);
/**
 * @param money
 * returns the player's money.
 * 
 */
int getMoney();
/**
 * @param turns
 * number of turns in which player can't move.
 * 
 */
void setStopTurns(int turns);
/**
 * @param turns
 * returns the number of turns the player has to wait.
 * 
 */
int getStopTurns();
/**
 * @param property pl
 * removes the property from the list of the player "pl" and adds it to the list of the current player.
 * 
 */
void buyProperty(Property2 property, Player pl);
/**
 * @param property
 * removes the property from the list of the current player.
 * 
 */
void removeProperty(Property2 property);




}
