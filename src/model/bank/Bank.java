package model.bank;

import model.propertiesDeck.DeckPropertiesCardsImpl;
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
    void addCard(DeckPropertiesCardsImpl c);
    /**
     * 
     * @param i
     * @return this method set the value of money of the bank.
     */
    int setAmount(int i);
    }