package controller.audio;

import model.utility.Music;

/**
 * 
 * interface for setting section methods.
 *
 */
/**
 * It represents a sound.
 */
public interface AudioSetting {

/**
 * Plays a sound if it's stopped.
 */
    void play();

/**
 * Stops a sound.
 */
    void stop();

/**
 * Gets the sound state.
 *
 * @return true if sound is playing, otherwise false
     */
    boolean isPlaying();

}