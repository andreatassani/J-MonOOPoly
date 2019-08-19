package view.winner;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import model.allTypeOfCard.EntityDeck;
import model.allTypeOfCard.Property;
import model.myEnum.Colors;
import model.player.ListOfPlayers;


public class Winner extends JFrame {
    /**
     * fields.
     */
    private static final Dimension dim = new Dimension((int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2), 
            (int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 2));
    private JPanel box;
    
    private final Font f = new Font("Aldhabi", Font.LAYOUT_LEFT_TO_RIGHT, 40);
    private final Font g = new Font("Aldhabi", Font.BOLD, 16);
    private final Font h = new Font("Aldhabi", Font.LAYOUT_LEFT_TO_RIGHT, 16);
    private final Color c = new Color(255, 137, 0);


    /**
     * constructor.
     */
    public Winner(ListOfPlayers list, EntityDeck deck ) {
        
        //setting congratulation on the north
        
        
        //setting information about the winner in the center

        //setting information about the winner's properties in the south
 

        this.add(new Congratulations(list, dim, f, c), BorderLayout.NORTH); 
        this.add(new InformationOfPlayerWinner(list, deck, g, c), BorderLayout.CENTER);
        this.add(new PropertiesOfPlayerWinner(list, g, h, c), BorderLayout.SOUTH);
        
        this.pack();
        this.setPreferredSize(dim);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
         
    }

    
    

}
