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
void printPositionPlayer (PlayerImpl player, int card);
/**
* 
* print a message of the start of the game.
*/
void printStartGame ();
/**
* 
* print a message of successful sale.
*/
void buyPropriety (PlayerImpl player);
/**
* 
* print a message at the beginning of the turn.
*/
void startTurn (PlayerImpl player);



void chance (PlayerImpl player, int amount);

void lost (PlayerImpl player);

void tollHouses (PlayerImpl player,int price,int nHouses,PlayerImpl owner);

void tollHotel (PlayerImpl player, int price, PlayerImpl owner);

void buildHotel(PlayerImpl player ,int pos);

void buildHouse(PlayerImpl player ,int pos);

void sellPropriety(PlayerImpl player);

}