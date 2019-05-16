package settings;

import utility.Music;

/**
 * 
 * interface for setting section methods.
 *
 */
public interface AudioSetting {
/**
 * @return true if the audio is active.
 */
boolean isOn();
/**
*
* @param audio
*            the audio to play.
*/
void play(Music audio);
/**
 * 
 * @param volume
 *            the volume level to set.
 */
void setVolume(int volume);
/**
*
* @param audio
*            the audio to stop.
*/
void stop(Music audio);

}
