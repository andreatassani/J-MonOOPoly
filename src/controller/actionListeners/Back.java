package controller.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import controller.audio.AudioManager;
import view.menu.MainMenu;
import view.menu.MenuGui;
/**
 * Class that implements the action of
 * the "Back" button.
 */
public class Back implements ActionListener {
/**
 * Class fields.	
 */
	private JFrame frame;
	private AudioManager clip;
	private String s;
/**
 * Class builder.	
 * @param frame frame to close
 * @param clip audio track to activate or deactivate
 * @param s  comparison to know if the audio is active
 * or not
 */
	public Back(JFrame frame, AudioManager clip, String s) {
		this.frame = frame;
		this.clip = clip;
		this.s = s;
	}
/**
 * Action listener which deactivate/activate the audio according to the main
 * menu settings and closes the current frame and opens the Main Menu.
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
		new MenuGui(new MainMenu());
		
	}

}
