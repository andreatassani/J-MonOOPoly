package view.play;

import javax.swing.JOptionPane;

import model.player.ListOfPlayers;
import model.player.PlayerImpl;

public class PawnMovement {
    private static final int START = 0;
    private static final int PRISON = 10;
    private static final int PARKING = 20;
    private static final int POLICE = 30;
    private static final int MAXPOSITION = 39;
    private static final String NORTH = "North";
    private static final String EAST= "East";
    private static final String SOUTH = "South";
    private static final String WEST = "West";
    
    private GridCell grid;
    private ListOfPlayers listPl;
    
    public PawnMovement(GridCell grid, ListOfPlayers listPl) {
        this.grid = grid;
        this.listPl = listPl;
    }
    

    public PositionPawns getPositionPawn (String pole, int pos) {
        if(pole.equals(NORTH)) {
            return ((Cel)grid.getNorthBox().getComponent(pos)).getPositionPawns();
        } else if(pole.equals(EAST)) {
            return ((Cel)grid.getEastBox().getComponent(pos)).getPositionPawns();
        } else if(pole.equals(SOUTH)) {
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
}
