
package model.allTypeOfCard;

import java.util.Optional;

import javax.swing.JOptionPane;

import model.player.PlayerImpl;

/**
 *{@inheritDoc}.
 */
public class Prison implements Entity {
	
    private String name = "Prison";
    private PlayerImpl owner;
    /**
     * Constructor.
     */
    public Prison(PlayerImpl owner) {
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
	    JOptionPane.showMessageDialog(null, "Non succede nulla",
                    "messaggio", 0);
	}
    @Override
    public PlayerImpl getOwner() {
        return this.owner;
    }
    @Override
    public boolean isSalable() {
        return false;
    }

}
