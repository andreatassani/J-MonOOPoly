package model.player;

import java.awt.Color;
import java.util.ArrayList;

import model.allTypeOfCard.Entity;
import model.allTypeOfCard.Property;
import model.myEnum.Pawns;
/**
 * class for creating a player.
 * 
 *
 */

public class PlayerImpl implements Player {
/**
 * player fields.
 */
    private final String name;
    private final Color color;
    private final Pawns pawns;
    private int money;
    private static final int BANK_AMOUNT = 4000;
    private int stopTurns;
    private final ArrayList<Property> properties = new ArrayList<>();
    private int position;
    
    public PlayerImpl(final String name, final Color color, final Pawns pawns,final String difficulty) {
        this.name = name;
        this.position = 0;
        this.color = color;
        this.pawns = pawns;
        this.money = BANK_AMOUNT;
        if(difficulty.equals("HARD")) {
                this.money = 1000;
        }
        this.position = 0;
    }
    
    public boolean hasProperty(final Entity entity) {
        return this.properties.contains(entity);
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
    public Color getColors() {
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
    public void setMoney(final int money) {
    this.money += money;
}
/**
 * {@inheritDoc}
 * 
 */
    public void setPosition(final int pos) {
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
public void setStopTurns(final int turns) {
    this.stopTurns = turns;
}
/**
 * {@inheritDoc}
 * 
 */
public int getStopTurns() {
    return this.stopTurns;
    }
/**
 * {@inheritDoc}
 * 
 */
public void buyProperty(Property property) {
    PlayerImpl seller = property.getOwner();
    this.setMoney(-property.getPrice());
    this.properties.add(property);
    property.setNewOwner(this);
    seller.setMoney(property.getPrice());
    seller.removeProperty(property);
}
/**
 * {@inheritDoc}
 * 
 */
public void removeProperty(final Property property) {
    this.properties.remove(property);
}

public ArrayList<Property> getListOfProperties(){
    return this.properties;
}

public void addProperty(final Property property) {
    this.properties.add(property);
}

}
