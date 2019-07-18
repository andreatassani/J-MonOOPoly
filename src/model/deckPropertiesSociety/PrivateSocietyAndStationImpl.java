package model.deckPropertiesSociety;

import model.player.Player;
/**
 * {@inheritDoc}.
 */
public class PrivateSocietyAndStationImpl implements PrivateSocietyAndStation {
    private String name;
    private Player owner;
    private int value;
    /**
     * {@inheritDoc}
     */
    public void setName(final String n) {
        this.name = n;
    }
    /**
     * {@inheritDoc}
     */
    public void setOwner(final Player o) {
        this.owner = o;
    }
    /**
     * {@inheritDoc}
     */
    public void setValue(final int i) {
        this.value = i;
    }
    /**
     * {@inheritDoc}
     */
    public String getName() {
        return this.name;
    }
    /**
     * {@inheritDoc}
     */
    public Player getOwner() {
        return this.owner;
    }
    /**
     * {@inheritDoc}
     */
    public int getValue() {
        return this.value;
    }
    //LEGGI I COMMENTI CHE TI HO SCRITTO NELLA CLASSE DeckPropertiesImpl
}
