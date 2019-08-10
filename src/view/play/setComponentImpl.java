package view.play;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JComponent;

public class setComponentImpl implements setComponent {

	@Override
	public void setPreference(JComponent j, Dimension d, Color back, Color write, Font f) {
		j.setPreferredSize(d);
		j.setSize(d);
		j.setFont(f);
		j.setBackground(back);
		j.setForeground(write);
		
	}

}
