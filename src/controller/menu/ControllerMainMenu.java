package controller.menu;

import javax.swing.JButton;
import javax.swing.JFrame;
import controller.audio.AudioManager;
import view.menu.HowToPlay;
import view.menu.MenuGui;
import view.menu.NewGameMenu;
/**
 * 
 * class for managing MainMenu action.
 *
 */
public class ControllerMainMenu {
/**
 * creates a new frame of type NewGameMenu, and closes the frame
 * in execution.	
 * @param JFrame m to close
 * @return JFrame to create
 */	
	public MenuGui newGame(JFrame m) {
		m.dispose();
		return new MenuGui(new NewGameMenu());		
	}
/**
 * creates a new frame of type HowToPlay, and closes the frame
 * in execution.
 * @param JFrame t to close
 * @return JFrame to create
 */	
	public MenuGui tutorial(JFrame t) {
		t.dispose();
		return new MenuGui(new HowToPlay());				
	}
/**
 * changes the JButton header and deactivates/activates
 * the audio. 	
 * @param clip audio track to activate/deactivate
 * @param settings JButton to change the header
 */
	public void audio(AudioManager clip , JButton settings ) {
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
