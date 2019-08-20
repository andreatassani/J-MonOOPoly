package controller.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import controller.audio.AudioManager;
import view.menu.MenuGui;
import view.menu.NewGameMenu;
/**
 * Class that implements the actio of the "Back"
 * of How to play frame
 */
public class BackHowToPlay implements ActionListener {
/**
 * Class fields.	
 */
	private JFrame frame;
	private AudioManager clip;
	private String s;
/**
 * Class builder	
 * @param frame to close
 * @param clip audio track to activate or deactivate
 * @param s comparison to know if the audio is active
 * or not
 */
	public BackHowToPlay(final JFrame frame,final AudioManager clip,final String s) {
		this.frame = frame;
		this.clip = clip;
		this.s = s;
	}
/**
 * Stops the audio track is playing and closes the running frame
 * and returns to the New game menu.
 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(s.equals("Audio On")) {
			clip.getMusicMenu().stop();
		}else {
			clip.getMusicMenu().loop();
		}
		clip.getMusicMenu().stop();
		frame.dispose();
		new MenuGui(new NewGameMenu());
		
	}

}
