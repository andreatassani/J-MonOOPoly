package view.play;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import model.allTypeOfCard.CCCCard;

public class SituationGUI extends JPanel {
	
	private static final int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	private static final int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	private static Dimension leftSideDimension = new Dimension ((int) (width / 1.45),(height));
	private static Dimension rightSideDimension = new Dimension((int) (width - leftSideDimension.getSize().width),(height/2));
	private static Dimension dim = new Dimension((int) (MainExternContainerImpl.getRightSide().getWidth()), (rightSideDimension.getSize().height/24));
	private static final Font f = new Font("Aldhabi", Font.LAYOUT_LEFT_TO_RIGHT,dim.getSize().height);
	private static final Color j = new Color(173,238,216);
	
	private final ArrayList<JPanel> flowPanels = new ArrayList<JPanel>();
	private final Box box;
	private final JPanel flowPanel1;
	private final JPanel flowPanel2;
	private final JPanel flowPanel3;
	private final JPanel flowPanel4;
	private final JPanel flowPanel5;
	
	
	private final JPanel gridPanel;
	private final JPanel upPanelLeft;
	private final JButton situation;
	
	
	public SituationGUI() {
		
		this.setLayout(new BorderLayout());
		this.setSize(rightSideDimension);
		this.setPreferredSize(rightSideDimension);
		
		this.gridPanel = new JPanel(new GridLayout(1, 2));
	    this.upPanelLeft = new JPanel(new FlowLayout(FlowLayout.LEFT));
	    this.upPanelLeft.setBackground(Color.RED);
	    this.situation = new JButton("Situation");
	    this.situation.setFont(f);
	    this.situation.setBackground(Color.RED);

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
		flow.setBackground(j);
		JButton Player = new JButton ("Player");
		Player.setFont(f);
		Player.setBackground(j);
		JButton Cash = new JButton ("Cash");
		Cash.setFont(f);
		Cash.setBackground(j);
		JButton Propriety = new JButton ("Propriety");
		Propriety.setFont(f);
		Propriety.setBackground(j);
		JButton Position = new JButton ("Position");
		Position.setFont(f);
		Position.setBackground(j);
		
		flow.add(Player);
		flow.add(Cash);
		flow.add(Propriety);
		flow.add(Position);
		
		
		box.add(flow);
		
	}
	upPanelLeft.add(situation);
    gridPanel.add(upPanelLeft);
	this.add(box,BorderLayout.CENTER);
	this.add(gridPanel,BorderLayout.NORTH);

		this.setBorder(new LineBorder(Color.BLACK));
		
		
	}
}
