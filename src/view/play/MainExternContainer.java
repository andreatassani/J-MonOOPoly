package view.play;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

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
	public MainExternContainer(ListOfPlayers listPl) {

		Box extern = new Box(BoxLayout.X_AXIS);
		extern.setSize(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height);
		
		leftSide.setSize((int) (Toolkit.getDefaultToolkit().getScreenSize().width / 1.45), Toolkit.getDefaultToolkit().getScreenSize().height);
//		leftSide.setMaximumSize(leftSideDimension);
//		leftSide.setMinimumSize(leftSideDimension);
		leftSide.setPreferredSize(leftSideDimension);
		leftSide.setBackground(Color.GREEN);
<<<<<<< HEAD
		leftSide.add(new SouthUtilityButtons(), BorderLayout.SOUTH);
		leftSide.add(new GridCell());
=======
		leftSide.add(new SouthUtilityButtons(listPl), BorderLayout.SOUTH);
		leftSide.add(new GridCell(), BorderLayout.CENTER);
>>>>>>> d4730b5ca0b38f5e972aa4b454b6509ac0de2f5d

		
		rightSide.setSize(Toolkit.getDefaultToolkit().getScreenSize().width - leftSide.getSize().width, Toolkit.getDefaultToolkit().getScreenSize().height);
		rightSide.setMaximumSize(leftSideDimension);
		rightSide.setMinimumSize(leftSideDimension);
		rightSide.setPreferredSize(leftSideDimension);

		//rightSide.add(new HistoryGUI());
		//rightSide.add(new SituationGUI());
		extern.add(leftSide);
		extern.add(rightSide);
		this.add(extern);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.pack();
		this.setMaximumSize(d);
		this.setMinimumSize(d);
		this.setPreferredSize(d);
		this.setSize(d);
		this.setState(JFrame.NORMAL);

		System.out.println(d);
	}
	
	public static JPanel getLeftSide() {
		JPanel i = leftSide;
		return i;
	}


}
