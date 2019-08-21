package view.winner;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import model.allTypeOfCard.Property;
import model.player.ListOfPlayersImpl;
/**
 * this class check the properties of the Winner Player.
 */
public class PropertiesOfPlayerWinner extends JPanel {
    /**
     * 
     */
    private static final long serialVersionUID = 6106899836121968164L;
    /**
     * fields.
     */
    private JLabel start;
    /**
     * constructor.
     * @param list list of the players
     * @param g font of start
     * @param h font of label 
     * @param c color
     */
    public PropertiesOfPlayerWinner(final ListOfPlayersImpl list, final Font g, final Font h, final Color c) {
        this.setLayout(new GridLayout(0, 1));
        this.setBackground(c);
        start = new JLabel("Your property: ");
        start.setFont(g);
        start.setBackground(c);
        start.setHorizontalAlignment(SwingConstants.CENTER);
        start.setOpaque(true);

        this.add(start);

        for (Property s : list.getCurrentPlayer().getListOfProperties()) {
            JLabel label = new JLabel();
            label.setText(checkIsBuildable(s));
            label.setFont(h);
            label.setBackground(c);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setOpaque(true);
            this.add(label, BorderLayout.SOUTH);
        }
    }
    /**
     * a method in order to check the number of Hotels.
     * @param b true if the player has a hotel
     * @return the number of hotels if b is true 
     */
    public int checkNumHotel(final boolean b) {
        if (b) {
            return 1;
        } else {
            return 0;
        }
    }
    /**
     * a method in order to check the number of Houses.
     * @param s the property.
     * @return the correct string depending on the numbers of properties.
     */
    public String checkNumHouses(final Property s) {
        String t = new String();
        if (s.getHouses() > 0) {
            t = "houses";
        } else {
            t = "house";
        }
        return t;
    }
    /**
     * a method in order to check if a property is buildable.
     * @param s the property
     * @return the string corresponding to the situation
     */
    public String checkIsBuildable(final Property s) {
        String t = new String();
        if (s.isBuildable()) {
            t = (s.getName() + " with " + s.getHouses() + " " + checkNumHouses(s) + " and " 
                    + checkNumHotel(s.getHotel()) + " hotel");
        } else {
            t = (s.getName() + ": you couldn't build here");
        }
        return t;
    }
}