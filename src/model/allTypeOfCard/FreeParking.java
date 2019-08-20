package model.allTypeOfCard;


import java.awt.Color;

import model.player.PlayerImpl;
/**
 * Free parking cell on the main board
 */
public class FreeParking implements Entity {
    /**
     * fields
     */
	private final PlayerImpl owner;
	private String name = "Parking";
    /**
     * Constructor.
     */
    public FreeParking(final PlayerImpl owner) {
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
	public void action(final PlayerImpl pl) {
	}
    @Override
    public PlayerImpl getOwner() {
        return owner;
    }
    @Override
    public boolean isSalable() {
        return false;
    }
    @Override
    public boolean isBuildable() {
        return false;
    }
    @Override
    public int getPosition() {
        return 20;
    }
    @Override
    public Color getColor() {
        return Color.WHITE;
    }
}
