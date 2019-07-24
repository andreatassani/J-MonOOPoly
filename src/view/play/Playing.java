package view.play;
import javafx.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.Window;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.text.html.ImageView;
/*
 * Class for play
 */
public class Playing extends JFrame {
    /*
     * constructor for the class
     */
    Playing() {

        final int DIMENSION_SQUARE_GRID = 11;
        Dimension dimPanelLeft = new Dimension();
        dimPanelLeft.height = Toolkit.getDefaultToolkit().getScreenSize().height;
        dimPanelLeft.width = (int) (Toolkit.getDefaultToolkit().getScreenSize().width / 2);


      //nome giocatore 
        final JTextArea roundPlayerName = new JTextArea();
        roundPlayerName.setText("TURNO DI:                         GIOCATORE #1");
        roundPlayerName.setEnabled(false);
        roundPlayerName.setBackground(Color.WHITE);

        //pannello rosso sinistro 
        final JPanel leftSide = new JPanel(new BorderLayout());
        leftSide.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        leftSide.setBackground(Color.RED);
        leftSide.setPreferredSize(dimPanelLeft);
        
        //bordi bianchi del pannello rosso
        final TextField leftBorder = new TextField();
        final TextField rightBorder = new TextField();
        
        leftSide.add(roundPlayerName, BorderLayout.NORTH);    //aggiunta testo giocatore
        leftSide.add(leftBorder, BorderLayout.EAST);  //bordo bianco
        leftSide.add(rightBorder, BorderLayout.WEST);  //bordo bianco
        leftSide.add(new GridCards(new GridLayout(DIMENSION_SQUARE_GRID, DIMENSION_SQUARE_GRID)));
        leftSide.add(new UtilityButtons(new GridLayout()), BorderLayout.SOUTH);
        
        final Box boxHistSit = new Box(BoxLayout.Y_AXIS);
        boxHistSit.add(new Situation(new BorderLayout()));
        boxHistSit.add(new History(new BorderLayout()));
        
        final Box boxLeftRight = new Box(BoxLayout.X_AXIS);
        boxLeftRight.add(leftSide);
        boxLeftRight.add(boxHistSit);
        
        this.setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.add(boxLeftRight);
        this.setResizable(true);
        this.setVisible(true);

    }

    /*
     * main method to run the view
     */
    public static void main(final String[] args) {
        /*
         * run the game
         */
        Playing play = new Playing();
    }
}
