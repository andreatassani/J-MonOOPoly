package view.play;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.TextField;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
/*
 * Class for play
 */
public class Playing {
    /*
     * constructor for the class
     */
    Playing() {

        
        final int ARRAY_CARDS_LENGTH = 121;
        final int ID_BUTTON_ROLL_DICE = 60;
        final int DIMENSION_SQUARE_GRID = 11;
        
        //frame principale
        JFrame frame = new JFrame();
        frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        Box view = new Box(BoxLayout.X_AXIS);
        
        //RIQUADRO DI GIOCO
        
        //nome giocatore 
        JTextArea name = new JTextArea();
        name.setText("TURNO DI:                         GIOCATORE #1");
        name.setEnabled(false);
        name.setBackground(Color.WHITE);

        //pannello rosso sinistro 
        JPanel panelleft = new JPanel(new BorderLayout());
        panelleft.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panelleft.setBackground(Color.RED);
        
        //bordi bianchi del pannello rosso
        TextField border1 = new TextField();
        TextField border2 = new TextField();
        
        panelleft.add(name, BorderLayout.NORTH);    //aggiunta testo giocatore
        panelleft.add(border1, BorderLayout.EAST);  //bordo bianco
        panelleft.add(border2, BorderLayout.WEST);  //bordo bianco
        
        //pannello caselle
        JPanel grid = new JPanel(new GridLayout(DIMENSION_SQUARE_GRID, DIMENSION_SQUARE_GRID));
        grid.setBackground(new Color(139, 250, 180));
        panelleft.add(grid);
        grid.setVisible(true);
        
        //creazione caselle e settaggio colori proprietà
        JPanel[] allCards = new JPanel[ARRAY_CARDS_LENGTH];
        for (int i = 0; i <= ARRAY_CARDS_LENGTH - 1; i++) {
            allCards[i] = new JPanel(new BorderLayout());
            grid.add(allCards[i]);
            allCards[i].setVisible(true);
            
            
            allCards[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            if ((i == 1) || (i == 3)) {
                allCards[i].setBackground(new Color(255, 153, 204));
                allCards[i].add(new JButton("" + i), BorderLayout.NORTH);
                }
            
            if ((i == 6) || (i == 8) || (i == 9)) {
                allCards[i].setBackground(Color.BLUE);
                allCards[i].add(new JButton("" + i), BorderLayout.NORTH);
                }
            
            if ((i == 21) || (i == 43) || (i == 54)) {
                allCards[i].setBackground(Color.ORANGE);
                allCards[i].add(new JButton("" + i), BorderLayout.NORTH);
                }
            
            if ((i == 76) || (i == 98) || (i == 109)) {
                allCards[i].setBackground(new Color(153, 76, 0));
                allCards[i].add(new JButton("" + i), BorderLayout.NORTH);
                }
            
            if ((i == 116) || (i == 117) || (i == 119)) {
                allCards[i].setBackground(Color.RED);
                allCards[i].add(new JButton("" + i), BorderLayout.NORTH);
                }
            
            if ((i == 111) || (i == 112) || (i == 114)) {
                allCards[i].setBackground(Color.YELLOW);
                allCards[i].add(new JButton("" + i), BorderLayout.NORTH);
                }
            
            if ((i == 66) || (i == 88) || (i == 99)) {
                allCards[i].setBackground(new Color(0, 204, 0));
                allCards[i].add(new JButton("" + i), BorderLayout.NORTH);
                }
            
            if ((i == 11) || (i == 33)) {
                allCards[i].setBackground(new Color(153, 0 ,153));
                allCards[i].add(new JButton("" + i), BorderLayout.NORTH);
                }
            
            //settaggio icone 
       
            if ((i == 2) || (i == 32) || (i == 77)) {
                allCards[i].add(new JButton("probabilità"), BorderLayout.NORTH);
                JButton cont = new JButton();
                allCards[i].add(cont, BorderLayout.CENTER);
                }
            
            if (i == 0 ) {
                allCards[i].add(new JButton("via"), BorderLayout.NORTH);
                JButton cont = new JButton();
                allCards[i].add(cont, BorderLayout.CENTER);
                }
            
            if (i == 110) {
                allCards[i].add(new JButton("arresto"), BorderLayout.NORTH);
                JButton cont = new JButton();
                allCards[i].add(cont, BorderLayout.CENTER);
                }
            
            if (i == 120) {
                allCards[i].add(new JButton("parcheggio"), BorderLayout.NORTH);
                JButton cont = new JButton();
                allCards[i].add(cont, BorderLayout.CENTER);
                }
            
            if (i == 10) {
                allCards[i].add(new JButton("prigione"), BorderLayout.NORTH);
                JButton cont = new JButton();
                allCards[i].add(cont, BorderLayout.CENTER);
                }
            
            if ((i == 7) || (i == 34) || (i == 118)) {
                allCards[i].add(new JButton("probabilità"), BorderLayout.NORTH);
                JButton cont = new JButton();
                allCards[i].add(cont, BorderLayout.CENTER);
                }
            
            if ((i == 5) || (i == 55) || (i == 65) || (i == 115)) {
                allCards[i].add(new JButton("stazione"), BorderLayout.NORTH);
                JButton cont = new JButton();
                allCards[i].add(cont, BorderLayout.CENTER);
                }
            
            if (i == 87) {
                allCards[i].add(new JButton("enel"), BorderLayout.NORTH);
                JButton cont = new JButton();
                allCards[i].add(cont, BorderLayout.CENTER);
                }
            
            if (i == 113) {
                allCards[i].add(new JButton("hera"), BorderLayout.NORTH);
                JButton cont = new JButton();
                cont.setIcon(new ImageIcon("acqua.jpg"));
                allCards[i].add(cont, BorderLayout.CENTER);
                }
            
            if (i == 4) {
                allCards[i].add(new JButton("tassa"), BorderLayout.NORTH);
                JButton cont = new JButton();
                allCards[i].add(cont, BorderLayout.CENTER);
                }
            
            
            //eliminazione caselle centrali 
            if ((i >= 12 && i <= 20) || (i >= 23 && i <= 31) || (i >= 34 && i <= 42) ||
                    (i >= 45 && i <= 53) || (i >= 56 && i <= 59) || (i >= 61 && i <= 64) ||
                    (i >= 67 && i <= 75) || (i >= 78 && i <= 86) || (i >= 89 && i <= 97) || (i >= 100 && i <= 108)) {
                   allCards[i].setVisible(false);
            }
            
            //settaggio tasto di lancio dadi 
            if (i == ID_BUTTON_ROLL_DICE) {
                allCards[i].add(new JButton("roll dice"), BorderLayout.CENTER);
            }
            
        }

        //BOTTONI IN BASSO
        
        //quattro bottoni da mettere in un box 
        JButton buy = new JButton("buy");
        JButton sell = new JButton("sell");
        JButton build = new JButton("build");
        JButton menu = new JButton("menu'");
        
        //box per bottoni
        JPanel buttons = new JPanel(new GridLayout());
        buttons.add(buy);
        buttons.add(sell);
        buttons.add(build);
        buttons.add(menu);
        panelleft.add(buttons, BorderLayout.SOUTH);
        
        //RIQUADRI HISTORY E SITUATION
        
        //right upper panel
        JPanel panelrightupper = new JPanel(new BorderLayout());
        panelrightupper.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panelrightupper.setBackground(Color.YELLOW);
        
        JTextField situation = new JTextField();
        situation.setText("                                       SITUATION");
        situation.setVisible(true);
        situation.setEnabled(false);
        panelrightupper.add(situation, BorderLayout.NORTH);
         
        //right lower panel
        JPanel panelrightlower = new JPanel(new BorderLayout());
        panelrightlower.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panelrightlower.setBackground(Color.PINK);
        
        JTextField history = new JTextField();
        history.setText("                                     HISTORY");
        history.setVisible(true);
        history.setEnabled(false);
        panelrightlower.add(history, BorderLayout.NORTH);

        //right box where put two right panels
        Box box = new Box(BoxLayout.Y_AXIS);
        box.add(panelrightupper);
        box.add(panelrightlower);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(view);
        view.add(panelleft);
        view.add(box);
        frame.setResizable(true);
        frame.setVisible(true);
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
