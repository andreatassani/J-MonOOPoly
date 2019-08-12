package controller.menu;

import javax.swing.JFrame;

import controller.audio.AudioManager;
import view.menu.MainMenu;
import view.menu.MenuGui;
import view.menu.SettingPlayersMenu;

public class ControllerNewGameMenu {
		
	public MenuGui players(JFrame m) {
		m.dispose();
		return new MenuGui(new SettingPlayersMenu());
		
	}
	
	public MenuGui back(JFrame b) {
		b.dispose();
		return new MenuGui(new MainMenu());
	}
	
	public void musicStop(String s ,AudioManager clip ) {
		if(s.endsWith("Audio On")) {
			clip.getMusicMenu().stop();
			}else {
				clip.getMusicMenu().play();
			}
		
		
	}


}
