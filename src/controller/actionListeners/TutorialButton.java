package controller.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JFrame;

import controller.audio.AudioManager;
import view.menu.MenuGui;
import view.menu.Tutorial;
/**
 * Class that implements the action of
 * the "Tutorial" button.
 */
public class TutorialButton implements ActionListener {
/**
 * Class fields.	
 */
	private AudioManager clip;
	private JFrame frame;
/**
 * Class builder.	
 * @param clip clip audio to be stopped
 * @param frame to close
 */
	public  TutorialButton(final AudioManager clip, final JFrame frame)  {
		this.clip = clip;
		this.frame = frame;
	}
/**
 * Stop the audio and close the current frame and then open
 * the Tutorial frame.	
 */
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			frame.dispose();
			clip.getMusicMenu().stop();
			new MenuGui(new Tutorial());
		} catch (FileNotFoundException e1) {
			System.out.println("File not found");
			e1.printStackTrace();
		} catch (IOException e1) {
			System.out.println("Input/Output exception");
			e1.printStackTrace();
		}
		
		
	}

}
