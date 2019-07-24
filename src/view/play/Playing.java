package view.play;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JTextArea;


/*
 * Class for play
 */
public class Playing extends JPanel {
	
	
	
    /*
     * constructor for the class that manage the paying view
     */
    public Playing() {

    	final int DIMENSION_SQUARE_GRID = 11;
    	final JPanel leftSide = new JPanel(new BorderLayout());
    	final JTextArea roundPlayerName = new JTextArea();
    	final TextField leftBorder = new TextField();
        final TextField rightBorder = new TextField();
        final Box boxHistSit = new Box(BoxLayout.Y_AXIS);
        final Box boxLeftRight = new Box(BoxLayout.X_AXIS);
        
        //dimension for for the leftside panel
        
        Dimension dimPanelLeft = new Dimension();
        dimPanelLeft.height = Toolkit.getDefaultToolkit().getScreenSize().height;
        dimPanelLeft.width = (int) (Toolkit.getDefaultToolkit().getScreenSize().width / 2);

        //set player that has the round
        
        roundPlayerName.setText("TURNO DI:                         GIOCATORE #1");
        roundPlayerName.setEnabled(false);
        roundPlayerName.setBackground(Color.WHITE);

        //panel that will contain the grid of all cards 
        
        leftSide.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        leftSide.setBackground(Color.RED);
        leftSide.setPreferredSize(dimPanelLeft);
                
        leftSide.add(roundPlayerName, BorderLayout.NORTH);    //aggiunta testo giocatore
        leftSide.add(leftBorder, BorderLayout.EAST);  //bordo bianco
        leftSide.add(rightBorder, BorderLayout.WEST);  //bordo bianco
        leftSide.add(new GridCards(new GridLayout(DIMENSION_SQUARE_GRID, DIMENSION_SQUARE_GRID)));
        leftSide.add(new UtilityButtons(new GridLayout()), BorderLayout.SOUTH);
        
        //create rightside panel for history and situation
        
        boxHistSit.add(new Situation(new BorderLayout()));
        boxHistSit.add(new History(new BorderLayout()));
        
        //minus coponent into the biggest container
        
        boxLeftRight.setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        boxLeftRight.add(leftSide);
        boxLeftRight.add(boxHistSit);
        boxLeftRight.setVisible(true);
        this.add(boxLeftRight);
        this.setVisible(true);
    }
}
