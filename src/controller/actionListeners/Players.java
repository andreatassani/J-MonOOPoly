package controller.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

import controller.audio.AudioManager;
import model.myEnum.Music;
import view.menu.MenuGui;
import view.menu.SettingPlayersMenu;
/**
 * Class that implements the action of 
 * the "Players" button.
 */
public class Players implements ActionListener {
/**
 * Class fields.
 */
	private JFrame frame;
	private AudioManager clip;
	private String m;
	private AudioManager clip2;
	
	
	
/**
 * Class builder	
 * @param frame frame to close
 * @param clip clip audio track to activate/deactivate
 * @param clip2 clip audio track to activate/deactivate
 * @param m
 */	
	public Players(final JFrame frame, final  AudioManager clip, final AudioManager clip2, final String m) {
		super();
		this.frame = frame;
		this.clip = clip;
		this.clip2 = clip2;
		this.m = m;
/**
 * Action listener which closes the current frame and opens Settings Player menu and
 * choice of the audio track to listen to during the game.	
 */
	}
	@Override
	public void actionPerformed(ActionEvent e) {		
		
		switch(m) {
		case "ROCK":
			clip2.getRockMusic().loop();
			break;
		case "TECNO":
			clip2.getTecnoMusic().loop();
			break;
		case "CLASSIC":
			clip2.getClassicMusic().loop();;
			break;
		case "NARCOS":
			clip2.getPopMusic().loop();
			break;
		}
		clip.getMusicMenu().stop();
		frame.dispose();
		new MenuGui(new SettingPlayersMenu());
		System.out.println(m);
		
	
		
		
	}

}
