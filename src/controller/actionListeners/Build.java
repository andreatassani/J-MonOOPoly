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
import view.play.MainExternContainerImpl;
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
    private MainExternContainerImpl main;

    public Build(ListOfPlayers listPl, ArrayList<Entity> deck, JButton build, AudioManager sound, GridCell grid,History history, MainExternContainerImpl main) {
        this.sound = sound;
        this.deck = deck;
        this.build = build;
        this.listPl = listPl;
        this.pawnMovement = new PawnMovement(grid, listPl);
        this.history = history;
        this.main = main;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        pl = listPl.getCurrentPlayer();
        pos = pl.getPosition();
        ((Property)deck.get(pos)).addHouse();
        sound.getBuilSound().play();
        if(((Property)deck.get(pos)).getHotel()) {
        history.buildHotel(pl, pos);
        build.setEnabled(false);
        }
        else {
        	 history.buildHouse(pl, pos);
        }
        if(pl.getMoney() < 0) {
            new Loss(listPl, pawnMovement);
            listPl.isThereAWinner(listPl, deck, main);
             pl = listPl.getCurrentPlayer();
             pos = pl.getPosition();
         }
    }

}
