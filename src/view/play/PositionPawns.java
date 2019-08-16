package view.play;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.*;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import model.utility.Pawns;
/**
 *
 * this class model the visualization of pawns inside each cell.
 *
 */
public class PositionPawns extends JPanel {
	
	/**
	 * fields.
	 */
        private static final long serialVersionUID = 1L;
	ImageIcon icon;
	private ArrayList<JLabel> pawns = new ArrayList<>();
	/**
	 * constructor.
	 */
	public PositionPawns() {
	    
		this.setLayout(new GridLayout(1,4));
		for(int i=0; i <4; i++) {
			pawns.add(new JLabel(""));
			pawns.get(i).setBorder(new LineBorder(Color.BLACK));
			this.add(pawns.get(i));
		}
	}
	/**
	 * method that allow to set an icon on a label.
	 * @param b
	 * @param s
	 */
	public void mySetIcon(JLabel b, String s) {
		icon = new ImageIcon(s);
		Image scaledImage = icon.getImage().getScaledInstance(MainExternContainer.getLeftSide().getWidth() / 72
				, MainExternContainer.getLeftSide().getHeight() / 60, Image.SCALE_DEFAULT);
		icon.setImage(scaledImage);
		b.setIcon(icon);
		b.setHorizontalAlignment(SwingConstants.CENTER);
		b.setAlignmentX(SwingConstants.CENTER);
	}
	/**
	 * method that allows to delete an icon from a label.
	 * @param i
	 */
	public void resetPawnOnIndex(int i) {
		pawns.get(i).setIcon(null);
	}
	/**
	 * method that allows to set a new icon in a label.
	 * @param i
	 * @param p
	 */
	public void setImageOnIndex(int i, Pawns p) {
		mySetIcon(pawns.get(i), "res/pawns/"+p.toString()+".png");	
	}
}
