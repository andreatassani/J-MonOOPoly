package model.allTypeOfCard;


import java.awt.Color;

import model.player.PlayerImpl;
/**
 * 
 * Police Cell in the main board
 *
 */
public class GoToPrison implements Entity {
    /**
     * fields
     */
        private final PlayerImpl owner;
	private String name = "Police";
    /**
     * Constructor.
     */
    public GoToPrison(PlayerImpl owner) {
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
	public void action(PlayerImpl pl) {
	    
	    pl.setPosition(10);
	    pl.setStopTurns(2);
	}
    @Override
    public PlayerImpl getOwner() {
        return this.owner;
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
        return 30;
    }
    @Override
    public Color getColor() {
        return Color.WHITE;
    }
    
}
