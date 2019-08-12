package model.allTypeOfCard;

import java.util.Optional;

import javax.swing.JOptionPane;

import model.player.PlayerImpl;

public class CCCCard implements Entity {

    private String name;
    private int amount;
    private PlayerImpl owner;
    
    public CCCCard(final String name, int amount, PlayerImpl owner) {
        this.name = name;
        this.amount = amount;
        this.owner = owner;
       }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void action(PlayerImpl pl) {
      //Da togliere
        JOptionPane.showMessageDialog(null,"è stata pescata la carta " + this.name,
                "messaggio", 0);
       pl.setMoney(this.amount);
       if (this.amount == 0){
              if (this.name == "Vai in PRIGIONE!"){
                   pl.setPosition(10);
                   pl.setStopTurns(2);
              }
       else if (this.name == "Vai al VIA!"){
                   pl.setPosition(0);
                   pl.setMoney(200);
              }
       } else {
           JOptionPane.showMessageDialog(null,"adesso il giocatore " + pl.getName() + " possiede " + pl.getMoney(),
                   "messaggio", 0);
       }
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
