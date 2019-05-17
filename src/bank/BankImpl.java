package bank;

import java.util.ArrayList;

import deck.DeckPropertiesCardsImpl;
/**
 * {@inheritDoc}.
 */
public class BankImpl implements Bank {
    
    private ArrayList<DeckPropertiesCardsImpl> allProperties = new ArrayList<DeckPropertiesCardsImpl>();
    /**
     * {@inheritDoc}.
     */
    @Override
    public void addCard(final DeckPropertiesCardsImpl c) {
       allProperties.add(c);
    }

}
