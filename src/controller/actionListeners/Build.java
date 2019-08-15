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

public class Build implements ActionListener {
    
    private ListOfPlayers listPl;
    private AudioManager sound;
    private ArrayList<Entity> deck;
    private JButton build;
    

    public Build(ListOfPlayers listPl, ArrayList<Entity> deck, JButton build, AudioManager sound) {
        this.sound = sound;
        this.listPl = listPl;
        this.deck = deck;
        this.build = build;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        ((Property)deck.get(listPl.getCurrentPlayer().getPosition())).addHouse();
        if(((Property)deck.get(listPl.getCurrentPlayer().getPosition())).getHotel()) {
        //Da togliere
        JOptionPane.showMessageDialog(null,"il giocatore " + listPl.getCurrentPlayer().getName() + " ha costruito un hotel sulla proprietà " + deck.get(listPl.getCurrentPlayer().getPosition()).getName() + " e gli rimangono " + listPl.getCurrentPlayer().getMoney() + "$",
                "messaggio", 0);
        build.setEnabled(false);
     
        }
        else {
          //Da togliere
                JOptionPane.showMessageDialog(null,"il giocatore " + listPl.getCurrentPlayer().getName() + " ha costruito una casa sulla proprietà " + deck.get(listPl.getCurrentPlayer().getPosition()).getName() + ",ora ha " +
                        ((Property)deck.get(listPl.getCurrentPlayer().getPosition())).getHouses() + " e gli rimangono " + listPl.getCurrentPlayer().getMoney() + "$", "messaggio", 0);
        }
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
