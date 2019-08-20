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
/**
 *class that model whats building must to do.
 */
public class Build implements ActionListener {
    /**
     * fields.
     */
    private AudioManager sound;
    private ArrayList<Entity> deck;
    private JButton buildButton;
    private PlayerImpl pl;
    private int pos;
    private ListOfPlayers listPl;
    private PawnMovement pawnMovement;
    private final History history;
    private MainExternContainerImpl main;
    /**
     * constructor.
     * @param listPl this is the list of all player in game.
     * @param deck this is the group off all card cell.
     * @param build this is the button relative to this action listener.
     * @param sound this is the sound effect of building.
     * @param grid this is the playground.
     * @param history this is the part of gameplay where there are all events happened.
     * @param main this is the frame of playing's session.
     */
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
    /**
     * action.
     */
    @Override
    public void actionPerformed(final ActionEvent e) {

        buildButton.setEnabled(false);
        pl = listPl.getCurrentPlayer();
        pos = pl.getPosition();
        ((Property) deck.get(pos)).addHouse();
        sound.getBuilSound().play();
        if (((Property) deck.get(pos)).getHotel()) {
        history.buildHotel(pl, pos);
        } else {
              history.buildHouse(pl, pos);
        }
        if (pl.getMoney() < 0) {
            new Loss(listPl, pawnMovement);
            listPl.isThereAWinner(listPl, deck, main);
             pl = listPl.getCurrentPlayer();
             pos = pl.getPosition();
         }
    }
}
