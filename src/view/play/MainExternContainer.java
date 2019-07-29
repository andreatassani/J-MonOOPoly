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

public class MainExternContainer extends JFrame {
	
	private static Dimension leftSideDimension = new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width / 2, Toolkit.getDefaultToolkit().getScreenSize().height);
	
	public MainExternContainer() {

		Box extern = new Box(BoxLayout.X_AXIS);
		extern.setSize(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height);
		JPanel leftSide = new JPanel(new BorderLayout());
		leftSide.setMaximumSize(leftSideDimension);
		leftSide.setBackground(Color.GREEN);
		leftSide.add(new SouthUtilityButtons(), BorderLayout.SOUTH);

		Box rightSide = new Box(BoxLayout.Y_AXIS);
		rightSide.setSize(Toolkit.getDefaultToolkit().getScreenSize().width / 2, Toolkit.getDefaultToolkit().getScreenSize().height);

		rightSide.add(new History());
		rightSide.add(new Situation());
		extern.add(leftSide);
		extern.add(rightSide);
		this.add(extern);
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setState(Frame.NORMAL);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.setVisible(true);
		this.pack();

		
		
	}
	

}
