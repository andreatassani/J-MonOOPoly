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

public class Sell implements ActionListener {
    
    private ListOfPlayers listPl;
    private ArrayList<Entity> deck;
    private JButton buy;
    private JButton sell;
    private AudioManager sound;
    private JButton build;
    

    public Sell(ListOfPlayers listPl, ArrayList<Entity> deck,JButton buy, JButton sell, JButton build, AudioManager sound) {
        this.listPl = listPl;
        this.deck = deck;
        this.buy = buy;
        this.sell = sell;
        this.sound = sound;
        this.build = build;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            listPl.getPlayerFromIndex(0).buyProperty((Property)deck.get(listPl.getCurrentPlayer().getPosition()));
            sound.getCashSound().play();
            build.setEnabled(false);
            buy.setEnabled(true);
            sell.setEnabled(false);
          //Da togliere
            JOptionPane.showMessageDialog(null,"il giocatore " + listPl.getCurrentPlayer().getName() + " ha venduto la proprietà " + deck.get(listPl.getCurrentPlayer().getPosition()).getName() + " e gli rimangono " + listPl.getCurrentPlayer().getMoney() + "$",
                    "messaggio", 0);
    }

}
