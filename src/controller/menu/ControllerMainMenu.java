package controller.menu;

import view.menu.HowToPlay;
import view.menu.MainMenu;
import view.menu.MenuGui;
import view.menu.NewGameMenu;

public class ControllerMainMenu {
	
	
	public MenuGui newGame(MainMenu m) {
		m.setVisible(false);
		return new MenuGui(new NewGameMenu());
		
	}
	
	public MenuGui tutorial(MainMenu t) {
		t.setVisible(false);
		return new MenuGui(new HowToPlay());
		
		
	}
	
	public void Audio( ) {
		
	}
}
