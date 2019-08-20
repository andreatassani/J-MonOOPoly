package controller.actionListeners;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.management.GarbageCollectorMXBean;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.allTypeOfCard.EntityDeck;
import model.myEnum.Pawns;
import model.player.ListOfPlayers;
import model.player.PlayerImpl;
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
    private JFrame frame;
    /**
     * 
     * constructor.
     */
    public BackToMenu(JFrame playFrame) {
        this.frame = playFrame;
    }
    /**
     * action of action listener.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
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
