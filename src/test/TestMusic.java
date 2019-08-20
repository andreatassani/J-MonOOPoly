package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import controller.actionListeners.Audio;
import controller.audio.AudioManager;
import controller.menu.ControllerMenu;
import controller.menu.ControllerNewGameMenu;
import controller.menu.ControllerSettingPlayersMenu;import view.menu.MainMenu;
/**
 * JUnit test for AudioManager Class;
 * 
 */
public class TestMusic {
/**
 * I tested if the tracks are running properly.
 */
@Test	
	public void testAudioIsPlaying() {
	
	AudioManager clip = new AudioManager();
	
	
	clip.getBuilSound().play();
	assertFalse(clip.getBuilSound().isPlaying());
	
	clip.getCardSound().play();
	assertFalse(clip.getCardSound().isPlaying());
		
	clip.getCashSound().play();
	assertFalse(clip.getCashSound().isPlaying());
	
	clip.getClassicMusic().play();
	assertFalse(clip.getClassicMusic().isPlaying());
	
	clip.getDiceSound().play();
	assertFalse(clip.getDiceSound().isPlaying());
		
	clip.getMusicMenu().play();
	assertFalse(clip.getMusicMenu().isPlaying());
		
	clip.getPawnSound().play();
	assertFalse(clip.getPawnSound().isPlaying());	
	
	clip.getPopMusic().play();
	assertFalse(clip.getPopMusic().isPlaying());	
	
	clip.getRockMusic().play();
	assertFalse(clip.getRockMusic().isPlaying());
		
	clip.getTecnoMusic().play();
	assertFalse(clip.getTecnoMusic().isPlaying());	
	
}
/**
 * I have tested that with the "Audio On" button stops the tracks or not.
 */
@Test
	public void testAudioOnButtonIsWorking() {
	
	ControllerMenu action1 = new ControllerNewGameMenu();
	ControllerMenu action2 = new ControllerSettingPlayersMenu();
	AudioManager clip = new AudioManager();
	action1.musicStop("Audio On", clip);
	assertFalse(clip.getMusicMenu().isPlaying());
	action2.musicStop("Audio On", clip);
	assertFalse(clip.getClassicMusic().isPlaying());
	
	
	
}





	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
}


