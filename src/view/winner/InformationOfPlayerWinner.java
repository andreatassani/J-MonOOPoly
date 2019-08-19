package view.winner;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.allTypeOfCard.EntityDeck;
import model.player.ListOfPlayers;

public class InformationOfPlayerWinner extends JPanel {
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
     * @param list
     * @param g
     * @param c
     */
    public InformationOfPlayerWinner(ListOfPlayers list, EntityDeck deck, Font g, Color c) {
        this.setLayout(new GridLayout(2,1));
        this.setBackground(c);
        flowPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 100, 20));
        flowPanel.setBackground(c);
        pawn = new JLabel ("  ");
        pawn.setFont(g);
        pawn.setBackground(c);
        mySetIcon(pawn, "res/Pawns/" + list.getCurrentPlayer().getPawn() + ".png");
        pawn.setOpaque(true);
        
        
        
        money = new JLabel ("  Remaining money : " + list.getCurrentPlayer().getMoney() + " $  ");
        money.setFont(g);
        money.setBackground(c);
        money.setOpaque(true);
        
        col = new JLabel ("  Your color  ");
        col.setFont(g);
        col.setBackground(list.getCurrentPlayer().getColors());
        col.setOpaque(true);
        
        pos = new JLabel ("  Your final position: " + deck.getDeck().get(list.getCurrentPlayer().getPosition()).getName() + "  ");
        pos.setFont(g);
        pos.setBackground(c);
        pos.setOpaque(true);
        

        flowPanel.add(pawn);
        flowPanel.add(money);
        flowPanel.add(col);
        flowPanel.add(pos);
        this.add(flowPanel);
        
    }
    
    
    public void mySetIcon(JLabel l, String s) {
        ImageIcon icon = new ImageIcon(s);
        Image scaledImage = icon.getImage().getScaledInstance( 70, 70,  Image.SCALE_DEFAULT);
        icon.setImage(scaledImage);
        l.setIcon(icon);
    }
}
