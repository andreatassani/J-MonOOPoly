package model.customComponent;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import model.myEnum.Colors;
import model.myEnum.Pawns;
/**
 * 
 * Class implements CustomMethods.
 *
 */
public class CustomMethodsImpl implements CustomMethods {
/**
 * CustomMethods fields.
 */
	private static final Color WRITER = Color.white;
	private static final int WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width;
	private static final int HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;
	private static final Color BACKGROUND = new Color(173, 238, 216);
	private static final Color BUTTON = new Color(242, 59, 59);
	private static final Dimension DIMENSION = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
	private static final Font FONT = new Font("Cooper Black", Font.CENTER_BASELINE, 30);
	private static final Dimension DIM_PLAYER = new Dimension(WIDTH / 2, HEIGHT);
	private static final Dimension DIM_NAME = new Dimension(WIDTH / 5, HEIGHT / 28);
	private static final Dimension DIM_COMBO = new Dimension(WIDTH / 10, HEIGHT / 28);
	private static final Dimension DIM_IMG = new Dimension(WIDTH / 4, HEIGHT / 2);
	private static final Dimension DIM_COMBO_COLOR = new Dimension((WIDTH / 4) / 3, HEIGHT / 28);
	private static final Dimension DIM_NAME_PLAYER = new Dimension(WIDTH / 3, HEIGHT / 28);
/**
 * {@inheritDoc}
 */
	public void createSetPlayer(final JPanel player, final JTextField name, final JComboBox<Colors> color,
	                            final JComboBox<Pawns> pawn, final Font f) {
		player.setBackground(BACKGROUND);
		player.setLayout(new FlowLayout(FlowLayout.CENTER));
		player.setPreferredSize(DIM_PLAYER);
		name.setBackground(BUTTON);
		name.setPreferredSize(DIM_NAME);
		name.setFont(f);
		name.setForeground(Color.white);
		name.setBorder(new LineBorder(Color.WHITE, 4));
		color.setBackground(BACKGROUND);
		color.setPreferredSize(DIM_COMBO_COLOR);
		color.setFont(f);
		color.setMaximumRowCount(3);
		pawn.setBackground(BACKGROUND);
		pawn.setFont(f);
		pawn.setPreferredSize(DIM_COMBO);
		pawn.setMaximumRowCount(3);
		pawn.setPopupVisible(false);
		player.add(name);
		player.add(color);
		player.add(pawn);
	}
    /**
     *
     * {@inheritDoc}
     * 
     */	
    public void createNumPlayerPanel(final JPanel p, final  JLabel l, 
	                                 final JButton n, final Font f) {
	 p.setLayout(new FlowLayout(FlowLayout.LEFT));
	 p.setPreferredSize(DIM_PLAYER);
	 l.setPreferredSize(DIM_NAME_PLAYER);
	 l.setBorder(new LineBorder(Color.black,4));
	 l.setForeground(Color.BLACK);
	 l.setFont(f);
	 n.setFont(f);
	 n.setPreferredSize(DIM_COMBO_COLOR);
	 n.setBackground(BACKGROUND);
	 p.add(l);
	 p.add(n);
    }
    /**
     * {@inheritDoc}
     */
    public void setPreference(final JComponent j, final Dimension d,
	                          final Color back, final Color write, final Font f) {
	 j.setPreferredSize(d);
	 j.setSize(d);
	 j.setFont(f);
	 j.setBackground(back);
	 j.setForeground(write);
	 j.setBorder(new LineBorder(write, 3));	  		}
    /**
     * {@inheritDoc}
     */
    public void setMyPanel(final JPanel p, final Dimension d) {
    	 p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
         p.setPreferredSize(d);
    }
    /**
     * {@inheritDoc}
     */
    public Dimension getDimImg() {
    	return DIM_IMG;
    }
    /**
     * {@inheritDoc}
     */
    public  Dimension getDim() {
    	return DIMENSION;
    }
    /**
     * {@inheritDoc}
     */
    public  Font getFont() {
    	return FONT;
    }
    /**
     * {@inheritDoc}
     */
    public  int getWidth() {
    	return WIDTH;
    }
    /**
     * {@inheritDoc}
     */
    public  int getHeight() {
    	return HEIGHT;
    }
    /**
     * {@inheritDoc}
     */
    public  Color getBackground() {
    	return BACKGROUND;
    }
    /**
     * {@inheritDoc}
     */
    public  Color getButton() {
    	return BUTTON;
    }
    /**
     * {@inheritDoc}
     */
    public  Color getWriter() {
    	return WRITER;
    }
}
