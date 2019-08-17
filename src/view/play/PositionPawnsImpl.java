package view.play;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import model.myEnum.Pawns;import model.player.PlayerImpl;
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
			pawns.get(i).setOpaque(true);
			pawns.get(i).setBackground(Color.WHITE);
			this.add(pawns.get(i));
		}
	}
	/**
	 * {@inheritDoc}
	 * @param b
	 * @param s
	 */
	public void mySetIcon(JLabel b, String s, Color col) {
	        b.setBackground(col);
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
		pawns.get(i).setBackground(Color.WHITE);
	}
	/**
	 * {@inheritDoc}
	 * @param i
	 * @param p
	 */
	public void setImageOnIndex(int i, PlayerImpl pl) {
		mySetIcon(pawns.get(i), "res/pawns/"+pl.getPawn().toString()+".png", pl.getColors());	
	}
}
