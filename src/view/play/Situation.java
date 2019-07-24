package view.play;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Situation extends JPanel {

	public Situation(LayoutManager layout) {
		super(layout);
		
		final JTextField situation = new JTextField();
        situation.setText("                                    SITUATION");
        situation.setVisible(true);
        situation.setEnabled(false);
        
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	    this.setBackground(Color.YELLOW);
        this.add(situation, BorderLayout.NORTH);
	}
	
	
}
