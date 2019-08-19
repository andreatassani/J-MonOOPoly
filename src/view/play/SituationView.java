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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import model.allTypeOfCard.CCCCard;
import model.allTypeOfCard.Entity;
import model.player.ListOfPlayers;
import model.player.PlayerImpl;
import model.situation.SituationImpl;

public class SituationView extends JPanel {
	
	private static final int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	private static final int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	private static Dimension leftSideDimension = new Dimension ((int) (width / 1.45),(height));
	private static Dimension rightSideDimension = new Dimension((int) (width - leftSideDimension.getSize().width),(height/2));
	private static Dimension dim = new Dimension((int) (MainExternContainerImpl.getRightSide().getWidth()), (rightSideDimension.getSize().height/24));
	private static final Font f = new Font("Aldhabi", Font.LAYOUT_LEFT_TO_RIGHT,dim.getSize().height);
	private static final Color j = new Color(173,238,216);
	private static ListOfPlayers players;
	private SituationImpl situationControl = new SituationImpl();
	
	private static ArrayList<JPanel> flowPanels = new ArrayList<JPanel>();
	private static JPanel box;

	
	
	private int i;
	private final JPanel gridPanel;
	private static JPanel upPanelLeft;
	private static JButton situation;
	
	
	public SituationView(ListOfPlayers listPl, ArrayList<Entity> deck) {
		
		this.setLayout(new BorderLayout());
		this.setSize(rightSideDimension);
		this.setPreferredSize(rightSideDimension);
		players=listPl;
	
		this.gridPanel = new JPanel(new GridLayout(1, 2));
	    upPanelLeft = new JPanel(new FlowLayout(FlowLayout.LEFT));
	    upPanelLeft.setBackground(Color.RED);
	    situation = new JButton("Situation");
	    situation.setFont(f);
	    situation.setBackground(Color.RED);
	    box= new JPanel(new GridLayout(0,1));
	   
	    for(i=0;i<listPl.getNumberPlayer()+1;i++) {
	    	
	    	final JPanel flowPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	    	flowPanel.setBackground(j);
	    	final JButton Player = new JButton (""+listPl.getPlayerFromIndex(i).getName());
	    	Player.setFont(f);
			Player.setBackground(listPl.getPlayerFromIndex(i).getColors());
			final JButton Cash = new JButton (""+listPl.getPlayerFromIndex(i).getMoney());
			if(Player.getText().equals("Bank"))Cash.setEnabled(false);
			Cash.setFont(f);
			Cash.setBackground(listPl.getPlayerFromIndex(i).getColors());
			final JButton Propriety = new JButton ("Propriety: "+ listPl.getPlayerFromIndex(i).getListOfProperties().size());
			Propriety.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					situationControl.setPropriety(listPl.getPlayerFromIndex(flowPanels.indexOf(flowPanel)));
					JOptionPane.showMessageDialog(null," "+ SituationImpl.getProperties(),"messaggio", 0);
					
				}
			});
			Propriety.setFont(f);
			Propriety.setBackground(listPl.getPlayerFromIndex(i).getColors());
			final JButton Position = new JButton ("Position: "+listPl.getPlayerFromIndex(i).getPosition());
			Position.setFont(f);
			Position.setBackground(listPl.getPlayerFromIndex(i).getColors());
			flowPanel.add(Player);
			flowPanel.add(Cash);
			flowPanel.add(Propriety);
			flowPanel.add(Position);
	    	flowPanels.add(flowPanel);
	    	box.add(flowPanel);
	   }
		
	upPanelLeft.add(situation);
    gridPanel.add(upPanelLeft);
	this.add(box,BorderLayout.CENTER);
	this.add(gridPanel,BorderLayout.NORTH);
	this.setBorder(new LineBorder(Color.BLACK));
		
		
	}
	
	public static ArrayList<JPanel> getSituation(){
		return flowPanels;
	}
	
	public static ListOfPlayers getListOfPlayers(){
		return players;
	}
	public static void setSituation(ArrayList<JPanel> fields1) {
		flowPanels=fields1;
	}
	public static void resetColor(PlayerImpl pl) {
		upPanelLeft.setBackground(pl.getColors());
		situation.setBackground(pl.getColors());
		
	}
}
