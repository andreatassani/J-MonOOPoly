package model.allTypeOfCard;


import java.util.Optional;

import javax.swing.JOptionPane;

import model.history.History;
import model.history.HistoryImpl;
import model.player.PlayerImpl;

public class CCCCard implements Entity {

    private String name;
    private int amount;
    private PlayerImpl owner;
    private History history;
    
    public CCCCard(final String name, int amount, PlayerImpl owner) {
        this.name = name;
        this.amount = amount;
        this.owner = owner;
        this.history = new HistoryImpl(Optional.empty());
       }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void action(PlayerImpl pl) {
      //Da togliere
    	history.gain(pl, amount);
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

}
