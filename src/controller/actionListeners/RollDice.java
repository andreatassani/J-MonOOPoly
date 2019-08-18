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
import model.history.HistoryImpl;
import model.myUtility.Dice;
import model.myUtility.ShowImages;
import model.player.ListOfPlayers;
import model.player.Loss;
import model.player.PlayerImpl;
import view.play.GridCell;
import view.play.PawnMovement;

public class RollDice implements ActionListener{
    
    private final ListOfPlayers listPl;
    private final AudioManager sound;
    private final ArrayList<Entity> deck;
    private final JButton rollDice;
    private final JButton buy;
    private final JButton sell;
    private final JButton build;
    private final JButton nextPlayer;
    private PlayerImpl pl;
    private final PlayerImpl bank;
    private PawnMovement pawnMovement;
    private final History history;

    public RollDice(final ListOfPlayers listPl, final GridCell grid, final ArrayList<Entity> deck, final JButton rolldDice, final JButton buy, JButton sell, final JButton build, final JButton nextPlayer, final AudioManager sound, final History history) {
        this.sound = sound;
        this.listPl = listPl;
        this.deck = deck;
        this.rollDice = rolldDice;
        this.buy = buy;
        this.sell = sell;
        this.build = build;
        this.nextPlayer = nextPlayer;
        this.history = history;
        bank = listPl.getBank();
        pawnMovement = new PawnMovement(grid, listPl);
        
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        pl = listPl.getCurrentPlayer();
        sound.getDiceSound().play();
        int risultato = new Dice().rollTheDice();
        ShowImages.dice(risultato);
        int pos = pl.getPosition();
//        this.stepSound(risultato);
        pos = pawnMovement.updatePosition(pos,risultato, pl);
        rollDice.setEnabled(false);
        activateCell(pos, pl);
        if(pl.getMoney() < 0) {
           new Loss(listPl, pawnMovement);
            pl = listPl.getCurrentPlayer();
            pos = pl.getPosition();
        }
    }
    
    private void stepSound(int numberOfSteps) {
        for(int i = 0; i < numberOfSteps; i++) {
            sound.getPawnSound().play();
            try {
            Thread.sleep(500);
            } catch(InterruptedException er) {
                System.err.println(er.getMessage());
            }
        }
    }
    
    public void activateCell(int pos, PlayerImpl pl) {
      //Da togliere
    	history.printPositionPlayer(pl, pos);
        
        if(deck.get(pos).getOwner() == pl) {
            buy.setEnabled(false);
            sell.setEnabled(true);
            if(deck.get(pos).isBuildable()) {
            build.setEnabled(true);
            }
            if(((Property)deck.get(pos)).getHotel()) {
                build.setEnabled(false);
            }
        } else if(deck.get(pos).getOwner() == bank && deck.get(pos).isSalable() ) {
            buy.setEnabled(true);
            sell.setEnabled(false);
        } else if (deck.get(pos).getOwner() != bank && deck.get(pos).isSalable() && deck.get(pos).getOwner() != pl) {
            deck.get(pos).action(pl);
          //Da togliere
            JOptionPane.showMessageDialog(null,"il giocatore "+pl.getName()+" possiede "+pl.getMoney()+"$",
                    "messaggio", 0);
            buy.setEnabled(true);
            
        } else if (deck.get(pos).isSalable() == false) {
            if(deck.get(pos).getName().equals("Police")) {
                pos = pawnMovement.updatePosition(pos, 20, pl);
                deck.get(30).action(pl);
            }
            deck.get(pos).action(pl);
        }
        nextPlayer.setEnabled(true);
    }

}
