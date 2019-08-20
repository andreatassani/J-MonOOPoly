package controller.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import view.menu.NewGameMenu;
/**
 * 
 * class that implements what the "back to menu" button in the playground must does.
 *
 */
public class BackToMenu implements ActionListener {
    /**
     * fields.
     */
    private JFrame frame;
    /**
     * constructor.
     * @param playFrame this is the frame that will be closed.
     */
    public BackToMenu(final JFrame playFrame) {
        this.frame = playFrame;
    }
    /**
     * action of action listener.
     */
    @Override
    public void actionPerformed(final ActionEvent e) {
            Integer choice = JOptionPane.showConfirmDialog(frame, "Are you sure to close the game? \n If you will click 'YES', "
                                                       + "you will lose all the progress in this session!", "Select an option...", 
                                                       JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (choice.equals(0)) {
                frame.dispose();
                NewGameMenu.getClip().getPopMusic().stop();
                NewGameMenu.getClip().getTecnoMusic().stop();
                NewGameMenu.getClip().getClassicMusic().stop();
                NewGameMenu.getClip().getRockMusic().stop();
            }
    }
}
