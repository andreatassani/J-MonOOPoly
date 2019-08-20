package controller.audio;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * Class that stores a sound, and it plays it.
 */
public class AudioSettingImpl implements AudioSetting {

    private static final int FIRST_SONG_FRAME = 0;
    private final Clip clip;

 /**
  * Creates {@code SoundImpl}.
  *
  * @param path to load the audio file
  * @throws UnsupportedAudioFileException wrong audio file format
  * @throws IOException problem during input/output
  * @throws LineUnavailableException audio line can't be opened because it's unavailable
  */
    public AudioSettingImpl(final String path) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        final AudioInputStream ais = AudioSystem.getAudioInputStream(this.getClass().getResource(path));
        this.clip = AudioSystem.getClip();
        this.clip.open(ais);
    }

/**
 * {@inheritDoc}
 */
 @Override
    public void play() {
        this.clip.setFramePosition(FIRST_SONG_FRAME);
        this.clip.start();
     
    }

/**
 * {@inheritDoc}
 */
    @Override
    public void stop() {
        this.clip.stop();
    }

/**
 * {@inheritDoc}
 */
 @Override
  public boolean isPlaying() {
        return this.clip.isRunning();
    }
/**
 * {@inheritDoc}
 */
 @Override
 public void loop() {
	 this.clip.start();
	 this.clip.loop(Clip.LOOP_CONTINUOUSLY);
 }

}
