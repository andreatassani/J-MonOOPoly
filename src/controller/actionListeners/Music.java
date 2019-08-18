package controller.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Music implements ActionListener{
	
	private JLabel music;

	
	
	public Music(JLabel music) {
		this.music = music;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(music.getText().equals("ROCK")) {
			music.setText("TECNO");
		}else if(music.getText().equals("TECNO")){
			music.setText("CLASSIC");
		}else if(music.getText().equals("CLASSIC")) {
			music.setText("NARCOS");
		}else {
			music.setText("ROCK");
		}
		
	}

}
