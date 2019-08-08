package controller.menu;

import javax.swing.JFrame;

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
	

	
	public void Audio( ) {
		
	}
}
