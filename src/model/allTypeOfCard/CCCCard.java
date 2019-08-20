package model.allTypeOfCard;


import java.awt.Color;
import java.util.Optional;

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
    private final String name;
    private final int amount;
    private final PlayerImpl owner;
    private final History history;
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
    		pl.setMoney(this.amount);
           history.chance(pl, amount);
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
