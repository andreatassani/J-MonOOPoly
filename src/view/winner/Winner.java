package view.winner;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JFrame;

import controller.windowListeners.CloseApplication;
import model.allTypeOfCard.Entity;
import model.player.ListOfPlayers;
import view.play.MainExternContainerImpl;

/**
 * a class for the win.
 */
public class Winner extends JFrame {
    /**
     * fields.
     */
    private static final long serialVersionUID = 1L;
    private static final Dimension DIM = new Dimension((int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2), 
                                                       (int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 2));
    private final Font f = new Font("Aldhabi", Font.LAYOUT_LEFT_TO_RIGHT, 40);
    private final Font g = new Font("Aldhabi", Font.BOLD, 16);
    private final Font h = new Font("Aldhabi", Font.LAYOUT_LEFT_TO_RIGHT, 16);
    private final Color c = new Color(255, 137, 0);
    /**
     * constructor.
     * @param list list of players
     * @param deck card's deck
     * @param main the main extern container
     */
    public Winner(final ListOfPlayers list, final ArrayList<Entity> deck, final MainExternContainerImpl main) {
        this.add(new Congratulations(list, DIM, f, c), BorderLayout.NORTH); 
        this.add(new InformationOfPlayerWinner(list, deck, g, c), BorderLayout.CENTER);
        this.add(new PropertiesOfPlayerWinner(list, g, h, c), BorderLayout.SOUTH);
        this.addWindowListener(new CloseApplication(this, (JFrame) main));
        this.pack();
        this.setPreferredSize(DIM);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }
}