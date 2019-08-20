package controller.actionListeners;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
/**
 * 
 * Class that implements the action of the
 * "Number of player" button.
 *
 */
public class NumberOfPlayer implements ActionListener {
/**
 * Class fields.
 */
	private JPanel p3;
	private JPanel p4;
	private JButton b;
/**
 * Class builder.
 * @param p3 JPanel disappears
 * @param p4 JPanel disappears
 * @param b the button that makes the panels disappear
 */
	public NumberOfPlayer(final JPanel p3,final  JPanel p4,final JButton b) {
		this.p3 = p3;
		this.p4 = p4;
		this.b = b;
	}
/**
 * According to the text of the button the panels
 * containing the player info disappear. 
 */
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
