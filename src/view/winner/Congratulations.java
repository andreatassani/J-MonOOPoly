package view.winner;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import model.player.ListOfPlayers;
/**
 * this class create the congratulation label for WinnerClass
 */
public class Congratulations extends JLabel { 
    /**
     * constructor.
     * @param list
     * @param dim
     * @param f
     * @param c
     */
    public Congratulations(ListOfPlayers list, Dimension dim, Font f, Color c) {
        this.setText(list.getCurrentPlayer().getName().toUpperCase() + " IS THE WINNER, CONGRATULATIONS!");
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setPreferredSize(new Dimension((int) (dim.getWidth()), (int) (dim.getHeight()/ 4)));
        this.setFont(f);
        this.setBackground(c);
        this.setForeground(Color.RED);
        this.setOpaque(true);
    }
}
