package view.play;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;

public class HistoryGUI extends JPanel {
	
	public HistoryGUI() {
		
		JPanel mainpanel = new JPanel(new BorderLayout());
        //pannello principale
        
        JPanel boxpanel = new JPanel();
        boxpanel.setLayout(new BoxLayout(boxpanel, BoxLayout.PAGE_AXIS));
        
        
        
        final JTextField textField1 = new JTextField ("A chicco");
        final JTextField textField2 = new JTextField ("bleah");
        final JTextField textField3 = new JTextField ("A fef");
        final JTextField textField4 = new JTextField ("A chiccfegro");
        final JTextField textField5 = new JTextField ("A chiccfvdscvegro");
        final JTextField textField6 = new JTextField ("bleah");
        final JTextField textField7 = new JTextField ("A fef");
        final JTextField textField8 = new JTextField ("A chiccfegro");
        final JTextField textField9 = new JTextField ("A chiccfvdscvegro");
        
        
       
         boxpanel.add(textField1);
         boxpanel.add(textField2);
         boxpanel.add(textField3);
         boxpanel.add(textField4);
         boxpanel.add(textField5);
         boxpanel.add(textField6);
         boxpanel.add(textField7);
         boxpanel.add(textField8);
         boxpanel.add(textField9);
         
         //prove di inserimento
         
        
        final JScrollPane scroll = new JScrollPane (boxpanel); 
        scroll . setVerticalScrollBarPolicy ( ScrollPaneConstants . VERTICAL_SCROLLBAR_ALWAYS );
        
      //setto la barra con scroll
        
        JPanel gridpanel = new JPanel(new GridLayout(1, 2));
        JPanel uppanelleft = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel uppanelright = new JPanel(new FlowLayout(FlowLayout.RIGHT));
       final JTextField history = new JTextField("History");
       final JTextField history2 = new JTextField("History");
       
       uppanelleft.add(history);
       uppanelright.add(history2);
       gridpanel.add(uppanelleft);
       gridpanel.add(uppanelright);
        
       
        mainpanel.add(gridpanel,BorderLayout.NORTH);
        mainpanel.add(scroll,BorderLayout.CENTER);
        
       
    }
		
	/*	this.setLayout(new BorderLayout());
		this.setBackground(Color.RED);
		
		TextField history = new TextField("HISTORY");
		history.setEnabled(false);
		this.add(history, BorderLayout.NORTH);
		this.setBorder(new LineBorder(Color.BLACK));
		*/
		
	

}
