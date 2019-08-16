package controller.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import controller.audio.AudioManager;
import model.allTypeOfCard.Entity;
import model.allTypeOfCard.Property;
import model.images.ShowImages;
import model.player.ListOfPlayers;
import model.player.Loss;
import model.player.PlayerImpl;
import model.utility.Dice;
import view.play.Cel;
import view.play.GridCell;
import view.play.PawnMovement;
import view.play.PositionPawns;

public class RollDice implements ActionListener{
    
    private final ListOfPlayers listPl;
    private final GridCell grid;
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

    public RollDice(final ListOfPlayers listPl, final GridCell grid, final ArrayList<Entity> deck, final JButton rolldDice, final JButton buy, JButton sell, final JButton build, final JButton nextPlayer, final AudioManager sound) {
        this.sound = sound;
        this.listPl = listPl;
        this.grid = grid;
        this.deck = deck;
        this.rollDice = rolldDice;
        this.buy = buy;
        this.sell = sell;
        this.build = build;
        this.nextPlayer = nextPlayer;
        bank = listPl.getBank();
        pawnMovement = new PawnMovement(grid, listPl);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        pl = listPl.getCurrentPlayer();
        sound.getDiceSound().play();
        
//      ENRI MODIFICA QUESTO!
//        history.printStartGame();
        
        int risultato = new Dice().rollTheDice();
        ShowImages.dice(risultato);
        int pos = pl.getPosition();
        this.stepSound(risultato);
        pos = pawnMovement.updatePosition(pos,risultato, pl);
        rollDice.setEnabled(false);
        activateCell(pos, pl);
        
//      PERDITA
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
        JOptionPane.showMessageDialog(null,"il giocatore "+pl.getName()+" è finito sulla casella "+deck.get(pos).getName(),
                "messaggio", 0);
        
        if(deck.get(pos).getOwner() == pl) {
            buy.setEnabled(false);
            sell.setEnabled(true);
            build.setEnabled(true);
            if(((Property)deck.get(pos)).getHotel()) {
                build.setEnabled(false);
            }
            
        } else if(deck.get(pos).getOwner() == bank && deck.get(pos).isSalable() ) {
            buy.setEnabled(true);
            sell.setEnabled(false);
            
        } else if (deck.get(pos).getOwner() != bank && deck.get(pos).isSalable() && deck.get(pos).getOwner() != pl) {
            deck.get(pos).action(pl);
          //Da togliere
            JOptionPane.showMessageDialog(null,"il giocatore "+pl.getName()+"possiede"+pl.getMoney(),
                    "messaggio", 0);
            buy.setEnabled(true);
            
        } else if (deck.get(pos).isSalable() == false) {
            if(deck.get(pos).getName().equals("Go To Prison")) {
                pos = pawnMovement.updatePosition(pos, 18, pl);
                deck.get(30).action(pl);
            }
            deck.get(pos).action(pl);
        }
        nextPlayer.setEnabled(true);
    }

}
