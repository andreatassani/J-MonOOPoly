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

public class Sell implements ActionListener {
/**
 * fields    
 */
    private final ListOfPlayersImpl listPl;
    private final ArrayList<Entity> deck;
    private final JButton buy;
    private final JButton sellButton;
    private final AudioManager sound;
    private final JButton build;
    private final History history;
/**    
 * constructor
 */
    public Sell(final ListOfPlayersImpl listPl,final ArrayList<Entity> deck,final JButton buy,final JButton sell,final JButton build,
                final AudioManager sound,final History history) {
        this.listPl = listPl;
        this.deck = deck;
        this.buy = buy;
        this.sellButton = sell;
        this.sound = sound;
        this.build = build;
        this.history=history;
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
    		
            listPl.getBank().buyProperty((Property)deck.get(listPl.getCurrentPlayer().getPosition()));
            sound.getCashSound().play();
            build.setEnabled(false);
            buy.setEnabled(true);
            sellButton.setEnabled(false);
            history.sellPropriety(listPl.getCurrentPlayer());
           
            
    }

}
