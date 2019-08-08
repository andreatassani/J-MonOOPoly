package view.play;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;

public class HistoryGUI extends JPanel {
	private static final int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	private static final int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	private static Dimension leftSideDimension = new Dimension ((int) (width / 1.45),(height /2));
	private static Dimension rightSideDimension = new Dimension((int) (width - leftSideDimension.getSize().width),(height/2));
	private static Dimension dim = new Dimension((int) (rightSideDimension.getSize().width), (rightSideDimension.getSize().height/7));
	
	private final Box box;
	private final JScrollPane scrollPanel;
	private final JPanel gridPanel;
	private final JPanel upPanelLeft;
	private final JPanel upPanelRight;
	
	private final JTextField history;
    private final JTextField time;
			
	public HistoryGUI() {
		
		this.setLayout(new BorderLayout());
		this.setSize(rightSideDimension);
	//	this.setMaximumSize(rightSideDimension);
	//	this.setMinimumSize(rightSideDimension);
		this.setPreferredSize(rightSideDimension);
		
		this.box= new Box(BoxLayout.Y_AXIS);
		this.scrollPanel = new JScrollPane (this.box);
		scrollPanel.setVerticalScrollBarPolicy ( ScrollPaneConstants . VERTICAL_SCROLLBAR_ALWAYS );
		
		System.out.println("S" + leftSideDimension.toString());
		System.out.println("D" +rightSideDimension.toString());
		System.out.println("TOT " + Toolkit.getDefaultToolkit().getScreenSize().toString());
		System.out.println("dim " + dim.toString());

		
		
		
		this.gridPanel = new JPanel(new GridLayout(1, 2));
	    this.upPanelLeft = new JPanel(new FlowLayout(FlowLayout.LEFT));
	    this.upPanelRight = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	    
	    this.history = new JTextField("History");
	    this.time = new JTextField("History");
	    
		
		  
		  final JTextField textField1 = new JTextField ("A chicco");
	      final JTextField textField2 = new JTextField ("bleah");
	      final JTextField textField3 = new JTextField ("A fef");
	      final JTextField textField4 = new JTextField ("A chiccfegro");
	      
	      
	      this.box.add(textField4);

		
	        upPanelLeft.add(history);
	        upPanelRight.add(time);
	        gridPanel.add(upPanelLeft);
	        gridPanel.add(upPanelRight);
	        
	  this.add(scrollPanel,BorderLayout.CENTER);
	    this.add(gridPanel,BorderLayout.NORTH);
   
		this.setBorder(new LineBorder(Color.BLACK));
		this.setBackground(Color.RED);
    }
		
	
		
	

}
