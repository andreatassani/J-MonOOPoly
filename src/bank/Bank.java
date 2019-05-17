package bank;

import deck.DeckPropertiesCardsImpl;
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
    }
