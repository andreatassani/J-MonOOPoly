package model.allTypeOfCard;

import java.util.Optional;

import javax.swing.JOptionPane;

import model.player.PlayerImpl;
/**
 * 
 * {@inheritDoc}.
 *
 */
public class GoToPrison implements Entity {
	
        private PlayerImpl owner;
	private String name = "Go To Prison";
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
	    JOptionPane.showMessageDialog(null, "il giocatore " + pl.getName() + " andrà in prigione e ci rimarrà per 2 turni",
                    "messaggio", 0);
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

}
