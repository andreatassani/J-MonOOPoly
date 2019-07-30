package view.play;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class History extends JPanel {
	
	public History() {
		
		this.setLayout(new BorderLayout());
		this.setBackground(Color.RED);
		
		TextField history = new TextField("HISTORY");
		history.setEnabled(false);
		this.add(history, BorderLayout.NORTH);
		this.setBorder(new LineBorder(Color.BLACK));
		
		
	}

}
