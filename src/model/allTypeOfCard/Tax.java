package model.allTypeOfCard;

import java.awt.Color;
import java.util.Optional;

import javax.swing.JOptionPane;

import model.history.History;
import model.history.HistoryImpl;
import model.player.PlayerImpl;
/**
 * {@inheritDoc}.
 */
public class Tax implements Entity {
	
    private String name = "Tax";
    private PlayerImpl owner;
    private History history;
    int positionOnBoard;
    /**
     * Constructor.
     */
    public Tax(PlayerImpl owner, int positionOnBoard) {
        this.positionOnBoard = positionOnBoard;
        this.owner = owner;
        this.history = new HistoryImpl(Optional.empty());
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
        history.lost(pl);
        pl.setMoney(-200);
        JOptionPane.showMessageDialog(null,"adesso il giocatore " + pl.getName() + " possiede " + pl.getMoney(),
                "messaggio", 0);
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
        return this.positionOnBoard;
    }
    @Override
    public Color getColor() {
        return Color.WHITE;
    }
}
