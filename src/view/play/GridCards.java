package view.play;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.LayoutManager;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
/*
 * class for the gridcards ground
 */
public class GridCards extends JPanel {
	/*
	 * constructor for this class
	 */
	public GridCards(LayoutManager layout) {
		super(layout);
		
		final int ID_BUTTON_ROLL_DICE = 60;
		final int ARRAY_CARDS_LENGTH = 121;
		
        JPanel[] allCards = new JPanel[ARRAY_CARDS_LENGTH];
        
        for (Integer i = 0; i <= ARRAY_CARDS_LENGTH - 1; i++) {
        	JPanel panel = new JPanel(new BorderLayout());

            allCards[i] = panel;
            allCards[i].setVisible(true);
            allCards[i].add(new JButton("" + i), BorderLayout.NORTH);
            this.add(allCards[i]);
            allCards[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            
            if ((i == 1) || (i == 3)) {
                allCards[i].setBackground(new Color(255, 153, 204));

                }
            
            if ((i == 6) || (i == 8) || (i == 9)) {
                allCards[i].setBackground(Color.BLUE);

                }
            
            if ((i == 21) || (i == 43) || (i == 54)) {
                allCards[i].setBackground(Color.ORANGE);

                }
            
            if ((i == 76) || (i == 98) || (i == 109)) {
                allCards[i].setBackground(new Color(153, 76, 0));

                }
            
            if ((i == 116) || (i == 117) || (i == 119)) {
                allCards[i].setBackground(Color.RED);

                }
            
            if ((i == 111) || (i == 112) || (i == 114)) {
                allCards[i].setBackground(Color.YELLOW);

                }
            
            if ((i == 66) || (i == 88) || (i == 99)) {
                allCards[i].setBackground(new Color(0, 204, 0));

                }
            
            if ((i == 11) || (i == 33)) {
                allCards[i].setBackground(new Color(153, 0 ,153));

                }
            
            //setting name for the cell of the service and station

            if (i == 0 ) { setNameOfCell(allCards[i], "via"); }
            
            if (i == 110) {setNameOfCell(allCards[i], "arresto"); }
            
            if (i == 120) { setNameOfCell(allCards[i], "parcheggio"); }
            
            if (i == 10) { setNameOfCell(allCards[i], "prigione"); }
            
            if ((i == 7) || (i == 34) || (i == 118)) { setNameOfCell(allCards[i], "imprevisto"); }
            
            if ((i == 5) || (i == 55) || (i == 65) || (i == 115)) { setNameOfCell(allCards[i], "stazione"); }

            if (i == 87) { setNameOfCell(allCards[i], "enel"); }
            
            if (i == 113) { setNameOfCell(allCards[i], "hera"); }
            
            if (i == 4) { setNameOfCell(allCards[i], "tassa"); }
            
            if ((i == 2) || (i == 32) || (i == 77)) {setNameOfCell(allCards[i], "probabilità"); }
            
            //central cell deleting
            if ((i >= 12 && i <= 20) || (i >= 23 && i <= 31) || (i >= 34 && i <= 42) ||
                    (i >= 45 && i <= 53) || (i >= 56 && i <= 59) || (i >= 61 && i <= 64) ||
                    (i >= 67 && i <= 75) || (i >= 78 && i <= 86) || (i >= 89 && i <= 97) || (i >= 100 && i <= 108)) {
                   allCards[i].setVisible(false);
            }
            
            //setting cell for the roll dice 
            if (i == ID_BUTTON_ROLL_DICE) { allCards[i].add(new JButton("roll dice"), BorderLayout.CENTER); }
            
       }

		this.setBackground(new Color(139, 250, 180));
        this.setVisible(true);
	}
	/*
	 * method that helps to setting name of cell
	 */
	void setNameOfCell(JComponent c, String s) {
    	c.add(new JButton(s), BorderLayout.NORTH);
        final JButton cont = new JButton();
        cont.setEnabled(false);
        c.add(cont, BorderLayout.CENTER);
    }

}
