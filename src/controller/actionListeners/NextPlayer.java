package controller.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import controller.audio.AudioManager;
import model.history.History;
import model.player.ListOfPlayers;

public class NextPlayer implements ActionListener {

    private ListOfPlayers listPl;
    private JButton rollDice;
    private JButton buy;
    private JButton sell;
    private JButton build;
    private JButton nextPlayer;
    private final History history;
    
    

    public NextPlayer(ListOfPlayers listPl, JButton rolldDice,JButton buy, JButton sell, JButton build, JButton nextPlayer,History history) {
        this.listPl = listPl;
        this.rollDice = rolldDice;
        this.buy = buy;
        this.sell = sell;
        this.build = build;
        this.nextPlayer = nextPlayer;
        this.history = history;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        rollDice.setEnabled(true);
        buy.setEnabled(false);
        sell.setEnabled(false);
        build.setEnabled(false);
        nextPlayer.setEnabled(false);
        listPl.nextPlayer();
      //Da togliere
        history.startTurn(listPl.getCurrentPlayer());
        if(listPl.getCurrentPlayer().getStopTurns() == 0 && listPl.getCurrentPlayer().getPosition() == 10) {
            //Da togliere
        	history.endStop(listPl.getCurrentPlayer());
          }
        if(listPl.getCurrentPlayer().getStopTurns() != 0) {
          //Da togliere
           
            history.stop(listPl.getCurrentPlayer(),listPl.getCurrentPlayer().getStopTurns());
        listPl.getCurrentPlayer().setStopTurns(listPl.getCurrentPlayer().getStopTurns()-1);
            rollDice.setEnabled(false);
            nextPlayer.setEnabled(true);
        }
    }

}
