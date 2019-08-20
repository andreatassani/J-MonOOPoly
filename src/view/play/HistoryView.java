package view.play;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Timer;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import model.history.HistoryImpl;
import model.player.PlayerImpl;
/**
 * Class that implements the GUI of the history.
 */
public class HistoryView extends JPanel {
	
	
	/**
	 * Defining the components and setting the panel size.
	 */
	private static final long serialVersionUID = 1L;
	private static final int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	private static final int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	private static final Dimension leftSideDimension = new Dimension ((int) (width / 1.45),(height));
	private static final Dimension rightSideDimension = new Dimension((int) (width - leftSideDimension.getSize().width),(height/2));
	private static final Dimension dim = new Dimension((int) (MainExternContainerImpl.getRightSide().getWidth()), (rightSideDimension.getSize().height/15));
	private static final Font f = new Font("Aldhabi", Font.LAYOUT_LEFT_TO_RIGHT,(int) (dim.getSize().height/1.45));
	private static final Color j = new Color(173,238,216);
	
	private static ArrayList<JButton> fields = new ArrayList<JButton>();
	private static JPanel box;
	private final JScrollPane scrollPanel;
	private final JPanel gridPanel;
	private HistoryImpl historyControl;
	private static JPanel upPanelLeft;
	private int i;
	private static JButton history;
	
	
	/**
	 * Initialization of the GUI and setting of the various components.
	 */
	public HistoryView() {
		
		this.setLayout(new BorderLayout());
		this.setSize(rightSideDimension);
		this.setPreferredSize(rightSideDimension);
		box= new JPanel(new GridLayout(0,1));
		this.gridPanel = new JPanel(new GridLayout(1, 2));
	    upPanelLeft = new JPanel(new FlowLayout(FlowLayout.LEFT));
	    upPanelLeft.setBackground(Color.RED);
	    history = new JButton("History");
	    history.setFont(f);
	    history.setBackground(Color.RED);
	    this.historyControl = new HistoryImpl(Optional.empty());
	    
	    for(i=0; i<15 ;i++) {
		final JButton but = new JButton ("");
	    but.setHorizontalAlignment(SwingConstants.LEFT);
	    but.setFont(f);
	    but.setBackground(j);
	    but.setMaximumSize(dim);
	    but.setMinimumSize(dim);
	    fields.add(but);
		}
		for (JButton but : fields)
			box.add(but);
		
		upPanelLeft.add(history);
	    gridPanel.add(upPanelLeft);
	    this.scrollPanel = new JScrollPane (box);
	    this.scrollPanel.setVerticalScrollBarPolicy ( ScrollPaneConstants . VERTICAL_SCROLLBAR_ALWAYS );			
		this.add(scrollPanel,BorderLayout.CENTER);
	    this.add(gridPanel,BorderLayout.NORTH);
	    this.historyControl.printStartGame();
		this.setBorder(new LineBorder(Color.BLACK));
		this.setBackground(Color.RED);
    }
	/**
	 * Static method to get the list of buttons that implements the GUI.
	 * @return ArrayList<JButton>
	 */
	public static ArrayList<JButton> getHistory(){
		return fields;
	}
	/**
	 * Static method to set the list of buttons that implements the GUI.
	 * @param ArrayList<JButton>
	 */
	public static void setHistory(ArrayList<JButton> fields1) {
		fields=fields1;
	}
	/**
	 * Static method to increase the number of buttons within the GUI.
	 * 
	 */
	public static void resetGUI() {
		for (JButton but : fields)
			box.add(but);
		
	}
	/**
	 * Static method to set the color of the GUI.
	 * @param pl is the player whose color you want 
	 */
	public static void resetColor(PlayerImpl pl) {
		upPanelLeft.setBackground(pl.getColors());
		history.setBackground(pl.getColors());
		
	}
	/**
	 * Static method to get a Dimension. 
	 * @return Dimension
	 */
	public static Dimension getDim() {
		return dim;
	}
	/**
	 * Static method to get a Color. 
	 * @return Color
	 */
	public static Color getColor() {
		return j;
	}
	
}
