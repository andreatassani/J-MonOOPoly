package view.history;

import javax.swing.*;

import view.play.Cell;

import java.awt.event.*;
import java.util.Optional;
import java.awt.*;

public class HistoryGUI extends JFrame{
    
    
    public HistoryGUI() {
    	
         
       
       
        JPanel mainpanel = new JPanel(new BorderLayout());
        //pannello principale
        
       
        Box boxpanel = new Box(BoxLayout.PAGE_AXIS);
        
        Dimension dim = new Dimension(frame.getSize().width,frame.getSize().height/7);
        final JScrollPane scroll = new JScrollPane (); 
        
        
        final JTextField textField1 = new JTextField ("A chicco");
        final JTextField textField2 = new JTextField ("bleah");
        final JTextField textField3 = new JTextField ("A fef");
        final JTextField textField4 = new JTextField ("A chiccfegro");
        final JTextField textField5 = new JTextField ("A chiccfvdscvegro");
        final JTextField textField6 = new JTextField ("bleah");
        final JTextField textField7 = new JTextField ("A fef");
        final JTextField textField8 = new JTextField ("A chiccfegro");
       
        
        
       textField1.setMaximumSize(dim);
       textField1.setMinimumSize(dim);
       textField2.setMaximumSize(dim);
       textField2.setMinimumSize(dim);
       textField3.setMaximumSize(dim);
       textField3.setMinimumSize(dim);
       textField4.setMaximumSize(dim);
       textField4.setMinimumSize(dim);
       textField5.setMaximumSize(dim);
       textField5.setMinimumSize(dim);
       textField6.setMaximumSize(dim);
       textField6.setMinimumSize(dim);
       textField7.setMaximumSize(dim);
       textField7.setMinimumSize(dim);
       textField8.setMaximumSize(dim);
       textField8.setMinimumSize(dim);
         
       
       
       boxpanel.add(textField1);
       boxpanel.add(textField2);
        
       boxpanel.add(textField3);
       boxpanel.add(textField4);
        boxpanel.add(textField5);
        boxpanel.add(textField6);
        boxpanel.add(textField7);
        boxpanel.add(textField8);
         
         
         //prove di inserimento
         
        
       
        
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
        
      
       scroll . setVerticalScrollBarPolicy ( ScrollPaneConstants . VERTICAL_SCROLLBAR_ALWAYS );
      
       
       
       mainpanel.add(scroll,BorderLayout.CENTER);
       mainpanel.add(gridpanel,BorderLayout.NORTH);
       
        
        frame.getContentPane().add(mainpanel);
        frame.setVisible(true);
    }
    
    
    
    
    public static void main(String[] args){
        new HistoryGUI();
    }

}
