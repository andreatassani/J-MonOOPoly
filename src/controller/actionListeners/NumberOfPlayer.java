package controller.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class NumberOfPlayer implements ActionListener {
	private JPanel p3;
	private JPanel p4;
	private JButton b;

	
	
	public NumberOfPlayer(JPanel p3, JPanel p4, JButton b) {
		this.p3 = p3;
		this.p4 = p4;
		this.b = b;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if(b.getText().equals("4")) {
			b.setText("2");
			p3.setVisible(false);
			 p4.setVisible(false);
		}else if(b.getText().equals("2")) {
			b.setText("3");
			p3.setVisible(true);
		}else {
			b.setText("4");
			 p4.setVisible(true);
			
		}
		
	}

}
