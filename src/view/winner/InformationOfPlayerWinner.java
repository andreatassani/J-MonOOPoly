package view.winner;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.allTypeOfCard.Entity;
import model.player.ListOfPlayers;
/**
 * this class create the information of the Winner Player.
 */
public class InformationOfPlayerWinner extends JPanel {
    /**
     * 
     */
    private static final long serialVersionUID = -122277042892101387L;
    /**
     * fields.
     */
    private JPanel flowPanel;
    private JLabel money;
    private JLabel col;
    private JLabel pawn;
    private JLabel pos;
    /**
     * constructor.
     * @param list list of players
     * @param deck card's deck
     * @param g font
     * @param c color
     */
    public InformationOfPlayerWinner(final ListOfPlayers list, final ArrayList<Entity> deck, final Font g, final Color c) {
        this.setLayout(new GridLayout(2, 1));
        this.setBackground(c);
        flowPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 100, 20));
        flowPanel.setBackground(c);
        pawn = new JLabel("  ");
        pawn.setFont(g);
        pawn.setBackground(c);
        mySetIcon(pawn, "/Pawns/" + list.getCurrentPlayer().getPawn() + ".png");
        pawn.setOpaque(true);


        money = new JLabel("  Remaining money : " + list.getCurrentPlayer().getMoney() + " $  ");
        money.setFont(g);
        money.setBackground(c);
        money.setOpaque(true);

        col = new JLabel("  Your color  ");
        col.setFont(g);
        col.setBackground(list.getCurrentPlayer().getColors());
        col.setOpaque(true);

        pos = new JLabel("  Your final position: " + deck.get(list.getCurrentPlayer().getPosition()).getName() + "  ");
        pos.setFont(g);
        pos.setBackground(c);
        pos.setOpaque(true);

        flowPanel.add(pawn);
        flowPanel.add(money);
        flowPanel.add(col);
        flowPanel.add(pos);
        this.add(flowPanel);
    }
    /**
     * 
     * @param l a JLabel
     * @param s string for the image URL
     */
    public void mySetIcon(final JLabel l, final String s) {
        ImageIcon icon = new ImageIcon(this.getClass().getResource(s));
        Image scaledImage = icon.getImage().getScaledInstance(70, 70,  Image.SCALE_DEFAULT);
        icon.setImage(scaledImage);
        l.setIcon(icon);
    }
}
