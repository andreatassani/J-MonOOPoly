package controller.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import controller.audio.AudioManager;
import model.allTypeOfCard.Entity;
import model.player.ListOfPlayers;
import view.play.GridCell;

public class NextPlayer implements ActionListener {

    private ListOfPlayers listPl;
    private ArrayList<Entity> deck;
    private JButton rollDice;
    private JButton buy;
    private JButton sell;
    private JButton build;
    private JButton nextPlayer;
    
    

    public NextPlayer(ListOfPlayers listPl, ArrayList<Entity> deck, JButton rolldDice,JButton buy, JButton sell, JButton build, JButton nextPlayer) {
        this.listPl = listPl;
        this.deck = deck;
        this.rollDice = rolldDice;
        this.buy = buy;
        this.sell = sell;
        this.build = build;
        this.nextPlayer = nextPlayer;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        rollDice.setEnabled(true);
        buy.setEnabled(false);
        sell.setEnabled(false);
        build.setEnabled(false);
        nextPlayer.setEnabled(false);
        listPl.nextPlayer();
    }

}
