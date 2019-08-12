package controller.menu;

import java.awt.Dialog;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.html.parser.Entity;

import controller.audio.AudioManager;
import model.player.ListOfPlayers;
import model.player.Player;
import model.player.PlayerImpl;
import model.utility.Colors;
import model.utility.Pawns;
import view.menu.MainMenu;
import view.menu.MenuGui;
import view.menu.NewGameMenu;
import view.play.MainExternContainer;

public class ControllerSettingPlayersMenu {

	public MenuGui startGame(JFrame m, ListOfPlayers l, ArrayList<model.allTypeOfCard.Entity> deck) {
		m.setVisible(false);
		return new MenuGui(new MainExternContainer(l,deck));
		
		
	}
	
	public MenuGui backNewGame(JFrame b) {
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
	public PlayerImpl start(String name, Colors color, Pawns pawn){
		PlayerImpl player = new PlayerImpl(name, color, pawn);
		return player;
		
		
	}
	
	

}
