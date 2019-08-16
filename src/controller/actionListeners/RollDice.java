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
import model.player.PlayerImpl;
import model.utility.Dice;
import view.play.Cel;
import view.play.GridCell;
import view.play.PositionPawns;

public class RollDice implements ActionListener{
    
    private static final int START = 0;
    private static final int PRISON = 10;
    private static final int PARKING = 20;
    private static final int POLICE = 30;
    private static final int MAXPOSITION = 39;
    private static final String NORTH = "North";
    private static final String EAST= "East";
    private static final String SOUTH = "South";
    private static final String WEST = "West";
    
    private ListOfPlayers listPl;
    private GridCell grid;
    private AudioManager sound;
    private ArrayList<Entity> deck;
    private JButton rollDice;
    private JButton buy;
    private JButton sell;
    private JButton build;
    private JButton nextPlayer;
    private PlayerImpl pl;
    private PlayerImpl bank;

    public RollDice(ListOfPlayers listPl, GridCell grid, ArrayList<Entity> deck, JButton rolldDice,JButton buy, JButton sell, JButton build, JButton nextPlayer, AudioManager sound) {
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
        pos = this.updatePosition(pos,risultato, pl);
        rollDice.setEnabled(false);
        activateCell(pos, pl);
        
//      PERDITA
        if(pl.getMoney() < 0) {
          JOptionPane.showMessageDialog(null,"il giocatore " + pl.getName() + " ha perso! :(",
          "messaggio", 0);
            if(pos>=START && pos <=PRISON) {
                this.getPositionPawn(NORTH, pos).resetPawnOnIndex(listPl.getIndexFromPlayer(pl)-1);
                } else if (pos>=PRISON+1 && pos<=PARKING-1){
                this.getPositionPawn(EAST, pos-(PRISON+1)).resetPawnOnIndex(listPl.getIndexFromPlayer(pl)-1);
                } else if(pos>=PARKING && pos<=POLICE) {
                this.getPositionPawn(SOUTH, POLICE-pos).resetPawnOnIndex(listPl.getIndexFromPlayer(pl)-1);    
                } else if(pos>=POLICE+1 && pos<= MAXPOSITION) {
                this.getPositionPawn(WEST, MAXPOSITION-pos).resetPawnOnIndex(listPl.getIndexFromPlayer(pl)-1);       
                }
            removePawn(listPl.getPlayerFromIndex(listPl.getNumberPlayer()).getPosition(), listPl.getPlayerFromIndex(listPl.getNumberPlayer()));
            listPl.removePlayer(pl);
                for(int i = 1; i<= listPl.getNumberPlayer(); i++) {
                    removePawn(listPl.getPlayerFromIndex(i).getPosition(), listPl.getPlayerFromIndex(i));
                    addPawn(listPl.getPlayerFromIndex(i).getPosition(), listPl.getPlayerFromIndex(i));
                }
           JOptionPane.showMessageDialog(null,"è il turno del giocatore: "+listPl.getCurrentPlayer().getName(),
                        "messaggio", 0);
            pl = listPl.getCurrentPlayer();
            pos = pl.getPosition();
            rollDice.setEnabled(true);
        }

//        if(pl.getMoney() <= 0) {
//            JOptionPane.showMessageDialog(null,"il giocatore " + pl.getName() + " ha perso! :(",
//                    "messaggio", 0);
//            rollDice.setEnabled(true);
//            buy.setEnabled(false);
//            sell.setEnabled(false);
//            build.setEnabled(false);
//            nextPlayer.setEnabled(false);
//            listPl.nextPlayer();
//            
//                int stopTurns = listPl.getCurrentPlayer().getStopTurns();
//                if(stopTurns != 0) {
//                    //Da togliere
//                    JOptionPane.showMessageDialog(null,"il giocatore " + listPl.getCurrentPlayer().getName() + " deve ancora aspettare " + stopTurns + "turni in prigione",
//                            "messaggio", 0);
//                    stopTurns -= 1;
//                    
//                }
//          
//          //Da togliere
//            JOptionPane.showMessageDialog(null,"è il turno di "+ listPl.getCurrentPlayer().getName() + " e si trova sulla casella " + deck.get(listPl.getCurrentPlayer().getPosition()).getName(),
//                    "messaggio", 0);
//        }
        
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
    
    public PositionPawns getPositionPawn (String pole, int pos) {
        if(pole == NORTH) {
            return ((Cel)grid.getNorthBox().getComponent(pos)).getPositionPawns();
        } else if(pole == EAST) {
            return ((Cel)grid.getEastBox().getComponent(pos)).getPositionPawns();
        } else if(pole == SOUTH) {
            return ((Cel)grid.getSouthBox().getComponent(pos)).getPositionPawns();
        } else {
            return ((Cel)grid.getWestBox().getComponent(pos)).getPositionPawns();
        }
    }
    
    public void removePawn(int pos, PlayerImpl pl) {
        if(pos>=START && pos <=PRISON) {
            this.getPositionPawn(NORTH, pos).resetPawnOnIndex(listPl.getIndexFromPlayer(pl)-1);
            } else if (pos>=PRISON+1 && pos<=PARKING-1){
            this.getPositionPawn(EAST, pos-(PRISON+1)).resetPawnOnIndex(listPl.getIndexFromPlayer(pl)-1);
            } else if(pos>=PARKING && pos<=POLICE) {
            this.getPositionPawn(SOUTH, POLICE-pos).resetPawnOnIndex(listPl.getIndexFromPlayer(pl)-1);    
            } else if(pos>=POLICE+1 && pos<= MAXPOSITION) {
            this.getPositionPawn(WEST, MAXPOSITION-pos).resetPawnOnIndex(listPl.getIndexFromPlayer(pl)-1);       
            }
    }
    
    public void addPawn(int newPos, PlayerImpl pl) {
        if(newPos>= START && newPos<= PRISON) {
            this.getPositionPawn(NORTH, newPos).setImageOnIndex(listPl.getIndexFromPlayer(pl)-1, pl.getPawn());
        } else if (newPos>=PRISON+1 && newPos<=PARKING-1){
            this.getPositionPawn(EAST, newPos-(PRISON+1)).setImageOnIndex(listPl.getIndexFromPlayer(pl)-1, pl.getPawn());
        } else if(newPos>=PARKING && newPos<=POLICE) {
            this.getPositionPawn(SOUTH, POLICE-newPos).setImageOnIndex(listPl.getIndexFromPlayer(pl)-1, pl.getPawn());
        } else if(newPos>=POLICE+1 && newPos<=MAXPOSITION) {
            this.getPositionPawn(WEST, MAXPOSITION-newPos).setImageOnIndex(listPl.getIndexFromPlayer(pl)-1, pl.getPawn());
        }
    }
    
    public int updatePosition(int pos, int risultato, PlayerImpl pl) {
        
        int newPos;
        this.removePawn(pos, pl);
        if(pos+risultato >= MAXPOSITION+1) {
            pl.setPosition(pos+risultato-MAXPOSITION+1);
            newPos = pl.getPosition();
            listPl.getCurrentPlayer().setMoney(200);
          //Da togliere
            JOptionPane.showMessageDialog(null,"il giocatore "+pl.getName()+" è passato dal via e guadagna 200 $, ora possiede "+pl.getMoney()+"$",
                    "messaggio", 0);
        } else {
            pl.setPosition(pos+risultato);
            newPos = pl.getPosition();
        }
        this.addPawn(newPos, pl);
        return newPos;
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
            if(deck.get(pos).getName() == "Go To Prison") {
                pos = this.updatePosition(pos, 18, pl);
                deck.get(30).action(pl);
            }
            deck.get(pos).action(pl);
        }
        nextPlayer.setEnabled(true);
    }

}
