package controller.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

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
    
    private final AudioManager sound;
    private final ArrayList<Entity> deck;
    private final JButton buildButton;
    private PlayerImpl pl;
    private int pos;
    private final ListOfPlayers listPl;
    private final PawnMovement pawnMovement;
    private final History history;
    private final MainExternContainerImpl main;

    public Build(final ListOfPlayers listPl, final ArrayList<Entity> deck,final JButton build,final AudioManager sound,final GridCell grid,
                 final History history, final MainExternContainerImpl main) {
        this.sound = sound;
        this.deck = deck;
        this.buildButton = build;
        this.listPl = listPl;
        this.pawnMovement = new PawnMovement(grid, listPl);
        this.history = history;
        this.main = main;
    }
    
    @Override
    public void actionPerformed(final ActionEvent e) {

        buildButton.setEnabled(false);
        pl = listPl.getCurrentPlayer();
        pos = pl.getPosition();
        ((Property)deck.get(pos)).addHouse();
        sound.getBuilSound().play();
        if(((Property)deck.get(pos)).getHotel()) {
        history.buildHotel(pl, pos);
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
