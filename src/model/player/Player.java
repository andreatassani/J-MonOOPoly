package model.player;


import java.awt.Color;

import model.allTypeOfCard.Property;
import model.myEnum.Pawns;

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
* Colors creation.
* @return the type of Colors chosen.
*/	
	Color getColors();
/**
 * Name creation.
 * @return the name chosen.
 */		
	String getName(); 
/**
 * @param money
 * money setting.
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
 * removes the property from the list of the playerImpl "pl" and adds it to the list of the current player.
 * 
 */
	void buyProperty(Property property);
/**
 * @param property
 * removes the property from the list of the current player.
 * 
 */
void removeProperty(Property property);
/**
 * @param player
 * set the position of the current player.
 * 
 */
void setPosition(int pos);
/**
 * 
 * @return the current player position.
 */
int getPosition();


}
