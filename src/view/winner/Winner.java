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
    private Dimension dim = new Dimension((int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2), 
                                          (int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 2));
    private JLabel winner;
    private JPanel box;
    private JPanel flowPanel;
    private JLabel money;
    private JLabel col;
    private JLabel pawn;
    private JLabel pos;
    private final Font f = new Font("Aldhabi", Font.LAYOUT_LEFT_TO_RIGHT, 40);
    private final Font g = new Font("Aldhabi", Font.BOLD, 16);
    private final Font h = new Font("Aldhabi", Font.LAYOUT_LEFT_TO_RIGHT, 16);
    private final Color c = new Color(255, 137, 0);
    private JPanel info;
    private JLabel start;

    /**
     * constructor.
     */
    public Winner(ListOfPlayers list, EntityDeck deck ) {
        
        //setting congratulation on the north
        winner = new JLabel(list.getCurrentPlayer().getName().toUpperCase() + " IS THE WINNER, CONGRATULATIONS!");
        winner.setHorizontalAlignment(SwingConstants.CENTER);
        winner.setPreferredSize(new Dimension((int) (dim.getWidth()), (int) (dim.getHeight()/ 4)));
        winner.setFont(f);
        winner.setBackground(c);
        winner.setForeground(Color.RED);
        winner.setOpaque(true);
        
        //setting information about the winner in the center
        box= new JPanel(new GridLayout(2,1));
        box.setBackground(c);
        flowPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 100, 20));
        flowPanel.setBackground(c);
        pawn = new JLabel ("  ");
        pawn.setFont(g);
        pawn.setBackground(c);
        mySetIcon(pawn, "res/Pawns/" + list.getCurrentPlayer().getPawn() + ".png");
        pawn.setOpaque(true);
        paint = new JLabel();
        
        
        
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
        
        //setting information about the winner's properties in the south
        info = new JPanel(new GridLayout(0, 1));
        info.setBackground(c);
        
        
        start = new JLabel("Your property: ");
        start.setFont(g);
        start.setBackground(c);
        start.setHorizontalAlignment(SwingConstants.CENTER);
        start.setOpaque(true);
        
        info.add(start);
        
        
        for(Property s : list.getCurrentPlayer().getListOfProperties()) {
            JLabel label = new JLabel();
            label.setText(checkIsBuildable(s));
            label.setFont(h);
            label.setBackground(c);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setOpaque(true);
            info.add(label, BorderLayout.SOUTH);
        }

        flowPanel.add(pawn);
        flowPanel.add(money);
        flowPanel.add(col);
        flowPanel.add(pos);
        box.add(flowPanel);

        this.add(winner, BorderLayout.NORTH); 
        this.add(box, BorderLayout.CENTER);
        this.add(info, BorderLayout.SOUTH);
        
        this.pack();
        this.setPreferredSize(dim);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
         
    }
    
    public void mySetIcon(JLabel l, String s) {
        ImageIcon icon = new ImageIcon(s);
        Image scaledImage = icon.getImage().getScaledInstance( 70, 70,  Image.SCALE_DEFAULT);
        icon.setImage(scaledImage);
        l.setIcon(icon);
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
