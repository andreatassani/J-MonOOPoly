package view.play;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import controller.actionListeners.EvtCell;
import model.allTypeOfCard.Entity;
import model.myUtility.ShowImages;
/**
 * 
 * class that implements Cell.
 *
 */
public class CellImpl extends JPanel implements Cell{
    /**
     * fields.
     */
    private static final long serialVersionUID = 1L;
    private Dimension dim = new Dimension(MainExternContainerImpl.getLeftSide().getWidth() / 11, MainExternContainerImpl.getLeftSide().getHeight() / 11);
    private JLabel name;
    private JButton image;
    private ImageIcon icon;
    private PositionPawnsImpl posPawn = new PositionPawnsImpl();
        /**
	 * constructor.	
	 * @param i
	 * @param s
	 * @param c
	 */
	public CellImpl(final Entity e) {
		this.setLayout(new BorderLayout());
		this.setBackground(e.getColor());
		mySetSize(dim);
		name = new JLabel("" + e.getName(), SwingConstants.CENTER);
		name.setBackground(e.getColor());
		image = new JButton();
		image.setSize(40, 30);
		image.addActionListener(new EvtCell(e));
		this.add(posPawn, BorderLayout.SOUTH);
		this.add(name, BorderLayout.NORTH);
		this.add(image);
		this.setBorder(new LineBorder(Color.BLACK));
		this.mySetIcon(image, new ShowImages().cell(e));
		
	}
	/**
	 * {@inheritDoc}
	 */
        public PositionPawnsImpl getPositionPawns() {
            return this.posPawn;
        }
	/**
	 * {@inheritDoc}
	 */
	public void mySetSize(Dimension d) {
		this.setPreferredSize(d);
		this.setSize(d);
	}
	/**
	 * {@inheritDoc}
	 */
	public void mySetIcon(JButton b, String s) {
		icon = new ImageIcon(this.getClass().getResource(s));
		Image scaledImage = icon.getImage().getScaledInstance(MainExternContainerImpl.getLeftSide().getWidth() / 30, MainExternContainerImpl.getLeftSide().getHeight() / 27, Image.SCALE_DEFAULT);
		icon.setImage(scaledImage);
		b.setIcon(icon);
	}

}
