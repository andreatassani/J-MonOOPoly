package controller.audio;
/**
 * interface for setting section methods.
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
/**
 * loop a sound.    
 */  
    void loop();

}