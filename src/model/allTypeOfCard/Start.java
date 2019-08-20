/**
 * 
 */
package model.allTypeOfCard;

import java.awt.Color;

import model.player.PlayerImpl;

/**
 * {@inheritDoc}.
 */
public class Start implements Entity {
	
    private String name = "Go!";
    private final int bonus = 200;
    private PlayerImpl owner;
    /**
     * Constructor.
     */
    public Start(final PlayerImpl owner) {
        this.owner = owner;
	}
    /**
     * {@inheritDoc}
     */
    public void setName(final String n) {
        this.name = n;
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
    @Override
    public boolean isSalable() {
        return false;
    }
    @Override
    public void action(final PlayerImpl pl) {
    }
    @Override
    public PlayerImpl getOwner() {
        return this.owner;
    }
    @Override
    public boolean isBuildable() {
        return false;
    }
    @Override
    public int getPosition() {
        return 0;
    }
    @Override
    public Color getColor() {
        return Color.WHITE;
    }

}
