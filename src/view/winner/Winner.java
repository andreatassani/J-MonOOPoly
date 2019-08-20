package view.winner;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowListener;
import java.util.ArrayList;

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

import controller.windowListeners.CloseApplication;
import model.allTypeOfCard.Entity;
import model.allTypeOfCard.EntityDeck;
import model.allTypeOfCard.Property;
import model.myEnum.Colors;
import model.player.ListOfPlayers;
import view.play.MainExternContainer;
import view.play.MainExternContainerImpl;


public class Winner extends JFrame {
    /**
     * fields.
     */
    private static final long serialVersionUID = 1L;
    private static final Dimension dim = new Dimension((int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2), 
                                                       (int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 2));
    private final Font f = new Font("Aldhabi", Font.LAYOUT_LEFT_TO_RIGHT, 40);
    private final Font g = new Font("Aldhabi", Font.BOLD, 16);
    private final Font h = new Font("Aldhabi", Font.LAYOUT_LEFT_TO_RIGHT, 16);
    private final Color c = new Color(255, 137, 0);    


    /**
     * constructor.
     */
    public Winner(ListOfPlayers list, ArrayList<Entity> deck, MainExternContainerImpl main ) {
        this.add(new Congratulations(list, dim, f, c), BorderLayout.NORTH); 
        this.add(new InformationOfPlayerWinner(list, deck, g, c), BorderLayout.CENTER);
        this.add(new PropertiesOfPlayerWinner(list, g, h, c), BorderLayout.SOUTH);
        this.addWindowListener(new CloseApplication(this, (JFrame) main));
        this.pack();
        this.setPreferredSize(dim);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);   
    }
}
