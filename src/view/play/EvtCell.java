package view.play;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Optional;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class EvtCell implements ActionListener{

    private String nomeCasella;
    
    public EvtCell(String s) {
        this.nomeCasella = s;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(nomeCasella == "Forlì") {
            
        }
    else{
           JOptionPane.showMessageDialog(null,null,null,
               JOptionPane.INFORMATION_MESSAGE, new ImageIcon("res/Messages/"+nomeCasella+".png"));
       }
    }
}
