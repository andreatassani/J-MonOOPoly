package view.play;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import model.allTypeOfCard.Entity;
import model.allTypeOfCard.EntityDeck;
import model.player.ListOfPlayers;
/**
 * 
 * class implements MainExternalContainer
 *
 */
public class MainExternContainerImpl extends JFrame {
	
	/**
	 * fields.
	 */
	private static Dimension leftSideDimension = new Dimension((int) (Toolkit.getDefaultToolkit().getScreenSize().width / 1.45), Toolkit.getDefaultToolkit().getScreenSize().height);
	private static Dimension d = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
	private static Dimension rightSideDimension = new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width - leftSideDimension.getSize().width, Toolkit.getDefaultToolkit().getScreenSize().height);
	private static Box rightSide = new Box(BoxLayout.Y_AXIS);
	private static JPanel leftSide = new JPanel(new BorderLayout());
	private Box extern;
	private GridCell grid;
	
	/**
	 * constructor.
	 */
	public MainExternContainerImpl(ListOfPlayers listPl, ArrayList<Entity> deck) {
	    
	      

		extern = new Box(BoxLayout.X_AXIS);
		extern.setSize(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height);
		
		leftSide.setSize((int) (Toolkit.getDefaultToolkit().getScreenSize().width / 1.45), Toolkit.getDefaultToolkit().getScreenSize().height);
		leftSide.setPreferredSize(leftSideDimension);
		leftSide.setBackground(Color.GREEN);
		grid = new GridCell(deck);
		leftSide.add(new SouthUtilityButtonsImpl(listPl, deck, grid, this), BorderLayout.SOUTH);
		leftSide.add(grid, BorderLayout.CENTER);
		
		for(int i = 0; i<listPl.getNumberPlayer(); i++) {
		((Cell)grid.getNorthBox().getComponent(0)).getPositionPawns().setImageOnIndex(i, listPl.getPlayerFromIndex(i+1));                    //allows to set pawns on start of the game's session
		}
		
		rightSide.setSize(rightSideDimension);
		rightSide.setPreferredSize(rightSideDimension);

		rightSide.add(new HistoryGUI());
		rightSide.add(new SituationGUI());
		extern.add(leftSide);
		extern.add(rightSide);
		
		this.add(extern);
		this.setPreferredSize(d);
		this.setState(JFrame.MAXIMIZED_BOTH);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		this.pack();
		//Da togliere
                JOptionPane.showMessageDialog(null,"è il turno di "+ listPl.getCurrentPlayer().getName() + " e si trova sulla casella " + deck.get(listPl.getCurrentPlayer().getPosition()).getName(),
                        "messaggio", 0);
	}
	/**
	 * 
	 * {@inheritDoc}
	 */
	public static JPanel getLeftSide() {
		JPanel i = leftSide;
		return i;
	}
	/**
	 * 
	 * {@inheritDoc}
	 */
	public static Box getRightSide() {
		Box i = rightSide;
		return i;
	}
}
