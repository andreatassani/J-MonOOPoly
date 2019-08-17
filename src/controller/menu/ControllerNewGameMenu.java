package controller.menu;

import javax.swing.JFrame;
import controller.audio.AudioManager;
import view.menu.MainMenu;
import view.menu.MenuGui;
import view.menu.SettingPlayersMenu;
/**
 * class for managing NewGameMenu action.
 * 
 *
 */
public class ControllerNewGameMenu {
/**
 * creates a new frame of type SettinPlayersMenu, and close the frame
 * in execution.  		
 * @param JFrame m to close
 * @return JFrame to create
 */
	public MenuGui players(JFrame m) {
		m.dispose();
		return new MenuGui(new SettingPlayersMenu());
		
	}
/**
 * deactivate/activate the audio according to the main
 * menu settings.	
 * @param String s comparison to know if the audio is active
 * or not
 * @param clip audio file to activate or deactivate
 */
	public void musicStop(String s ,AudioManager clip ) {
		if(s.equals("Audio On")) {
			clip.getMusicMenu().stop();
			}else {
				clip.getMusicMenu().loop();
			}
	}
/**
 * choice of the audio track to listen to during the game.
 * @param Integer m corresponding to the chosen audio track
 * @param clip audio file chosen
 */	
	public void music(Integer m, AudioManager clip) {
		switch(m) {
		case 0:
			clip.getRockMusic().loop();
			break;
		case 1:
			clip.getTecnoMusic().loop();
			break;
		case 2:
			clip.getClassicMusic().loop();;
			break;
		case 3:
			clip.getPopMusic().loop();
			break;
		}
	}

}
