package view.play;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import model.allTypeOfCard.Entity;
import model.player.ListOfPlayers;
import model.player.PlayerImpl;
import model.situation.SituationImpl;
/**
 * Class that implements the GUI of the situation.
 */
public class SituationView extends JPanel {
        /**
         *Defining the components and setting the panel size.
         */
	private static final long serialVersionUID = 1L;
	private static final int HEIGHT_RATIO_LEFT = 2;
	private static final int HEIGHT_RATIO_DIM = 24;
	private static final int WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width;
	private static final int HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;
	private static final Dimension LEFTSIDEDIMENSION = new Dimension((int) (WIDTH / 1.45), (HEIGHT));
	private static final Dimension RIGHTSIDEDIMENSION = new Dimension((int) (WIDTH - LEFTSIDEDIMENSION.getSize().width), (HEIGHT/HEIGHT_RATIO_LEFT));
	private static final Dimension DIM = new Dimension((int) (MainExternContainerImpl.getRightSide().getWidth()),
	                                                         (RIGHTSIDEDIMENSION.getSize().height/HEIGHT_RATIO_DIM));
	private static final Font F = new Font("Aldhabi", Font.LAYOUT_LEFT_TO_RIGHT, DIM.getSize().height);
	private static final Color J = new Color(173, 238, 216);
	private static ListOfPlayers players;
	private final SituationImpl situationControl = new SituationImpl();
	
	private static ArrayList<JPanel> flowPanels = new ArrayList<JPanel>();
	private static JPanel box;
	private int i;
	private final JPanel gridPanel;
	private static JPanel upPanelLeft;
	private static JButton situation;
	
	/**
	 * Initialization of the GUI and setting of the various components.
	 * @param listPl list of players.
	 * @param deck list of entity
	 */
	public SituationView(final ListOfPlayers listPl, final ArrayList<Entity> deck) {
	    this.setLayout(new BorderLayout());
	    this.setSize(RIGHTSIDEDIMENSION);
	    this.setPreferredSize(RIGHTSIDEDIMENSION);
	    players = listPl;
            this.gridPanel = new JPanel(new GridLayout(1, 2));
	    upPanelLeft = new JPanel(new FlowLayout(FlowLayout.LEFT));
	    upPanelLeft.setBackground(Color.RED);
	    situation = new JButton("Situation");
	    situation.setFont(F);
	    situation.setBackground(Color.RED);
	    box = new JPanel(new GridLayout(0, 1));
	    for (i = 0; i < listPl.getNumberPlayer() + 1; i++) {

	    	final JPanel flowPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	    	flowPanel.setBackground(J);
	    	final JButton player = new JButton(" " + listPl.getPlayerFromIndex(i).getName());
	    	player.setFont(F);
			player.setBackground(listPl.getPlayerFromIndex(i).getColors());
			flowPanel.add(player);
			final JButton cash = new JButton(" " + listPl.getPlayerFromIndex(i).getMoney());
			if (player.getText().equals("Bank")) {
			    cash.setText("5000");
			    cash.setEnabled(false);
			}
			cash.setFont(F);
			cash.setBackground(listPl.getPlayerFromIndex(i).getColors());
			flowPanel.add(cash);
			final JButton property = new JButton("Properties: " + listPl.getPlayerFromIndex(i).getListOfProperties().size());
			property.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(final ActionEvent e) {

					situationControl.setPropriety(listPl.getPlayerFromIndex(flowPanels.indexOf(flowPanel)));
					JOptionPane.showMessageDialog(null, " " + SituationImpl.getProperties(), "messaggio", 0);

				}
			});
			property.setFont(F);
			property.setBackground(listPl.getPlayerFromIndex(i).getColors());
			flowPanel.add(property);
			if (!player.getText().equals("Bank")) {
			final JButton position = new JButton("Position: " + listPl.getPlayerFromIndex(i).getPosition());
			position.setFont(F);
			position.setBackground(listPl.getPlayerFromIndex(i).getColors());
			flowPanel.add(position);
			}
	    	flowPanels.add(flowPanel);
	    	box.add(flowPanel);
	   }

	upPanelLeft.add(situation);
    gridPanel.add(upPanelLeft);
	this.add(box, BorderLayout.CENTER);
	this.add(gridPanel, BorderLayout.NORTH);
	this.setBorder(new LineBorder(Color.BLACK));
	}
	/**
	 * Static method to get the list of panels that implements the GUI.
	 * @return ArrayList<JPanel>
	 */
	public static ArrayList<JPanel> getSituation() {
		return flowPanels;
	}
	/**
	 * Static method to get the list of players.
	 * @return ListOfPlayers
	 */
	public static ListOfPlayers getListOfPlayers() {
		return players;
	}
	/**
	 * Static method to set the list of panels that implements the GUI.
	 * @param fields1 is the new setting of 'flowpanels'
	 */
	public static void setSituation(final ArrayList<JPanel> fields1) {
		flowPanels = fields1;
	}
	/**
	 * Static method to set the color of the GUI.
	 * @param pl is the player whose color you want 
	 */
	public static void resetColor(final PlayerImpl pl) {
		upPanelLeft.setBackground(pl.getColors());
		situation.setBackground(pl.getColors());
	}
}
