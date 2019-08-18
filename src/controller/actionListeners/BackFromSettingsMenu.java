package controller.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import controller.audio.AudioManager;
import view.menu.MainMenu;
import view.menu.MenuGui;
/**
 * Class that implements the action of the
 * "Back to main menu" button.
 */
public class BackFromSettingsMenu implements ActionListener {
/**
 * Class fields.
 */
	private JFrame frame;
	private AudioManager clip;
/**
 * Class builder	
 * @param frame frame to close
 * @param clip audio track to be stopped
 */
	public BackFromSettingsMenu(final JFrame frame, final AudioManager clip) {
		this.frame = frame;
		this.clip = clip;
	}
/**
 * Stops the audio track that is playing and
 * closes the running frame and returns to the
 * main menu.
 */
	@Override
	public void actionPerformed(ActionEvent event) {
		clip.getClassicMusic().stop();
		clip.getPopMusic().stop();
		clip.getRockMusic().stop();
		clip.getTecnoMusic().stop();
		frame.dispose();
		new MenuGui(new MainMenu());
		
	}

}
