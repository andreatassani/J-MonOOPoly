package controller.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import controller.audio.AudioManager;
import view.menu.MainMenu;
import view.menu.MenuGui;

public class BackFromSettingsMenu implements ActionListener {
	private JFrame frame;
	private AudioManager clip;
	
	public BackFromSettingsMenu(JFrame frame, AudioManager clip) {
		this.frame = frame;
		this.clip = clip;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		clip.getClassicMusic().stop();
		clip.getPopMusic().stop();
		clip.getRockMusic().stop();
		clip.getTecnoMusic().stop();
		frame.dispose();
		new MenuGui(new MainMenu());
		
	}

}
