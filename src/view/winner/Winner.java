package view.winner;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import model.player.PlayerImpl;

public class Winner extends JPanel {
    
    private JLabel winner;
    private JLabel name;
    private JLabel pawn;
    private JLabel color;
    private JLabel money;
    private Box features;
    private static Dimension d = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
    
    public Winner(PlayerImpl winnerPlayer)  {
        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension((int) (d.getWidth()) / 2, (int) (d.getHeight() / 2)));
        
        winner = new JLabel(winnerPlayer.getName().toUpperCase() +" IS THE WINNER");
        winner.setPreferredSize(new Dimension(this.getWidth() / 2, (int) (d.getHeight() / 5)));
        
        this.add(winner, BorderLayout.NORTH);
        winner.setHorizontalAlignment(SwingConstants.CENTER);
        
        features = new Box(BoxLayout.X_AXIS);
        
        name = new JLabel(winnerPlayer.getName().toUpperCase());
        pawn = new JLabel(winnerPlayer.getPawn().name());
        color = new JLabel();
        color.setBackground(winnerPlayer.getColors());
        money = new JLabel(""+winnerPlayer.getMoney());
        
        features.add(name);
        features.add(money);
        features.add(pawn);
        features.add(color);
        
        
        

        
        
    }
public static void main(String[] args) {
    
    Winner win = new Winner(null);
}
}
