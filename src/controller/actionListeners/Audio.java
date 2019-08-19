package controller.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import controller.audio.AudioManager;
/**
 * Class that implements the action of the
 * "Audio" button.
 */
public class Audio implements ActionListener {
/**
 * Fields.	
 */
	private  AudioManager clip;
	private  JButton settings;
/**
 * Class builder.	
 * @param clip audio track to activate/deactivate
 * @param settings  settings JButton to change the header
 */
	 public Audio(AudioManager clip, JButton settings) {
		this.clip = clip;
		this.settings = settings;
		
	}
/**
 * Changes the JButton header and deactivates/activates
 * the audio. 	
 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(clip.getMusicMenu().isPlaying()) {
			clip.getMusicMenu().stop();
    		settings.setText("Audio On");
  }
	else {
		clip.getMusicMenu().loop();
    		settings.setText("Audio Off");	
    			}
	}
	

}
