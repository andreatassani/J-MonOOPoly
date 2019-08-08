package controller.menu;

import javax.swing.JButton;
import javax.swing.JFrame;

import controller.audio.AudioManager;
import view.menu.HowToPlay;
import view.menu.MainMenu;
import view.menu.MenuGui;
import view.menu.NewGameMenu;

public class ControllerMainMenu {
	
	
	public MenuGui newGame(JFrame m) {
		m.setVisible(false);
		return new MenuGui(new NewGameMenu());
		
	}
	
	public MenuGui tutorial(JFrame t) {
		t.setVisible(false);
		return new MenuGui(new HowToPlay());
				
	}
	

	
	public void Audio(AudioManager clip , JButton settings ) {
		if(clip.getPopMusic().isPlaying()) {
    		clip.getPopMusic().stop();
    		settings.setText("Audio On");
    	}else
    	{
    		clip.getPopMusic().play();
    		settings.setText("Audio Off");
    		
    	}
		
	}
}
