package view.history;

import javax.swing.*;

import view.play.Cell;

import java.awt.event.*;
import java.util.Optional;
import java.awt.*;

public class HistoryGUI extends JFrame{
    
    
    public HistoryGUI() {
    	
         
        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(500, 500);
       
        JPanel mainpanel = new JPanel(new BorderLayout());
        //pannello principale
        
       
        Box boxpanel = new Box(BoxLayout.PAGE_AXIS);
        final JScrollPane scroll = new JScrollPane (boxpanel); 
        scroll . setVerticalScrollBarPolicy ( ScrollPaneConstants . VERTICAL_SCROLLBAR_ALWAYS );
        mainpanel.add(scroll,BorderLayout.CENTER);
        Dimension dim = new Dimension(frame.getSize().width,frame.getSize().height/7);
        
        
        
        final JTextField textField1 = new JTextField ("A chicco");
        final JTextField textField2 = new JTextField ("bleah");
        final JTextField textField3 = new JTextField ("A fef");
        final JTextField textField4 = new JTextField ("A chiccfegro");
        final JTextField textField5 = new JTextField ("A chiccfvdscvegro");
        final JTextField textField6 = new JTextField ("bleah");
        final JTextField textField7 = new JTextField ("A fef");
        final JTextField textField8 = new JTextField ("A chiccfegro");
        final JTextField textField9 = new JTextField ("A chiccfvdscvegro");
        
        
       textField1.setMaximumSize(dim);
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
        
        frame.getContentPane().add(mainpanel);
        frame.setVisible(true);
    }
    
    
    
    
    public static void main(String[] args){
        new HistoryGUI();
    }

}
