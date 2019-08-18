package controller.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import controller.audio.AudioManager;
import model.allTypeOfCard.Entity;
import model.allTypeOfCard.Property;
import model.history.History;
import model.player.ListOfPlayers;

public class Sell implements ActionListener {
    
    private ListOfPlayers listPl;
    private ArrayList<Entity> deck;
    private JButton buy;
    private JButton sell;
    private AudioManager sound;
    private JButton build;
    private final History history;
    

    public Sell(ListOfPlayers listPl, ArrayList<Entity> deck,JButton buy, JButton sell, JButton build, AudioManager sound,History history) {
        this.listPl = listPl;
        this.deck = deck;
        this.buy = buy;
        this.sell = sell;
        this.sound = sound;
        this.build = build;
        this.history=history;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            listPl.getPlayerFromIndex(0).buyProperty((Property)deck.get(listPl.getCurrentPlayer().getPosition()));
            sound.getCashSound().play();
            build.setEnabled(false);
            buy.setEnabled(true);
            sell.setEnabled(false);
            history.sellPropriety(listPl.getCurrentPlayer());
    }

}
