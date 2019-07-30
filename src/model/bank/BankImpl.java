package model.bank;

import java.util.ArrayList;



import model.deckPropertiesSociety.*;
/**
 * {@inheritDoc}.
 */
public class BankImpl implements Bank {
    
    private ArrayList<Property> allProperties = new ArrayList<Property>();
    private int amount;
    /**
     * {@inheritDoc}.
     */
    @Override
    public void addCard(final Property c) {
       allProperties.add(c);
    }
    /**
     * {@inheritDoc}
     */
    public int setAmount(final int i) {
        return this.amount += i;
    }
}
