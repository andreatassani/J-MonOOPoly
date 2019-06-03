package model.bank;

import java.util.ArrayList;

import model.propertiesDeck.DeckPropertiesCardsImpl;
/**
 * {@inheritDoc}.
 */
public class BankImpl implements Bank {
    
    private ArrayList<DeckPropertiesCardsImpl> allProperties = new ArrayList<DeckPropertiesCardsImpl>();
    private int amount;
    /**
     * {@inheritDoc}.
     */
    @Override
    public void addCard(final DeckPropertiesCardsImpl c) {
       allProperties.add(c);
    }
    /**
     * {@inheritDoc}
     */
    public int setAmount(final int i) {
        return this.amount += i;
    }
}
