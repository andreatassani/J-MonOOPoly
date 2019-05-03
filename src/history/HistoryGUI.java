package history;

import javax.swing.*;



import java.awt.event.*;
import java.awt.*;

public class HistoryGUI extends JFrame{
    
    
    public HistoryGUI() {
        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(500, 500);
       
        JPanel panel = new JPanel(new BorderLayout());
        
        final JPanel sopra = new JPanel(new FlowLayout());
       final JTextField campo = new JTextField("History");
       sopra.add(campo, FlowLayout.LEFT);
        panel.add(sopra,BorderLayout.NORTH);
        
        
        final JTextArea textArea = new JTextArea (); // Area di testo
         textArea . setLineWrap ( true );
        final JScrollPane scroll = new JScrollPane ( textArea ); // Pannello con barra
        scroll . setVerticalScrollBarPolicy ( ScrollPaneConstants . VERTICAL_SCROLLBAR_ALWAYS );
        
        panel.add(scroll,BorderLayout.CENTER);
        
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
    
    
    
    
    public static void main(String[] args){
        new HistoryGUI();
    }

}
