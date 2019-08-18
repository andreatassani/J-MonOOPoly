package model.allTypeOfCard;


import java.awt.Color;
import java.util.Optional;

import javax.swing.JOptionPane;

import model.history.History;
import model.history.HistoryImpl;
import model.player.PlayerImpl;
/**
 * 
 * CCCCard stands for "Chance & Community Chest Card" and it's used to create these type of cards
 *
 */
public class CCCCard implements Entity {

    /**
     * fields
     */
    private String name;
    private int amount;
    private PlayerImpl owner;
    private History history;
    /**
     * constructor
     */
    public CCCCard(final String name,final int amount,final PlayerImpl owner) {
        this.name = name;
        this.amount = amount;
        this.owner = owner;
        this.history = new HistoryImpl(Optional.empty());
       }

    @Override
    public String getName() {
        return this.name;
    }

    /**
     * returns the message of the drawn card
     */
    @Override
    public void action(final PlayerImpl pl) {
      //Da togliere
    	history.chance(pl, amount);
        JOptionPane.showMessageDialog(null,"è stata pescata la carta " + this.name,
                "messaggio", 0);
       
       pl.setMoney(this.amount);
           JOptionPane.showMessageDialog(null,"adesso il giocatore " + pl.getName() + " possiede " + pl.getMoney(),
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
        return null;
    }  

}
