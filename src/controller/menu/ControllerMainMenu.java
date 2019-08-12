package controller.menu;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;

import controller.audio.AudioManager;
import view.menu.HowToPlay;
import view.menu.MainMenu;
import view.menu.MenuGui;
import view.menu.NewGameMenu;

public class ControllerMainMenu {
	
	
	public MenuGui newGame(JFrame m) {
		m.dispose();
		return new MenuGui(new NewGameMenu());
		
	}
	
	public MenuGui tutorial(JFrame t) {
		t.dispose();
		return new MenuGui(new HowToPlay());
				
	}
	

	
	public void Audio(AudioManager clip , JButton settings ) {
		if(clip.getMusicMenu().isPlaying()) {
			clip.getMusicMenu().stop();
			clip.getHowToPlayMusic().stop();
    		settings.setText("Audio On");
  }
	else {
		clip.getMusicMenu().play();
    		settings.setText("Audio Off");	
    			}
	}
	

	
	
	
	
}
