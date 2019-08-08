package controller.audio;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import controller.audio.AudioSetting;
import controller.*;

public class AudioMenager {


	/**
	 * This class stores and gets any {@link Sound}.
	 */
	    private AudioSetting pop;
	    private AudioSetting rock;
	    private AudioSetting techno;
	    private AudioSetting classic;
	    private AudioSetting menuMusic;

	    /**
	     * Creates a {@code SoundsManager}.
	     *
	     * @param folder where to take the sounds
	     * @throws UnsupportedAudioFileException : wrong audio file format
	     * @throws IOException : problem during input/output
	     * @throws LineUnavailableException : audio line can't be opened because it is unavailable
	     */
	    public AudioMenager() {
	        try {
	            this.explosion = new AudioSettingImpl("/menuSong.wav");
	            this.music = new  AudioSettingImpl( "/menuSong.wav");
	            this.door = new  AudioSettingImpl("/menuSong.wav");
	        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
	            e.printStackTrace();
	        }
	    }

	    /**
	     * Gets the music in game.
	     *
	     * @return music {@link Sound}
	     */
	    public AudioSetting getMusicSound() {
	        return this.music;
	    }

	    /**
	     * Gets the opening door sound.
	     *
	     * @return opening door {@link Sound}
	     */
	    public AudioSetting getDoorSound() {
	        return this.door;
	    }

	    /**
	     * Gets the explosion sound.
	     *
	     * @return explosion {@link Sound}
	     */
	    public AudioSetting getExplosionSound() {
	        return this.explosion;
	    }

	}



