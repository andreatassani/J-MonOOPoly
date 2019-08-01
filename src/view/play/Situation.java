package view.play;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Situation extends JPanel {

	public Situation() {

		this.setLayout(new BorderLayout());
		this.setBackground(Color.YELLOW);
		
		TextField situation = new TextField("SITUATION");
		situation.setEnabled(false);
		this.add(situation, BorderLayout.NORTH);
		this.setBorder(new LineBorder(Color.BLACK));
		
		
	}
}
