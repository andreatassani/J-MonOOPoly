package view.winner;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import model.player.ListOfPlayersImpl;
/**
 * this class create the congratulation label for WinnerClass.
 */
public class Congratulations extends JLabel { 
    /**
     * 
     */
    private static final long serialVersionUID = -322515245024584049L;

    /**
     * constructor.
     * @param list list of the players
     * @param dim dimension
     * @param f font of the text
     * @param c color of the text
     */
    public Congratulations(final ListOfPlayersImpl list, final Dimension dim, final Font f, final Color c) {
        this.setText(list.getCurrentPlayer().getName().toUpperCase() + " IS THE WINNER, CONGRATULATIONS!");
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setPreferredSize(new Dimension((int) (dim.getWidth()), (int) (dim.getHeight() / 4)));
        this.setFont(f);
        this.setBackground(c);
        this.setForeground(Color.RED);
        this.setOpaque(true);
    }
}
