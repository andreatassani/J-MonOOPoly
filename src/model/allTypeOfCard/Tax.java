package model.allTypeOfCard;

import java.util.Optional;

import javax.swing.JOptionPane;

import model.player.Player;
import model.player.PlayerImpl;
/**
 * {@inheritDoc}.
 */
public class Tax implements Entity {
	
    private String name = "Tax";
    private final int forfeit = 100;
    private PlayerImpl owner;
    /**
     * Constructor.
     */
    public Tax(PlayerImpl owner) {
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
        JOptionPane.showMessageDialog(null, "al giocatore " + pl.getName() + " saranno sottratti 200$ ",
                "messaggio", 0);
        pl.setMoney(-200);
        JOptionPane.showMessageDialog(null,"adesso il giocatore " + pl.getName() + " possiede " + pl.getMoney(),
                "messaggio", 0);
    }
    @Override
    public PlayerImpl getOwner() {
        return this.owner;
    }
}
