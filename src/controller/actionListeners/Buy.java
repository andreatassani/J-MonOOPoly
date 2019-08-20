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

public class Buy implements ActionListener {
    
    private ListOfPlayers listPl;
    private AudioManager sound;
    private ArrayList<Entity> deck;
    private JButton buy;
    private JButton sell;
    private JButton build;
    private PlayerImpl pl;
    PawnMovement pawnMovement;
    private final History history;
    private MainExternContainerImpl main;
    
    

    public Buy(ListOfPlayers listPl, ArrayList<Entity> deck,JButton buy, JButton sell, JButton build, AudioManager sound, GridCell grid,History history, MainExternContainerImpl main) {
        this.sound = sound;
        this.listPl = listPl;
        this.deck = deck;
        this.buy = buy;
        this.sell = sell;
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
        buy.setEnabled(false);
        sell.setEnabled(true);
        if(deck.get(pl.getPosition()).isBuildable()) {
        build.setEnabled(true);
        }
        history.buyPropriety(pl);
    }

}
