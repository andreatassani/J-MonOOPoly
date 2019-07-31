package model.player;

import model.utility.Colors;
import model.utility.Pawns;

/**
 * Interface for player creation management.
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
void setPawns(Pawns pawns);
 /**
  * Color creation.
  * @return the player's color.
  */
Colors getColors();
 /**
  * @param color
  * Colors setting.
  * 
  */
void setColor(Colors color);
 /**
  * Name creation.
  * @return the player's name.
  */
String getName(); 
 /**
  * @param name
  * Name setting.
  * 
  */
void setName(String name);
/**
 * @param money
 * set the player's money.
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
}
