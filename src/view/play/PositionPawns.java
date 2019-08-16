package view.play;

import java.awt.Color;

import javax.swing.JLabel;

import model.myEnum.Pawns;
import model.player.PlayerImpl;
/**
 * 
 * interface that models the visualization of pawns inside each cell.
 *
 */
public interface PositionPawns {
    /**
     * method that allow to set an icon on a label.
     * @param b
     * @param s
     */
    public void mySetIcon(JLabel b, String s, Color col);
    /**
     * method that allows to delete an icon from a label.
     * @param i
     */
    public void resetPawnOnIndex(int i);
    /**
     * method that allows to set a new icon in a label.
     * @param i
     * @param p
     * @param pl
     */
    public void setImageOnIndex(int i,PlayerImpl pl);

}
