package controller.menu;

import controller.audio.AudioManager;
/**
 * Interface for setting check sound methods.
 */
public interface ControllerMenu {
/**
 * Disables the audio based on the choice made
 * in the main menu.
 * @param s s comparison string to know if the audio is
 * active or not
 * @param clip clip audio file to stop
 */	
	void musicStop(final String s, final AudioManager clip);
	
}
