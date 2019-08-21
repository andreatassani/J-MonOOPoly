package view.play;

import java.util.Optional;

import model.history.History;
import model.history.HistoryImpl;
import model.player.ListOfPlayersImpl;
import model.player.PlayerImpl;

public class PawnMovement {
/**
 * constants
 */
    private static final int START = 0;
    private static final int PRISON = 10;
    private static final int PARKING = 20;
    private static final int POLICE = 30;
    private static final int MAXPOSITION = 39;
    private static final String NORTH = "North";
    private static final String EAST= "East";
    private static final String SOUTH = "South";
    private static final String WEST = "West";
/**
 * fields    
 */
    private final GridCell grid;
    private final ListOfPlayersImpl listPl;
    private final History history;
/**
 * constructor
 */
    public PawnMovement(final GridCell grid,final ListOfPlayersImpl listPl) {
        this.grid = grid;
        this.listPl = listPl;
        this.history = new HistoryImpl(Optional.empty());
    }
/**
 * 
 * @param pole
 * @param pos
 * @return the PositionPawns of the component of the correct box 
 */
    public PositionPawns getPositionPawn (final String pole,final int pos) {
        if(pole.equals(NORTH)) {
            return ((Cell)grid.getNorthBox().getComponent(pos)).getPositionPawns();
        } else if(pole.equals(EAST)) {
            return ((Cell)grid.getEastBox().getComponent(pos)).getPositionPawns();
        } else if(pole.equals(SOUTH)) {
            return ((Cell)grid.getSouthBox().getComponent(pos)).getPositionPawns();
        } else {
            return ((Cell)grid.getWestBox().getComponent(pos)).getPositionPawns();
        }
    }
/**    
 * removes the image of pawn from the position of the PlayerImpl pl
 * @param pos
 * @param pl
 */
    public void removePawn(final int pos,final PlayerImpl pl) {
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
/**    
 * adds the image of the pawn in the position of PlayerImpl pl
 * @param newPos
 * @param pl
 */
    public void addPawn(final int newPos,final PlayerImpl pl) {
        if(newPos>= START && newPos<= PRISON) {
            this.getPositionPawn(NORTH, newPos).setImageOnIndex(listPl.getIndexFromPlayer(pl)-1, pl);
        } else if (newPos>=PRISON+1 && newPos<=PARKING-1){
            this.getPositionPawn(EAST, newPos-(PRISON+1)).setImageOnIndex(listPl.getIndexFromPlayer(pl)-1, pl);
        } else if(newPos>=PARKING && newPos<=POLICE) {
            this.getPositionPawn(SOUTH, POLICE-newPos).setImageOnIndex(listPl.getIndexFromPlayer(pl)-1, pl);
        } else if(newPos>=POLICE+1 && newPos<=MAXPOSITION) {
            this.getPositionPawn(WEST, MAXPOSITION-newPos).setImageOnIndex(listPl.getIndexFromPlayer(pl)-1, pl);
        }
    }
/**
 * updates the positionPawn of the PlayerImpl pl 
 * @param pos
 * @param risultato
 * @param pl
 * @return
 */
    public int updatePosition(final int pos,final int risultato,final PlayerImpl pl) {
        
        int newPos;
        this.removePawn(pos, pl);
        if(pos+risultato >= MAXPOSITION+1) {
            pl.setPosition(pos+risultato-(MAXPOSITION+1));
            newPos = pl.getPosition();
            if(risultato != 18) {
            listPl.getCurrentPlayer().setMoney(200);
            history.start(pl);
            }
        } else {
            pl.setPosition(pos+risultato);
            newPos = pl.getPosition();
        }
        this.addPawn(newPos, pl);
        return newPos;
    }
}
