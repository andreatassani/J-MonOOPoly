package controller.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.history.History;
import model.player.ListOfPlayers;

public class NextPlayer implements ActionListener {
/**
 * fields
 */
    private final ListOfPlayers listPl;
    private final JButton rollDice;
    private final JButton buy;
    private final JButton sell;
    private final JButton build;
    private final JButton nextPlayerButton;
    private final History history;
/**
 * constructor
 */
    public NextPlayer(final ListOfPlayers listPl,final JButton rolldDice,final JButton buy,final JButton sell,final JButton build,
                      final JButton nextPlayer,final History history) {
        this.listPl = listPl;
        this.rollDice = rolldDice;
        this.buy = buy;
        this.sell = sell;
        this.build = build;
        this.nextPlayerButton = nextPlayer;
        this.history = history;
    }
    @Override
    public void actionPerformed(final ActionEvent e) {
        rollDice.setEnabled(true);
        buy.setEnabled(false);
        sell.setEnabled(false);
        build.setEnabled(false);
        nextPlayerButton.setEnabled(false);
        listPl.nextPlayer();
        history.startTurn(listPl.getCurrentPlayer());
        if(listPl.getCurrentPlayer().getStopTurns() == 0 && listPl.getCurrentPlayer().getPosition() == 10) {
        	history.endStop(listPl.getCurrentPlayer());
          }
        if(listPl.getCurrentPlayer().getStopTurns() != 0) {
            history.stop(listPl.getCurrentPlayer(),listPl.getCurrentPlayer().getStopTurns());
        listPl.getCurrentPlayer().setStopTurns(listPl.getCurrentPlayer().getStopTurns()-1);
            rollDice.setEnabled(false);
            nextPlayerButton.setEnabled(true);
        }
    }

}
