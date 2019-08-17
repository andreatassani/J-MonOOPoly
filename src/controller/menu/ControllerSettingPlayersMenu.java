package controller.menu;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.audio.AudioManager;
import model.myEnum.Colors;
import model.myEnum.Pawns;
import model.player.ListOfPlayers;
import model.player.PlayerImpl;
import view.menu.MainMenu;
import view.menu.MenuGui;
import view.menu.NewGameMenu;
import view.play.MainExternContainerImpl;
/**
 * 
 * class for managing SettingPlayersMenu action.
 *
 */
public class ControllerSettingPlayersMenu {
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
	public PlayerImpl start(String name, Color color, Pawns pawn){
		PlayerImpl player = new PlayerImpl(name, color, pawn);
		return player;	
	}
/**
 * Player color choice.	
 * @param n number corresponding to the choice
 * @return chosen color
 */
	public Color chosenColor(Integer n) {
		Color color = new Color(0,0,0);
		switch(n) {
		case 0:
			color =  Color.red;
			break;
		case 1:
			color = Color.YELLOW;
			break;
		case 2: 
			color = Color.GREEN;
			break;
		case 3:
			color = Color.blue;
			break;
		case 4:
			color = Color.PINK;
			break;
		case 5:
			color =  Color.CYAN;
			break;
		}
		return color;
}
/**
 * Choice of the pawn.
 * @param n number corresponding to the choice
 * @return chosen pawn
 */
	
	public Pawns chosenPawn (Integer n) {
		Pawns pawn = Pawns.BALL;
		switch(n) {
		case 0:
			pawn = Pawns.CAR;
			break;
		case 1:
			pawn = Pawns.BALL;
			break;
		case 2:
			pawn = Pawns.PEN;
			break;
		case 3:
			pawn = Pawns.IRON;
			break;
		case 4:
			pawn = Pawns.BIKE;
			break;
		case 5:
			pawn = Pawns.MOTO;
			break;
		}
		return pawn;
					
		}



		
}
