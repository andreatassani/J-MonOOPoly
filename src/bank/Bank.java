package bank;

import decProperties.PropertiesCardsImpl;
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
    void addCard(PropertiesCardsImpl c);
    }
