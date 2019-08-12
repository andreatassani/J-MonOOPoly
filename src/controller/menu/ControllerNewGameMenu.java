package controller.menu;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTextField;

import controller.audio.AudioManager;
import model.player.Player;
import model.player.PlayerImpl;
import model.utility.Colors;
import model.utility.Music;
import model.utility.Pawns;
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
	
	public void music(Object object, AudioManager clip) {
		switch(model.utility.Music.ROCK ) {
		case ROCK :
			clip.getRockMusic();
			break;
		case POP:
			clip.getPopMusic();
		case CLASSIC:
			clip.getClassicMusic();
		case TECNO:
			clip.getTecnoMusic();
		
		}
	}


		
		
	

}
