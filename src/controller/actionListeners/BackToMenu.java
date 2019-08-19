package controller.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.menu.MainMenu;
import view.menu.MenuGui;
import view.menu.NewGameMenu;
import view.play.MainExternContainerImpl;
/**
 * 
 * class that implements what the "back to menu" button in the playground must does.
 *
 */
public class BackToMenu implements ActionListener {
    /**
     * fields.
     */
    private MainExternContainerImpl frame;
    /**
     * 
     * constructor.
     */
    public BackToMenu(MainExternContainerImpl playFrame) {
        this.frame = playFrame;
    }
    /**
     * action of action listener.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
            int choice = JOptionPane.showConfirmDialog(frame, "Are you sure to return in the main menù? \n If you will click 'YES', "
                                                       + "you will lose all the progress in this session!", "Select an option...", 
                                                       JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (choice == 0) {
                new MenuGui(new MainMenu());
                NewGameMenu.getClip().getPopMusic().stop();
                NewGameMenu.getClip().getTecnoMusic().stop();
                NewGameMenu.getClip().getClassicMusic().stop();
                NewGameMenu.getClip().getRockMusic().stop();
                frame.dispose();
            }
    }

}
