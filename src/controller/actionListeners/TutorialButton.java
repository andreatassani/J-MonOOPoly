package controller.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import controller.audio.AudioManager;
import model.allTypeOfCard.Property;
import view.menu.MenuGui;
import view.menu.Tutorial;
/**
 * Class that implements the action of
 * the "Tutorial" button.
 */
public class TutorialButton implements ActionListener {
/**
 * Class fields.	
 */
                
    
/**
 * Class builder.	
 * @param clip clip audio to be stopped
 * @param frame to close
 */
	public  TutorialButton()  {
		
	}
/**
 * Stop the audio and close the current frame and then open
 * the Tutorial frame.	
 */
	@Override
	public void actionPerformed(ActionEvent e) {
	    JOptionPane.showMessageDialog(null, null, null,
                    JOptionPane.INFORMATION_MESSAGE, new ImageIcon(this.getClass().getResource("/rules.png")));
	}

}
