package view.play;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import model.allTypeOfCard.CCCCard;

public class SituationGUI extends JPanel {
	
	private static final int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	private static final int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	private static Dimension leftSideDimension = new Dimension ((int) (width / 1.45),(height /2));
	private static Dimension rightSideDimension = new Dimension((int) (width - leftSideDimension.getSize().width),(height/2));
	private static Dimension dim = new Dimension((int) (rightSideDimension.getSize().width), (rightSideDimension.getSize().height/5));
	
	private final ArrayList<JPanel> flowPanels = new ArrayList<JPanel>();
	private final Box box;
	private final JPanel flowPanel1;
	private final JPanel flowPanel2;
	private final JPanel flowPanel3;
	private final JPanel flowPanel4;
	private final JPanel flowPanel5;
	
	
	public SituationGUI() {
		
		this.setLayout(new BorderLayout());
		this.setSize(rightSideDimension);
		//this.setMaximumSize(rightSideDimension);
		//this.setMinimumSize(rightSideDimension);
		this.setPreferredSize(rightSideDimension);

		this.box= new Box(BoxLayout.Y_AXIS);
		this.flowPanel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		flowPanels.add(flowPanel1);
		this.flowPanel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		flowPanels.add(flowPanel2);
		this.flowPanel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		flowPanels.add(flowPanel3);
		this.flowPanel4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		flowPanels.add(flowPanel4);
		this.flowPanel5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		flowPanels.add(flowPanel5);
	
	for (JPanel flow : flowPanels) {
		
		JButton JButton1 = new JButton ("Player");
		JButton JButton2 = new JButton ("Cash");
		JButton JButton3 = new JButton ("Propriety");
		JButton JButton4 = new JButton ("Position");
		
		flow.add(JButton1);
		flow.add(JButton2);
		flow.add(JButton3);
		flow.add(JButton4);
		
		flow.setSize(dim);
		box.add(flow);
		
	}
	this.add(box,BorderLayout.CENTER);
		
		
		
		
		
	
		this.setBackground(Color.YELLOW);
		TextField situation = new TextField("SITUATION");
		situation.setEnabled(false);
		this.add(situation, BorderLayout.NORTH);
		this.setBorder(new LineBorder(Color.BLACK));
		
		
	}
}
