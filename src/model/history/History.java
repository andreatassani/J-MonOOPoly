package model.history;

import javax.swing.JButton;

import model.allTypeOfCard.Entity;
import model.player.Player;
import model.player.PlayerImpl;
/**
* Interface for managing the history gui.
* 
*
*/

public interface History {
/**
* 
* print the position of the player.
*/
void printPositionPlayer (Player player, int card);
/**
* 
* print a message of the start of the game.
*/
void printStartGame ();
/**
* 
* print a message of successful sale.
*/
void buyPropriety (Player player,Entity entity);
/**
* 
* print a message at the beginning of the turn.
*/
void startTurn (PlayerImpl player);

}
