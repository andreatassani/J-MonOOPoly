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
import view.play.GridCell;

public class Build implements ActionListener {
    
    private AudioManager sound;
    private ArrayList<Entity> deck;
    private JButton build;
    private PlayerImpl pl;
    private int pos;
    

    public Build(ListOfPlayers listPl, ArrayList<Entity> deck, JButton build, AudioManager sound) {
        this.sound = sound;
        this.deck = deck;
        this.build = build;
        pl = listPl.getCurrentPlayer();
        pos = pl.getPosition();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        ((Property)deck.get(pos)).addHouse();
        if(((Property)deck.get(pos)).getHotel()) {
        //Da togliere
        JOptionPane.showMessageDialog(null,"il giocatore " + pl.getName() + " ha costruito un hotel sulla proprietà " + deck.get(pos).getName() + " e gli rimangono " + pl.getMoney() + "$",
                "messaggio", 0);
        build.setEnabled(false);
     
        }
        else {
          //Da togliere
                JOptionPane.showMessageDialog(null,"il giocatore " + pl.getName() + " ha costruito una casa sulla proprietà " + deck.get(pos).getName() + ",ora ha " +
                        ((Property)deck.get(pos)).getHouses() + " e gli rimangono " + pl.getMoney() + "$", "messaggio", 0);
        }
    }

}
