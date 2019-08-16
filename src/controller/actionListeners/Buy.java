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
import model.player.PlayerImpl;

public class Buy implements ActionListener {
    
    private ListOfPlayers listPl;
    private AudioManager sound;
    private ArrayList<Entity> deck;
    private JButton buy;
    private JButton sell;
    private JButton build;
    private PlayerImpl pl;
    
    

    public Buy(ListOfPlayers listPl, ArrayList<Entity> deck,JButton buy, JButton sell, JButton build, AudioManager sound) {
        this.sound = sound;
        this.listPl = listPl;
        this.deck = deck;
        this.buy = buy;
        this.sell = sell;
        this.build = build;
        pl = listPl.getCurrentPlayer();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        listPl.getCurrentPlayer().buyProperty((Property)deck.get(pl.getPosition()));
        sound.getCashSound().play();
        buy.setEnabled(false);
        sell.setEnabled(true);
        build.setEnabled(true);
      //Da togliere
        JOptionPane.showMessageDialog(null,"il giocatore " + pl.getName() + " ha acquistato la proprietà " + deck.get(pl.getPosition()).getName() + " e gli rimangono " + pl.getMoney() + "$",
                "messaggio", 0);
    }

}
