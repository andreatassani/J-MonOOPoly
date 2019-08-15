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
import view.play.GridCell;

public class Buy implements ActionListener {
    
    private ListOfPlayers listPl;
    private AudioManager sound;
    private ArrayList<Entity> deck;
    private JButton rollDice;
    private JButton buy;
    private JButton sell;
    private JButton build;
    private JButton nextPlayer;
    

    public Buy(ListOfPlayers listPl, ArrayList<Entity> deck, JButton rolldDice,JButton buy, JButton sell, JButton build, JButton nextPlayer, AudioManager sound) {
        this.sound = sound;
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
        
        listPl.getCurrentPlayer().buyProperty((Property)deck.get(listPl.getCurrentPlayer().getPosition()));
        sound.getCashSound().play();
        buy.setEnabled(false);
        sell.setEnabled(true);
        build.setEnabled(true);
      //Da togliere
        JOptionPane.showMessageDialog(null,"il giocatore " + listPl.getCurrentPlayer().getName() + " ha acquistato la proprietà " + deck.get(listPl.getCurrentPlayer().getPosition()).getName() + " e gli rimangono " + listPl.getCurrentPlayer().getMoney() + "$",
                "messaggio", 0);
        if(listPl.getCurrentPlayer().getMoney() <= 0) {
            JOptionPane.showMessageDialog(null,"il giocatore " + listPl.getCurrentPlayer().getName() + " ha perso! :(",
                    "messaggio", 0);
            rollDice.setEnabled(true);
            buy.setEnabled(false);
            sell.setEnabled(false);
            build.setEnabled(false);
            nextPlayer.setEnabled(false);
            listPl.nextPlayer();
            for(int i = 1; i<4; i++) {
                int stopTurns = listPl.getCurrentPlayer().getStopTurns();
                if(stopTurns != 0) {
                    //Da togliere
                    JOptionPane.showMessageDialog(null,"il giocatore " + listPl.getCurrentPlayer().getName() + " deve ancora aspettare " + stopTurns + " turni in prigione",
                            "messaggio", 0);
                    stopTurns -= 1;
                }
            }
          //Da togliere
            JOptionPane.showMessageDialog(null,"è il turno di"+ listPl.getCurrentPlayer().getName() + " e si trova sulla casella " + deck.get(listPl.getCurrentPlayer().getPosition()).getName(),
                    "messaggio", 0);
        }
    }

}
