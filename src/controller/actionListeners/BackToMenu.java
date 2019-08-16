package controller.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import controller.audio.AudioManager;
import controller.menu.ControllerNewGameMenu;
import view.menu.MainMenu;
import view.menu.MenuGui;
import view.menu.NewGameMenu;
import view.play.MainExternContainer;
/**
 * 
 * class that implements what the "back to menu" button in the playground must does.
 *
 */
public class BackToMenu implements ActionListener {
    /**
     * fields.
     */
    private MainExternContainer frame;
    /**
     * 
     * constructor.
     */
    public BackToMenu(MainExternContainer playFrame) {
        this.frame = playFrame;
    }
    /**
     * action of action listener.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
            int choice = JOptionPane.showConfirmDialog(frame, "Are you sure to return in the main menù? \n If you will click 'YES', you will lose all the progress in this session!", "Select an option...", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (choice == 0) {
                new MenuGui(new MainMenu());
                //stoppare musica del gioco, il resto và (aiuto da Fabio)
                frame.dispose();
            }
    }

}
