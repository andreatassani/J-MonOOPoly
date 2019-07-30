package view.play;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MainExternContainer extends JFrame {
	
	private static Dimension leftSideDimension = new Dimension((int) (Toolkit.getDefaultToolkit().getScreenSize().width / 1.45), Toolkit.getDefaultToolkit().getScreenSize().height);
	private static Dimension d = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
	
	public MainExternContainer() {

		Box extern = new Box(BoxLayout.X_AXIS);
		extern.setSize(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height);
		JPanel leftSide = new JPanel(new BorderLayout());
		leftSide.setSize((int) (Toolkit.getDefaultToolkit().getScreenSize().width / 1.45), Toolkit.getDefaultToolkit().getScreenSize().height);
		leftSide.setMaximumSize(leftSideDimension);
		leftSide.setMinimumSize(leftSideDimension);
		leftSide.setPreferredSize(leftSideDimension);
		leftSide.setBackground(Color.GREEN);
		leftSide.add(new SouthUtilityButtons(), BorderLayout.SOUTH);
		leftSide.add(new GridCell(), BorderLayout.CENTER);

		Box rightSide = new Box(BoxLayout.Y_AXIS);
		rightSide.setSize(Toolkit.getDefaultToolkit().getScreenSize().width - leftSide.getSize().width, Toolkit.getDefaultToolkit().getScreenSize().height);
		rightSide.setMaximumSize(leftSideDimension);
		rightSide.setMinimumSize(leftSideDimension);
		rightSide.setPreferredSize(leftSideDimension);

		rightSide.add(new History());
		rightSide.add(new Situation());
		extern.add(leftSide);
		extern.add(rightSide);
		this.add(extern);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//his.setResizable(false);

		this.setVisible(true);
		this.pack();
		this.setMaximumSize(d);
		this.setMinimumSize(d);
		this.setPreferredSize(d);
		this.setSize(d);
		this.setState(JFrame.NORMAL);
		System.out.println(leftSide.getSize());
	}
	

}
