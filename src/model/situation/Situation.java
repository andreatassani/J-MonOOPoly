package model.situation;

import model.player.PlayerImpl;
/**
* Interface for managing the situation GUI.
* 
*
*/
public interface Situation {
	/**
	* Set the player's position within the GUI.
	* @param pl
	*
	*/
	void setPosition(PlayerImpl pl);
	/**
	* Set the player's money within the GUI.
	* @param pl
	*
	*/
	void setMoney(PlayerImpl pl);
	/**
	* Set the properties of the player within the GUI.
	* @param pl
	*
	*/
	void setPropriety(PlayerImpl pl);
	/**
	  * Set the properties of the bank within the GUI.
	  * @param pl
	  *
	  */
	 void setBank();
	
	/**
	* 
	*Deactivate the player's buttons
	* @param pl
	*
	*/
	void lose(PlayerImpl pl);
	
}
