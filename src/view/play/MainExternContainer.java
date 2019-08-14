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



public class MainExternContainer extends JFrame {
	
	/**
	 * 
	 */
	private static Dimension leftSideDimension = new Dimension((int) (Toolkit.getDefaultToolkit().getScreenSize().width / 1.45), Toolkit.getDefaultToolkit().getScreenSize().height);
	private static Dimension d = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
	private static Box rightSide = new Box(BoxLayout.Y_AXIS);
	private static JPanel leftSide = new JPanel(new BorderLayout());
	/**
	 * @return the rightSide
	 */
	public MainExternContainer(ListOfPlayers listPl, ArrayList<Entity> deck) {
	       

		Box extern = new Box(BoxLayout.X_AXIS);
		extern.setSize(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height);
		
		leftSide.setSize((int) (Toolkit.getDefaultToolkit().getScreenSize().width / 1.45), Toolkit.getDefaultToolkit().getScreenSize().height);
		leftSide.setPreferredSize(leftSideDimension);
		leftSide.setBackground(Color.GREEN);

		leftSide.add(new SouthUtilityButtons(listPl, deck), BorderLayout.SOUTH);
		leftSide.add(new GridCell(deck));

		leftSide.add(new SouthUtilityButtons(listPl, deck), BorderLayout.SOUTH);
		leftSide.add(new GridCell(deck), BorderLayout.CENTER);


		
		rightSide.setSize(Toolkit.getDefaultToolkit().getScreenSize().width - leftSide.getSize().width, Toolkit.getDefaultToolkit().getScreenSize().height);
		rightSide.setPreferredSize(leftSideDimension);

		rightSide.add(new HistoryGUI());
		rightSide.add(new SituationGUI());
		extern.add(leftSide);
		extern.add(rightSide);
		this.add(extern);
		
		this.setState(JFrame.MAXIMIZED_BOTH);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		this.pack();
		this.setState(JFrame.MAXIMIZED_BOTH);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		//Da togliere
                JOptionPane.showMessageDialog(null,"è il turno di "+ listPl.getCurrentPlayer().getName() + " e si trova sulla casella " + deck.get(listPl.getCurrentPlayer().getPosition()).getName(),
                        "messaggio", 0);
	}
	
	public static JPanel getLeftSide() {
		JPanel i = leftSide;
		return i;
	}
	
	public static Box getRightSide() {
		Box i = rightSide;
		return i;
	}
	
	


}
