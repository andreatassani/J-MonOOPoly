package model.bank;

import model.deckPropertiesSociety.*;
/**
 * 
 * interface of the bank.
 *
 */
public interface Bank {
    /**
     * @param c
     * method to add card to the bank at start of the game.
     */
    void addCard(Property c);
    /**
     * 
     * @param i
     * @return this method set the value of money of the bank.
     */
    int setAmount(int i);
    }