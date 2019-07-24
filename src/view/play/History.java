package view.play;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class History extends JPanel {

	public History(LayoutManager layout) {
		super(layout);

        final JTextField history = new JTextField();
        history.setText("                                     HISTORY");
        history.setVisible(true);
        history.setEnabled(false);
        
		
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setBackground(Color.PINK);
        this.add(history, BorderLayout.NORTH);

	}

}
