package controller.audio;

import java.util.TimerTask;

public class MyTask extends TimerTask{
	private AudioManager clip = new AudioManager();
	
	
 public MyTask() {	
	
 }


@Override
public void run() {
	 
	if(clip.getPopMusic().isPlaying()) {
		clip.getPopMusic().stop();
	}else {
		clip.getPopMusic().play();
	}
	
}



}
