package view.play;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import controller.menu.ControllerMainMenu;

public class HistoryGUI extends JPanel {
	private static final int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	private static final int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	
	private static Dimension leftSideDimension = new Dimension ((int) (width / 1.45),(height /2));
	private static Dimension rightSideDimension = new Dimension((int) (width - leftSideDimension.getSize().width),(height/2));
	private static Dimension dim = new Dimension((int) (rightSideDimension.getSize().width), (rightSideDimension.getSize().height/12));
	private static final Font f = new Font("Aldhabi", Font.LAYOUT_LEFT_TO_RIGHT,rightSideDimension.getSize().height/12);
	private setComponent action;
	
	private final ArrayList<JButton> fields = new ArrayList<JButton>();
	private final JPanel box;
	private final JScrollPane scrollPanel;
	private final JPanel gridPanel;
	private final JPanel upPanelLeft;
	private final JPanel upPanelRight;
	
	private final JTextField history;
    private final JTextField time;
			
	public HistoryGUI() {
		
		this.action = new setComponentImpl();
		this.setLayout(new BorderLayout());
		this.setSize(rightSideDimension);
		this.setPreferredSize(rightSideDimension);
		this.box= new JPanel(new GridLayout(0,1));
		
		
//		System.out.println("screen " + Toolkit.getDefaultToolkit().getScreenSize());
//		System.out.println("dim. " + dim);
//		System.out.println("left. " + leftSideDimension);
		

		
		
		
		this.gridPanel = new JPanel(new GridLayout(1, 2));
	    this.upPanelLeft = new JPanel(new FlowLayout(FlowLayout.LEFT));
	    this.upPanelRight = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	    
	    
	    this.history = new JTextField("History");
	    this.time = new JTextField("History");
	    
		int i =0;
		  for(i=0; i<3 ;i++) {
		  final JButton but1 = new JButton ("E' iniziato il gioco!");
		  but1.setSize(dim);
		  but1.setPreferredSize(dim);
		  but1.setMaximumSize(dim);
		  but1.setMinimumSize(dim);
	      but1.setHorizontalAlignment(SwingConstants.LEFT);
	      but1.setFont(f);
	      this.box.add(but1);
		  }
		  
		

		 
	   

		
	        upPanelLeft.add(history);
	        upPanelRight.add(time);
	        gridPanel.add(upPanelLeft);
	        gridPanel.add(upPanelRight);
	       
	        
	        
	        this.scrollPanel = new JScrollPane (this.box);
			this.scrollPanel.setVerticalScrollBarPolicy ( ScrollPaneConstants . VERTICAL_SCROLLBAR_ALWAYS );	
			
			
		this.add(scrollPanel,BorderLayout.CENTER);
	    this.add(gridPanel,BorderLayout.NORTH);
   
		this.setBorder(new LineBorder(Color.BLACK));
		this.setBackground(Color.RED);
    }
		
	
		
	

}
