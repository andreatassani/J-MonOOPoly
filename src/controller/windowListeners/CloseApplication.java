package controller.windowListeners;

import java.awt.Window;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import view.menu.MainMenu;
import view.menu.MenuGui;
import view.menu.NewGameMenu;
/**
 * 
 * this class model the closing of the last winner frame.
 *
 */

public class CloseApplication implements WindowListener {
    /**
     * fields.
     */
    private Window s;
    private JFrame main;
    /**
     * constructor.
     * @param w this is the window where JFrame will open over.
     * @param m JFrame 
     */
    public CloseApplication(final Window w, final JFrame m) {
        this.s = w;
        this.main = m;
    }
    @Override
    public final void windowClosing(final WindowEvent e) {
        int choice = JOptionPane.showConfirmDialog(s, "If you will click 'YES', the entire application will be closed",
                                                   "Select an option...", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (choice == JOptionPane.NO_OPTION) {
            return;
        } else {
              s.dispose();
              main.dispose();
        }
    }
    @Override
    public void windowClosed(final WindowEvent e) {
    }
    @Override
    public void windowOpened(final WindowEvent e) {
    }
    @Override
    public void windowIconified(final WindowEvent e) {
    }
    @Override
    public void windowDeiconified(final WindowEvent e) {
    }
    @Override
    public void windowActivated(final WindowEvent e) {
    }
    @Override
    public void windowDeactivated(final WindowEvent e) {
   }
}
