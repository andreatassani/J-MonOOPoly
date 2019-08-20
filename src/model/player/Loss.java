package model.player;

import java.util.Optional;

import javax.swing.JOptionPane;

import model.history.History;
import model.history.HistoryImpl;
import view.play.PawnMovement;

public class Loss {
	private History history;
    public Loss(ListOfPlayers listPl, PawnMovement pawnMovement){
    	history = new HistoryImpl(Optional.empty());
        PlayerImpl pl = listPl.getCurrentPlayer();
        int pos = pl.getPosition();
        history.losePlayer(pl);
                  pawnMovement.removePawn(pos, pl);
                  pawnMovement.removePawn(listPl.getPlayerFromIndex(listPl.getNumberPlayer()).getPosition(), listPl.getPlayerFromIndex(listPl.getNumberPlayer()));
                  listPl.removePlayer(pl);
                      for(int i = 1; i<= listPl.getNumberPlayer(); i++) {
                          pawnMovement.removePawn(listPl.getPlayerFromIndex(i).getPosition(), listPl.getPlayerFromIndex(i));
                          pawnMovement.addPawn(listPl.getPlayerFromIndex(i).getPosition(), listPl.getPlayerFromIndex(i));
                      }
                 history.startTurn(listPl.getCurrentPlayer());
    }
}
