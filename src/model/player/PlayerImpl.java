package model.player;

import java.util.ArrayList;

import model.allTypeOfCard.Property;
import model.utility.Colors;
import model.utility.Pawns;
/**
 * class for creating a player.
 * 
 *
 */

public class PlayerImpl implements Player {
/**
 * player fields.
 */
    private String name;
    private Colors color;
    private Pawns pawns;
    private int money;
    private static final int BANK_AMOUNT = 5500;
    private int stopTurns = 0;
    private ArrayList<Property> properties = new ArrayList<>();
    private int position;
    
    public PlayerImpl(final String name, final Colors color, final Pawns pawns) {
        this.name = name;
        this.position = 0;
        this.color = color;
        this.pawns = pawns;
        this.money = BANK_AMOUNT;
        this.position = 0;
    }
/**
 * {@inheritDoc}
 * 
 */
    public String getName() {
        return this.name;
    }
/**
 * 
 * {@inheritDoc}
 */
    public int getPosition() {
        return this.position;
    }
/**
 * 
 * {@inheritDoc}
 */
    public Colors getColors() {
        return this.color;
    }
/**
 * {@inheritDoc}
 * 
 */
    public Pawns getPawn() {
        return this.pawns;
    }
/**
 * {@inheritDoc}
 * 
 */
    public void setMoney(int money) {
    this.money += money;
}
/**
 * {@inheritDoc}
 * 
 */
    public void setPosition(int pos) {
    	this.position = pos;
    }
/**
 * {@inheritDoc}
 * 
 */
public int getMoney() {
    return this.money;
}
/**
 * {@inheritDoc}
 * 
 */
public void setStopTurns(int turns) {
    this.stopTurns = turns;
}
/**
 * {@inheritDoc}
 * 
 */
public int getStopTurns() {
    if(this.stopTurns == 0) {
        return 0;
    }
    else {
        this.stopTurns-=1;
        return this.stopTurns+1;
    }
}
/**
 * {@inheritDoc}
 * 
 */
public void buyProperty(Property property, PlayerImpl pl) {
    this.setMoney(-property.getPrice());
    this.properties.add(property);
    pl.setMoney(property.getPrice());
    pl.removeProperty(property);
}
/**
 * {@inheritDoc}
 * 
 */
public void removeProperty(Property property) {
    this.properties.remove(property);
}




}
