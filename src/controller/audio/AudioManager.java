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
	    private AudioSetting card;
	    private AudioSetting dice;
	    private AudioSetting pawn;
	    private AudioSetting cash;
	    
	    

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
	            this.pop = new AudioSettingImpl("/pop.wav");
	            this.rock = new  AudioSettingImpl( "/rock.wav");
	            this.tecno = new  AudioSettingImpl("/tecno.wav");
	            this.classic = new  AudioSettingImpl("/classic.wav");
	            this.menuMusic = new  AudioSettingImpl("/menuSong.wav");
	            this.card = new AudioSettingImpl("/carta.wav");
	            this.dice = new AudioSettingImpl("/dadi.wav");
	            this.pawn = new AudioSettingImpl("/pedina.wav");
	            this.cash = new AudioSettingImpl("/soldi.wav");
	           
	            
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
 * Gets the dice sound.
 *
 * @return dice 
 */
	    public AudioSetting getDiceSound() {
	        return this.dice;
	    }
/**
 * Gets the cash sound.
 *
 * @return cash
 */
	     public AudioSetting getCashSound() {
	    	        return this.cash;
	    	    } 
/**
 * Gets the card sound.
 *
 * @return card 
 */
	    public AudioSetting getCardSound() {
	     	        return this.card;
	     	    }
/**
 * Gets the pawn sound.
 *
 * @return pawn
 */
	    public AudioSetting getPawnSound() {
	    	        return this.pawn;
	    	    }
	}



