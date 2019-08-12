package controller.menu;

import java.awt.Dialog;

import javax.swing.JFrame;

import model.player.ListOfPlayers;
import view.menu.MainMenu;
import view.menu.MenuGui;
import view.menu.NewGameMenu;
import view.play.MainExternContainer;

public class ControllerSettingPlayersMenu {
	
	public MenuGui startGame(JFrame m, ListOfPlayers l) {
		m.setVisible(false);
		return new MenuGui(new MainExternContainer(l));
		
		
	}
	
	public MenuGui backNewGame(JFrame b) {
		b.setVisible(false);
		
		return new MenuGui(new NewGameMenu());
	}	

}
