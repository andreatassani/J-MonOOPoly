package controller.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import controller.audio.AudioManager;
import view.menu.MenuGui;
import view.menu.NewGameMenu;
/**
 * Class that implements the action of 
 * the "New Game" button.
 */
public class NewGame  implements ActionListener{
/**
 * Class fields.	
 */
	
	private AudioManager clip;
	private JFrame frame;
/**
 * Class builder.	 
 * @param clip audio track to be stopped
 * @param j frame to close
 */
	public NewGame(AudioManager clip, JFrame j) {
		this.clip = clip;
		this.frame = j;
	}
/**
 * Action listener which closes the current frame and opens 
 * the game settings menu.
 */
	@Override
	public void actionPerformed(ActionEvent e) {
		new MenuGui(new NewGameMenu());
		clip.getMusicMenu().stop();
		frame.dispose();
		
	}
	

}
