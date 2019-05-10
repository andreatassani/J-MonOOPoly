package bank;

import java.util.ArrayList;

import decProperties.PropertiesCardsImpl;
/**
 * {@inheritDoc}.
 */
public class BankImpl implements Bank {
    
    private ArrayList<PropertiesCardsImpl> allProperties = new ArrayList<PropertiesCardsImpl>();
    /**
     * {@inheritDoc}.
     */
    @Override
    public void addCard(final PropertiesCardsImpl c) {
       allProperties.add(c);
    }

}
