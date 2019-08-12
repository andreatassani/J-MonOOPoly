package controller.menu;

import java.util.ArrayList;
import javax.swing.JFrame;
import controller.audio.AudioManager;
import model.player.ListOfPlayers;
import model.player.PlayerImpl;
import model.utility.Colors;
import model.utility.Pawns;
import view.menu.MainMenu;
import view.menu.MenuGui;
import view.menu.NewGameMenu;
import view.play.MainExternContainer;
/**
 * 
 * class for managing SettingPlayersMenu action.
 *
 */
public class ControllerSettingPlayersMenu {
/**
 * creation of the playing field and closure of the menu.
 * @param m JFrame to close
 * @param l List of players
 * @param deck
 * @return the playing field
 */
	public MenuGui startGame(JFrame m, ListOfPlayers l, ArrayList<model.allTypeOfCard.Entity> deck) {
		m.dispose();
		return new MenuGui(new MainExternContainer(l,deck));				
	}
/**
 * return to the main menu
 * @param b JFrame to close
 * @return JFrame of main menu
 */
	public MenuGui backNewGame(JFrame b) {
		b.dispose();
		
		return new MenuGui(new MainMenu());
	}
/**
 * disables the audio based on the choice made
 * in the main menu.	
 * @param s comparison string to know if the audio is
 * active or not
 * @param clip audio file to stop
 */
	public void musicStop(String s ,AudioManager clip ) {
		if(s.equals("Audio On")) {
			clip.getMusicMenu().stop();
			NewGameMenu.getClip().getRockMusic().stop();
			NewGameMenu.getClip().getClassicMusic().stop();
			NewGameMenu.getClip().getTecnoMusic().stop();
			NewGameMenu.getClip().getPopMusic().stop();
			
			}else {
				clip.getMusicMenu().loop();
			}
/**
 * player creation.
 * @return player
 */
	}
	public PlayerImpl start(String name, Colors color, Pawns pawn){
		PlayerImpl player = new PlayerImpl(name, color, pawn);
		return player;	
	}
}
