package view.winner;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import model.allTypeOfCard.Property;
import model.player.ListOfPlayers;

public class PropertiesOfPlayerWinner extends JPanel {
    /**
     * fields.
     */
    private JLabel start;
    /**
     * constructor.
     * @param list
     * @param g
     * @param c
     */
    public PropertiesOfPlayerWinner(ListOfPlayers list, Font g, Font h, Color c) {
        this.setLayout(new GridLayout(0, 1));
        this.setBackground(c);
        start = new JLabel("Your property: ");
        start.setFont(g);
        start.setBackground(c);
        start.setHorizontalAlignment(SwingConstants.CENTER);
        start.setOpaque(true);
        
        this.add(start);
        
        
        for(Property s : list.getCurrentPlayer().getListOfProperties()) {
            JLabel label = new JLabel();
            label.setText(checkIsBuildable(s));
            label.setFont(h);
            label.setBackground(c);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setOpaque(true);
            this.add(label, BorderLayout.SOUTH);
        }

        
    }
    
    public int checkNumHotel(boolean b) {
        if(b == true) return 1;
        else return 0;
    }
    
    public String checkNumHouses(Property s) {
        String t = new String();
        if(s.getHouses() > 0) t = "houses";
        else t = "house";
        return t;
    }
    
    public String checkIsBuildable(Property s) {
        String t = new String();
        if(s.isBuildable()) {
            t = (s.getName() + " with " + s.getHouses() + " " + checkNumHouses(s) + " and " + 
                 checkNumHotel(s.getHotel()) + " hotel");
        }
        else {
            t = (s.getName() + ": you couldn't build here");
        }
        return t;
    }
}
