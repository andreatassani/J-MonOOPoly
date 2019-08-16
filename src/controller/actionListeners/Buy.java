package controller.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import controller.audio.AudioManager;
import model.allTypeOfCard.Entity;
import model.allTypeOfCard.Property;
import model.player.ListOfPlayers;
import model.player.Loss;
import model.player.PlayerImpl;
import view.play.GridCell;
import view.play.PawnMovement;

public class Buy implements ActionListener {
    
    private ListOfPlayers listPl;
    private AudioManager sound;
    private ArrayList<Entity> deck;
    private JButton buy;
    private JButton sell;
    private JButton build;
    private PlayerImpl pl;
    PawnMovement pawnMovement;
    
    

    public Buy(ListOfPlayers listPl, ArrayList<Entity> deck,JButton buy, JButton sell, JButton build, AudioManager sound, GridCell grid) {
        this.sound = sound;
        this.listPl = listPl;
        this.deck = deck;
        this.buy = buy;
        this.sell = sell;
        this.build = build;
        this.pawnMovement = new PawnMovement(grid, listPl);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        pl = listPl.getCurrentPlayer();
        listPl.getCurrentPlayer().buyProperty((Property)deck.get(pl.getPosition()));
        sound.getCashSound().play();
        if(pl.getMoney() < 0) {
            new Loss(listPl, pawnMovement);
             pl = listPl.getCurrentPlayer();
         }
        buy.setEnabled(false);
        sell.setEnabled(true);
        build.setEnabled(true);
      //Da togliere
        JOptionPane.showMessageDialog(null,"il giocatore " + pl.getName() + " ha acquistato la proprietà " + deck.get(pl.getPosition()).getName() + "per"+ ((Property)deck.get(pl.getPosition())).getPrice()+"$, e gli rimangono " + pl.getMoney() + "$",
                "messaggio", 0);
    }

}
