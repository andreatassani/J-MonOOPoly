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

import controller.menu.ControllerMainMenu;
import model.history.HistoryImpl;

public class HistoryGUI extends JPanel {
	private static final int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	private static final int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	private static Dimension leftSideDimension = new Dimension ((int) (width / 1.45),(height));
	private static Dimension rightSideDimension = new Dimension((int) (width - leftSideDimension.getSize().width),(height/2));
	private static Dimension dim = new Dimension((int) (MainExternContainer.getRightSide().getWidth()), (rightSideDimension.getSize().height/24));
	private static final Font f = new Font("Aldhabi", Font.LAYOUT_LEFT_TO_RIGHT,dim.getSize().height);
	private model.history.History action;
	private static final Color j = new Color(173,238,216);
	
	private static ArrayList<JButton> fields = new ArrayList<JButton>();
	private final JPanel box;
	private final JScrollPane scrollPanel;
	private final JPanel gridPanel;
	private final GridBagConstraints c;
	private final JPanel upPanelLeft;
	private int i =0;
	
	
	
	private final JButton history;
	
	
    
	public HistoryGUI() {
		
		this.action = new HistoryImpl();
		this.setLayout(new BorderLayout());
		this.setSize(rightSideDimension);
		this.setPreferredSize(rightSideDimension);
		this.box= new JPanel(new GridBagLayout());
		this.c = new GridBagConstraints();
		
		

		this.gridPanel = new JPanel(new GridLayout(1, 2));
	    this.upPanelLeft = new JPanel(new FlowLayout(FlowLayout.LEFT));
	    this.upPanelLeft.setBackground(Color.RED);
	    this.history = new JButton("History");
	    this.history.setFont(f);
	    this.history.setBackground(Color.RED);
	    
	    
		
		for(i=0; i<8 ;i++) {
		final JButton but = new JButton ("" +i);
	    but.setHorizontalAlignment(SwingConstants.LEFT);
	    but.setFont(f);
	    but.setBackground(j);
	    
	    c.ipadx = dim.width;
	    c.ipady = dim.height;
	    c.gridy = i;
	    fields.add(but);
	    this.box.add(but,c);
		}
		  
		upPanelLeft.add(history);
	    gridPanel.add(upPanelLeft);
	       
	        
	    this.scrollPanel = new JScrollPane (this.box);
	    this.scrollPanel.setVerticalScrollBarPolicy ( ScrollPaneConstants . VERTICAL_SCROLLBAR_ALWAYS );
		this.scrollPanel.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			
			
		this.add(scrollPanel,BorderLayout.CENTER);
	    this.add(gridPanel,BorderLayout.NORTH);
   
		this.setBorder(new LineBorder(Color.BLACK));
		this.setBackground(Color.RED);
    }
	
	public static ArrayList<JButton> getHistory(){
		return fields;
	}
	
	public static void setHistory(ArrayList<JButton> fields1) {
		fields=fields1;
	}
	

	
	
		
	
		
	

}
