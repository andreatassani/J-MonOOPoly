package controller.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import controller.audio.AudioManager;
import model.allTypeOfCard.Entity;
import model.allTypeOfCard.Property;
import model.images.ShowImages;
import model.player.ListOfPlayers;
import view.play.Cel;
import view.play.GridCell;

public class RollDice implements ActionListener{
    
    private ListOfPlayers listPl;
    private GridCell grid;
    private AudioManager sound;
    private ArrayList<Entity> deck;
    private JButton rollDice;
    private JButton buy;
    private JButton sell;
    private JButton build;
    private JButton nextPlayer;
    

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
    }




    @Override
    public void actionPerformed(ActionEvent arg0) {
        sound.getDiceSound().play();
//        history.printStartGame();
        Random r = new Random();
        rollDice.setEnabled(false);
        int risultato = r.nextInt(6)+1;
        ShowImages.dice(risultato);
        int pos = listPl.getCurrentPlayer().getPosition();
        for(int i = 0; i < risultato; i++) {
            sound.getPawnSound().play();
            try {
            Thread.sleep(500);
            } catch(InterruptedException er) {
                System.err.println(er.getMessage());
            }
        }
        
        if(pos>=0 && pos <=10) {
        ((Cel)grid.getNorthBox().getComponent(pos)).getPositionPawns().resetPawnOnIndex(listPl.getIndexFromPlayer(listPl.getCurrentPlayer())-1);
        } else if (pos>=11 && pos<=19){
        ((Cel)grid.getEastBox().getComponent(pos-11)).getPositionPawns().resetPawnOnIndex(listPl.getIndexFromPlayer(listPl.getCurrentPlayer())-1);
        } else if(pos>=20 && pos<=30) {
        ((Cel)grid.getSouthBox().getComponent(30-pos)).getPositionPawns().resetPawnOnIndex(listPl.getIndexFromPlayer(listPl.getCurrentPlayer())-1);    
        } else if(pos>=31 && pos<=39) {
        ((Cel)grid.getWestBox().getComponent(39-pos)).getPositionPawns().resetPawnOnIndex(listPl.getIndexFromPlayer(listPl.getCurrentPlayer())-1);       
        }
       
        if(pos+risultato >=40) {
            listPl.getCurrentPlayer().setPosition(pos+risultato-40);
            listPl.getCurrentPlayer().setMoney(200);
          //Da togliere
            JOptionPane.showMessageDialog(null,"il giocatore "+listPl.getCurrentPlayer().getName()+" è passato dal via e guadagna 200 $, ora possiede "+listPl.getCurrentPlayer().getMoney()+"$",
                    "messaggio", 0);
        } else {
            listPl.getCurrentPlayer().setPosition(pos+risultato);
        }
        
        if(listPl.getCurrentPlayer().getPosition()>=0 && listPl.getCurrentPlayer().getPosition()<=10) {
        ((Cel)grid.getNorthBox().getComponent(listPl.getCurrentPlayer().getPosition())).getPositionPawns().setImageOnIndex(listPl.getIndexFromPlayer(listPl.getCurrentPlayer())-1, listPl.getCurrentPlayer().getPawn());
        } else if (listPl.getCurrentPlayer().getPosition()>=11 && listPl.getCurrentPlayer().getPosition()<=19){
        ((Cel)grid.getEastBox().getComponent(listPl.getCurrentPlayer().getPosition()-11)).getPositionPawns().setImageOnIndex(listPl.getIndexFromPlayer(listPl.getCurrentPlayer())-1, listPl.getCurrentPlayer().getPawn());
        } else if(listPl.getCurrentPlayer().getPosition()>=20 && listPl.getCurrentPlayer().getPosition()<=30) {
        ((Cel)grid.getSouthBox().getComponent(30-listPl.getCurrentPlayer().getPosition())).getPositionPawns().setImageOnIndex(listPl.getIndexFromPlayer(listPl.getCurrentPlayer())-1, listPl.getCurrentPlayer().getPawn());
        } else if(listPl.getCurrentPlayer().getPosition()>=31 && listPl.getCurrentPlayer().getPosition()<=39) {
        ((Cel)grid.getWestBox().getComponent(39-listPl.getCurrentPlayer().getPosition())).getPositionPawns().setImageOnIndex(listPl.getIndexFromPlayer(listPl.getCurrentPlayer())-1, listPl.getCurrentPlayer().getPawn());
        }
        
        
        //Da togliere
        JOptionPane.showMessageDialog(null,"il giocatore "+listPl.getCurrentPlayer().getName()+" è finito sulla casella "+deck.get(listPl.getCurrentPlayer().getPosition()).getName(),
                "messaggio", 0);
        
        if(deck.get(listPl.getCurrentPlayer().getPosition()).getOwner() == listPl.getCurrentPlayer()) {
            buy.setEnabled(false);
            sell.setEnabled(true);
            build.setEnabled(true);
            if(((Property)deck.get(listPl.getCurrentPlayer().getPosition())).getHotel()) {
                build.setEnabled(false);
            }
            
        } else if(deck.get(listPl.getCurrentPlayer().getPosition()).getOwner() == listPl.getPlayerFromIndex(0) && deck.get(listPl.getCurrentPlayer().getPosition()).isSalable() ) {
            buy.setEnabled(true);
            sell.setEnabled(false);
        } else if (deck.get(listPl.getCurrentPlayer().getPosition()).getOwner() != listPl.getPlayerFromIndex(0) && deck.get(listPl.getCurrentPlayer().getPosition()).isSalable() && deck.get(listPl.getCurrentPlayer().getPosition()).getOwner() != listPl.getCurrentPlayer()) {
            deck.get(listPl.getCurrentPlayer().getPosition()).action(listPl.getCurrentPlayer());
          //Da togliere
            JOptionPane.showMessageDialog(null,"il giocatore "+listPl.getCurrentPlayer().getName()+"possiede"+listPl.getCurrentPlayer().getMoney(),
                    "messaggio", 0);
            buy.setEnabled(true);
        } else if (deck.get(listPl.getCurrentPlayer().getPosition()).isSalable() == false) {
            if(deck.get(listPl.getCurrentPlayer().getPosition()).getName() == "Go To Prison") {
                ((Cel)grid.getSouthBox().getComponent(0)).getPositionPawns().resetPawnOnIndex(listPl.getIndexFromPlayer(listPl.getCurrentPlayer())-1);    
                ((Cel)grid.getNorthBox().getComponent(10)).getPositionPawns().setImageOnIndex(listPl.getIndexFromPlayer(listPl.getCurrentPlayer())-1, listPl.getCurrentPlayer().getPawn());
                deck.get(30).action(listPl.getCurrentPlayer());
            }
            deck.get(listPl.getCurrentPlayer().getPosition()).action(listPl.getCurrentPlayer());
        }
        nextPlayer.setEnabled(true);
        if(listPl.getCurrentPlayer().getMoney() <= 0) {
            JOptionPane.showMessageDialog(null,"il giocatore " + listPl.getCurrentPlayer().getName() + " ha perso! :(",
                    "messaggio", 0);
            rollDice.setEnabled(true);
            buy.setEnabled(false);
            sell.setEnabled(false);
            build.setEnabled(false);
            nextPlayer.setEnabled(false);
            listPl.nextPlayer();
            for(int i = 1; i<4; i++) {
                int stopTurns = listPl.getCurrentPlayer().getStopTurns();
                if(stopTurns != 0) {
                    //Da togliere
                    JOptionPane.showMessageDialog(null,"il giocatore " + listPl.getCurrentPlayer().getName() + " deve ancora aspettare " + stopTurns + "turni in prigione",
                            "messaggio", 0);
                    stopTurns -= 1;
                }
            }
          //Da togliere
            JOptionPane.showMessageDialog(null,"è il turno di "+ listPl.getCurrentPlayer().getName() + " e si trova sulla casella " + deck.get(listPl.getCurrentPlayer().getPosition()).getName(),
                    "messaggio", 0);
        }
        
    }
    
    
    
}
