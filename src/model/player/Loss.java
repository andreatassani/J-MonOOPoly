package model.player;

import javax.swing.JOptionPane;
import view.play.PawnMovement;

public class Loss {

    public Loss(ListOfPlayers listPl, PawnMovement pawnMovement){
        PlayerImpl pl = listPl.getCurrentPlayer();
        int pos = pl.getPosition();
        JOptionPane.showMessageDialog(null,"il giocatore " + pl.getName() + " ha perso! :(",
                "messaggio", 0);
                  pawnMovement.removePawn(pos, pl);
                  pawnMovement.removePawn(listPl.getPlayerFromIndex(listPl.getNumberPlayer()).getPosition(), listPl.getPlayerFromIndex(listPl.getNumberPlayer()));
                  listPl.removePlayer(pl);
                      for(int i = 1; i<= listPl.getNumberPlayer(); i++) {
                          pawnMovement.removePawn(listPl.getPlayerFromIndex(i).getPosition(), listPl.getPlayerFromIndex(i));
                          pawnMovement.addPawn(listPl.getPlayerFromIndex(i).getPosition(), listPl.getPlayerFromIndex(i));
                      }
                 JOptionPane.showMessageDialog(null,"è il turno del giocatore: "+listPl.getCurrentPlayer().getName(),
                              "messaggio", 0);
    }
}
