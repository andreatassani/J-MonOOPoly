package history;

import javax.swing.*;



import java.awt.event.*;
import java.awt.*;

public class HistoryGUI extends JFrame{
    
    
    public HistoryGUI() {
        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(250, 250);
       
        JPanel panel = new JPanel(new BorderLayout());
        //pannello principale
        
        JPanel pannello = new JPanel();
        pannello.setLayout(new BoxLayout(pannello, BoxLayout.PAGE_AXIS));
        
        
        
        final JTextField textField1 = new JTextField ("A chicco");
        textField1.setBounds();
        final JTextField textField2 = new JTextField ("bleah");
        final JTextField textField3 = new JTextField ("A fef");
        final JTextField textField4 = new JTextField ("A chiccfegro");
        final JTextField textField5 = new JTextField ("A chiccfvdscvegro");
        final JTextField textField6 = new JTextField ("bleah");
        final JTextField textField7 = new JTextField ("A fef");
        final JTextField textField8 = new JTextField ("A chiccfegro");
        final JTextField textField9 = new JTextField ("A chiccfvdscvegro");
        
        
       
         pannello.add(textField1);
         pannello.add(textField2);
         pannello.add(textField3);
         pannello.add(textField4);
         pannello.add(textField5);
         pannello.add(textField6);
         pannello.add(textField7);
         pannello.add(textField8);
         pannello.add(textField9);
         
        
        final JScrollPane scroll = new JScrollPane (pannello); 
        scroll . setVerticalScrollBarPolicy ( ScrollPaneConstants . VERTICAL_SCROLLBAR_ALWAYS );
        
      
       
       //setto la barra con scroll
        
//        final JPanel sopra = new JPanel(new FlowLayout());
//       final JTextField campo = new JTextField("History");
//       sopra.add(campo, FlowLayout.LEFT);
//        panel.add(sopra,BorderLayout.NORTH);
        
        
        
        
        panel.add(scroll,BorderLayout.CENTER);
        
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
    
    
    
    
    public static void main(String[] args){
        new HistoryGUI();
    }

}
