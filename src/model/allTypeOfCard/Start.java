/**
 * 
 */
package model.allTypeOfCard;

import java.util.Optional;

import model.player.PlayerImpl;

/**
 * {@inheritDoc}.
 */
public class Start implements Entity {
	
    private String name = "Start";
    private final int bonus = 200;
    private PlayerImpl owner;
    /**
     * Constructor.
     */
    public Start(PlayerImpl owner) {
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
    public void action(PlayerImpl pl) {
    }
    @Override
    public PlayerImpl getOwner() {
        return this.owner;
    }

}
