package controller.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import controller.audio.AudioManager;
import view.menu.MenuGui;
/**
 * Class that implements the action of 
 * the "How to play" button.
 *
 */
public class HowToPlay implements ActionListener {
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
	public HowToPlay(AudioManager clip, JFrame frame) {
		this.clip = clip;
		this.frame = frame;		
	}
/**
 * Action listener which closes the current frame and opens 
 * the game instructions frame.
 */
	@Override
	public void actionPerformed(ActionEvent e) {
		 new MenuGui(new view.menu.HowToPlay());
		 frame.dispose();
		 clip.getMusicMenu().stop();
		
	}

}
