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

import model.myEnum.Pawns;
/**
 *
 * this class implements PositionPawns.
 *
 */
public class PositionPawnsImpl extends JPanel implements PositionPawns {
	
	/**
	 * fields.
	 */
        private static final long serialVersionUID = 1L;
	ImageIcon icon;
	private ArrayList<JLabel> pawns = new ArrayList<>();
	/**
	 * constructor.
	 */
	public PositionPawnsImpl() {
	    
		this.setLayout(new GridLayout(1,4));
		for(int i=0; i <4; i++) {
			pawns.add(new JLabel(""));
			pawns.get(i).setBorder(new LineBorder(Color.BLACK));
			this.add(pawns.get(i));
		}
	}
	/**
	 * {@inheritDoc}
	 * @param b
	 * @param s
	 */
	public void mySetIcon(JLabel b, String s) {
		icon = new ImageIcon(s);
		Image scaledImage = icon.getImage().getScaledInstance(MainExternContainerImpl.getLeftSide().getWidth() / 72
				, MainExternContainerImpl.getLeftSide().getHeight() / 60, Image.SCALE_DEFAULT);
		icon.setImage(scaledImage);
		b.setIcon(icon);
		b.setHorizontalAlignment(SwingConstants.CENTER);
		b.setAlignmentX(SwingConstants.CENTER);
	}
	/**
	 * {@inheritDoc}
	 * @param i
	 */
	public void resetPawnOnIndex(int i) {
		pawns.get(i).setIcon(null);
	}
	/**
	 * {@inheritDoc}
	 * @param i
	 * @param p
	 */
	public void setImageOnIndex(int i, Pawns p) {
		mySetIcon(pawns.get(i), "res/pawns/"+p.toString()+".png");	
	}
}
