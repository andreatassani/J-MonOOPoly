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
import model.player.Loss;
import model.player.PlayerImpl;
import view.play.GridCell;
import view.play.PawnMovement;

public class Build implements ActionListener {
    
    private AudioManager sound;
    private ArrayList<Entity> deck;
    private JButton build;
    private PlayerImpl pl;
    private int pos;
    ListOfPlayers listPl;
    PawnMovement pawnMovement;
    private final History history;

    public Build(ListOfPlayers listPl, ArrayList<Entity> deck, JButton build, AudioManager sound, GridCell grid,History history) {
        this.sound = sound;
        this.deck = deck;
        this.build = build;
        this.listPl = listPl;
        this.pawnMovement = new PawnMovement(grid, listPl);
        this.history = history;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        pl = listPl.getCurrentPlayer();
        pos = pl.getPosition();
        ((Property)deck.get(pos)).addHouse();
        if(((Property)deck.get(pos)).getHotel()) {
        //Da togliere
        JOptionPane.showMessageDialog(null,"il giocatore " + pl.getName() + " ha costruito un hotel sulla proprietà " + deck.get(pos).getName() +" pagandolo "+ ((Property)deck.get(pos)).getPrice()/2+"$ ,ora ha " + pl.getMoney() + "$",
                "messaggio", 0);
        history.buildHotel(pl, pos);
        build.setEnabled(false);
     
        }
        else {
        	 history.buildHouse(pl, pos);
          //Da togliere
                JOptionPane.showMessageDialog(null,"il giocatore " + pl.getName() + " ha costruito una casa sulla proprietà " + deck.get(pos).getName() +" pagandola "+ ((Property)deck.get(pos)).getPrice()/4+"$ ,ora ha " +
                        ((Property)deck.get(pos)).getHouses() + "case, e gli rimangono " + pl.getMoney() + "$", "messaggio", 0);
        }
        if(pl.getMoney() < 0) {
            new Loss(listPl, pawnMovement);
             pl = listPl.getCurrentPlayer();
             pos = pl.getPosition();
         }
    }

}
