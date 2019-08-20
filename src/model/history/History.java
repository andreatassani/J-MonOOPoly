package model.history;

import javax.swing.JButton;

import model.allTypeOfCard.Entity;
import model.player.Player;
import model.player.PlayerImpl;
/**
* Interface for managing the history GUI messages.
* 
*
*/

public interface History {
/**
* 
* print the position of the player.
* @param player is the subject of history message.
* @param card is the number of the deck's card.
*/
void printPositionPlayer (PlayerImpl player, int card);
/**
* 
* print a message of the start of the game.
*/
void printStartGame ();
/**
* 
* print a message of successful sale.
* @param player is the subject of history message.
*/
void buyPropriety (PlayerImpl player);
/**
* 
* print a message at the beginning of the turn.
* @param player is the subject of history message.
*/
void startTurn (PlayerImpl player);
/**
* 
* print a chance message if you ended up into chance position.
* chance can give you or take away money.
* @param player is the subject of history message.
* @param amount is the quantity of money to give/take away .
*/
void chance (PlayerImpl player, int amount);
/**
* 
* print a message if you ended up into tax position.
* @param player is the subject of history message.
*/
void lost (PlayerImpl player);
/**
* 
* print a message if you ended up into other player's property.
* @param player is the subject of history message.
* @param price is used to calculate the total amount of tool.
* @param nHouses is used to calculate the total amount of tool.
* @param owner is the other subject of history message.
* 
*/
void tollHouses (PlayerImpl player,int price,int nHouses,PlayerImpl owner);
/**
* 
*print a message if you ended up into other player's property.
* @param player is the subject of history message.
* @param price is used to calculate the total amount of tool.
* @param nHouses is used to calculate the total amount of tool.
* @param owner is the other subject of history message.
* 
*/
void tollHotel (PlayerImpl player, int price, PlayerImpl owner);
/**
* 
* print a message if you build an hotel.
* @param player is the subject of history message.
* @param pos is position of the hotel.
*/
void buildHotel(PlayerImpl player ,int pos);
/**
* 
* print a message if you build an house.
* @param player is the subject of history message.
* @param pos is position of the house.
*/
void buildHouse(PlayerImpl player ,int pos);
/**
* 
* print a message if you sell a property.
* @param player is the subject of history message.
* 
*/
void sellPropriety(PlayerImpl player);
/**
* 
* print a message if a player passes by the start.
* @param player is the subject of history message.
* 
*/
void start(PlayerImpl player);
/**
* 
* print a message if a player ended up into police position.
* @param player is the subject of history message.
* @param turn is the number of turn you have to stay in prison.
* 
*/
void stop(PlayerImpl player,int turn);
/**
* 
* print a message if a player can go out to the prison.
* @param player is the subject of history message.
* 
*/
void endStop(PlayerImpl player);
/**
* 
* print a message when a player loses.
* @param player is the subject of history message.
* 
*/
void losePlayer(PlayerImpl player);

}