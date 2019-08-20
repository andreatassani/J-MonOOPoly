package controller.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import controller.audio.AudioManager;
import controller.menu.ControllerNewGameMenu;
import view.menu.HowToPlay;
import view.menu.MainMenu;
import view.menu.MenuGui;
/**
 * Class that implements the action of 
 * the "How to play" button.
 *
 */
public class HowToPlayButton implements ActionListener {
/**
 * Class fields.	
 */
	private AudioManager clip;
	private JFrame frame;	
/**
 * Class builder.	
 * @param clip clip audio track to be stopped
 * @param frame frame to close
 */
	public HowToPlayButton(final AudioManager clip, final JFrame frame) {
		this.clip = clip;
		this.frame = frame;	
	}
/**
 * Action listener which closes the current frame and opens 
 * the game instructions frame.
 */
	@Override
	public void actionPerformed(ActionEvent e) {
		 new MenuGui(new HowToPlay());
		frame.dispose();		
		clip.getMusicMenu().stop();
		
	}

}
