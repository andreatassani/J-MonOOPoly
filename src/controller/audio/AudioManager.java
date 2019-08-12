package controller.audio;

import java.io.IOException;

import javax.sound.midi.Soundbank;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import controller.audio.AudioSetting;
import controller.*;

public class AudioManager {


	/**
	 * This class stores and gets any {@link Sound}.
	 */
	    private AudioSetting pop;
	    private AudioSetting rock;
	    private AudioSetting tecno;
	    private AudioSetting classic;
	    private AudioSetting menuMusic;
	    private AudioSetting howToPlay;

	    /**
	     * Creates a {@code SoundsManager}.
	     *
	     * @param folder where to take the sounds
	     * @throws UnsupportedAudioFileException : wrong audio file format
	     * @throws IOException : problem during input/output
	     * @throws LineUnavailableException : audio line can't be opened because it is unavailable
	     */
	    public AudioManager() {
	        try {
	            this.pop = new AudioSettingImpl("/menuSong.wav");
	            this.rock = new  AudioSettingImpl( "/menuSong.wav");
	            this.tecno = new  AudioSettingImpl("/menuSong.wav");
	            this.classic = new  AudioSettingImpl("/menuSong.wav");
	            this.menuMusic = new  AudioSettingImpl("/menuSong.wav");
	            this.howToPlay = new AudioSettingImpl("/howToPlaySong.wav");
	            
	        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
	            e.printStackTrace();
	        }
	    }

/**
 *Gets the music in menu.
 *
 * @return menuMusic 
 */
	    public AudioSetting getMusicMenu() {
	        return this.menuMusic;
	    }

/**
 * Gets the pop music.
 *
 * @return pop 
 */
	    public AudioSetting getPopMusic() {
	        return this.pop;
	    }

/**
 * Gets the rock music.
 *
 * @return rock 
 */
	    public AudioSetting getRockMusic() {
	        return this.rock;
	    }
/**
 * Gets the classic music.
 *
 * @return classic 
 */ 
	    public AudioSetting getClassicMusic() {
	        return this.classic;
	    }
/**
 * Gets the tecno music.
 *
 * @return tecno 
 */
	    public AudioSetting getTecnoMusic() {
	        return this.tecno;
	    }
/**
 * Gets the howToPlaySong music.
 * @return howToPlaySong 
 */
	    public AudioSetting getHowToPlayMusic() {
	    	return this.howToPlay;
	    }


	}



