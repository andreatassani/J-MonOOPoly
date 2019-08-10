package view.play;

import model.player.ListOfPlayers;

public class ShowStatus {
     ShowStatus(final ListOfPlayers ListPl){
         System.out.println("è il turno di :"+ ListPl.getCurrentPlayer().getName());
     }
}
