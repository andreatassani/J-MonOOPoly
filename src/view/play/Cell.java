package view.play;

import java.awt.Dimension;

import javax.swing.JButton;
/**
 * 
 * interface that models a cell in the grid of playground.
 *
 */
public interface Cell {
    /**
     * 
     * @return the position of a  pawn.
     */
    public PositionPawnsImpl getPositionPawns();
    /**
     * it allows to set the dimension of a panel.
     * @param d
     */
    public void mySetSize(Dimension d);
    /**
     * it allows to set the image in a button.
     * @param b
     * @param s
     */
    public void mySetIcon(JButton b, String s);
    
    
}
