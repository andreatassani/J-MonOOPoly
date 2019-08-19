package controller.windowListeners;

import java.awt.Window;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import view.menu.MainMenu;
import view.menu.MenuGui;
import view.menu.NewGameMenu;


public class CloseApplication implements WindowListener {
    
 

    private Window s;
    private JFrame main;

    
    public CloseApplication(Window w, JFrame m) {
        this.s = w;
        this.main = m;
    }
    
    @Override
    public void windowClosing(WindowEvent e) {
        int choice = JOptionPane.showConfirmDialog(s, "If you will click 'YES', the entire application will be closed",
                                                   "Select an option...", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (choice == JOptionPane.NO_OPTION) {
            return;
        }
        else {
            s.dispose();
            main.dispose();
        };
    }     
    @Override
    public void windowClosed(WindowEvent e) {        
    }
    @Override
    public void windowOpened(WindowEvent e) {           
    }
    @Override
    public void windowIconified(WindowEvent e) {              
    }
    @Override
    public void windowDeiconified(WindowEvent e) {               
    }
    @Override
    public void windowActivated(WindowEvent e) {                
    }
    @Override
    public void windowDeactivated(WindowEvent e) {            
   }
}
