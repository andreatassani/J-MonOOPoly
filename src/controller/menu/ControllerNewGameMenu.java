package controller.menu;

import javax.swing.JFrame;

import view.menu.MainMenu;
import view.menu.MenuGui;
import view.menu.SettingPlayersMenu;

public class ControllerNewGameMenu {
		
	public MenuGui players(JFrame m) {
		m.setVisible(false);
		return new MenuGui(new SettingPlayersMenu());
		
	}
	
	public MenuGui back(JFrame b) {
		b.setVisible(false);
		return new MenuGui(new MainMenu());
	}
	
	


}
