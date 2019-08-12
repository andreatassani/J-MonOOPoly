package model.allTypeOfCard;

import java.util.Optional;

import javax.swing.JOptionPane;

import model.player.PlayerImpl;
/**
 * {@inheritDoc}.
 */
public class FreeParking implements Entity {
    
	private PlayerImpl owner;
	private String name = "Free Parking";
    /**
     * Constructor.
     */
    public FreeParking(PlayerImpl owner) {
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
	  //Da togliere
            JOptionPane.showMessageDialog(null, "Non succede nulla",
                    "messaggio", 0);
	}
    @Override
    public PlayerImpl getOwner() {
        return owner;
    }
    @Override
    public boolean isSalable() {
        return false;
    }
}
