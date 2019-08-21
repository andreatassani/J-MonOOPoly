package controller.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import controller.audio.AudioManager;
import model.allTypeOfCard.Entity;
import model.allTypeOfCard.Property;
import model.history.History;
import model.player.ListOfPlayersImpl;
import model.player.Loss;
import model.player.PlayerImpl;
import view.play.GridCell;
import view.play.MainExternContainerImpl;
import view.play.PawnMovement;

public class Buy implements ActionListener {
/**
 * fields
 */
    private final ListOfPlayersImpl listPl;
    private final AudioManager sound;
    private final ArrayList<Entity> deck;
    private final JButton buyButton;
    private final JButton build;
    private PlayerImpl pl;
    private final PawnMovement pawnMovement;
    private final History history;
    private final MainExternContainerImpl main;
/**
 * constructor
 */
    public Buy(final ListOfPlayersImpl listPl,final ArrayList<Entity> deck,final JButton buy,final JButton build, final AudioManager sound, 
               final GridCell grid,final History history,final  MainExternContainerImpl main) {
        this.sound = sound;
        this.listPl = listPl;
        this.deck = deck;
        this.buyButton = buy;
        this.build = build;
        this.pawnMovement = new PawnMovement(grid, listPl);
        this.history = history;
        this.main = main;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        pl = listPl.getCurrentPlayer();
        listPl.getCurrentPlayer().buyProperty((Property)deck.get(pl.getPosition()));
        sound.getCashSound().play();
        if(pl.getMoney() < 0) {
            new Loss(listPl, pawnMovement);
            listPl.isThereAWinner(listPl, deck, main);
             pl = listPl.getCurrentPlayer();
         }
        buyButton.setEnabled(false);
        if(deck.get(pl.getPosition()).isBuildable()) {
        build.setEnabled(true);
        }
        history.buyPropriety(pl);
    }

}
