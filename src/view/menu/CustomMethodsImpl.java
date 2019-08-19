package view.menu;

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
 * Class implements CustomMethods 
 *
 */
public class CustomMethodsImpl implements CustomMethods {
/**
 * CustomMethods fields.	
 */
	private static final Color _WRITER_ = Color.white;	
	private static final int _WIDTH_ = Toolkit.getDefaultToolkit().getScreenSize().width;
	private static final int _HEIGHT_ = Toolkit.getDefaultToolkit().getScreenSize().height;
	private static final Color _BACKGROUND_ = new Color(173,238,216);
	private static final Color _BUTTON_ = new Color(242,59,59);
	private static Dimension _DIMENSION_ = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
	private static final Font _FONT_ = new Font("Cooper Black", Font.CENTER_BASELINE,30);		
	private static final Dimension _DIMPLAYER_ = new Dimension(_WIDTH_/2,_HEIGHT_);
	private static final Dimension _DIMNAME_ = new Dimension(_WIDTH_/5,_HEIGHT_/28);
	private static final Dimension _DIMCOMBO_ = new Dimension(_WIDTH_/10,_HEIGHT_/28);
	private static final Dimension _DIMIMG_ = new Dimension(_WIDTH_/4,_HEIGHT_/2);
	private static final Dimension  _DIMCOMBOCOLOR_ = new Dimension((_WIDTH_/4)/3,_HEIGHT_/28);
	private static final Dimension _DIMNAMEPLAYER_ = new Dimension(_WIDTH_/3,_HEIGHT_/28);
/**
 * {@inheritDoc}
 */
	public void createSetPlayer(final JPanel player, final JTextField name,final JComboBox<Colors> color,final JComboBox<Pawns> pawn,final Font f) {
		player.setBackground(_BACKGROUND_);
		player.setLayout(new FlowLayout(FlowLayout.CENTER));
		player.setPreferredSize(_DIMPLAYER_);
		name.setBackground(_BUTTON_);
		name.setPreferredSize(_DIMNAME_);
		name.setFont(f);
		name.setForeground(Color.white);
		name.setBorder(new LineBorder(Color.WHITE,4));
		color.setBackground(_BACKGROUND_);
		color.setPreferredSize(_DIMCOMBOCOLOR_);
		color.setFont(f);
		color.setMaximumRowCount(3);
		pawn.setBackground(_BACKGROUND_);
		pawn.setFont(f);		
		pawn.setPreferredSize(_DIMCOMBO_);
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
	public void createNumPlayerPanel(final JPanel p,final  JLabel l, final JButton n, final Font f) {
		p.setLayout(new FlowLayout(FlowLayout.LEFT));
		p.setPreferredSize(_DIMPLAYER_);
		l.setPreferredSize(_DIMNAMEPLAYER_);
		l.setBorder(new LineBorder(Color.black,4));
		l.setForeground(Color.BLACK);
		l.setFont(f);
		n.setFont(f);
		n.setPreferredSize(_DIMCOMBOCOLOR_);
		n.setBackground(_BACKGROUND_);
		p.add(l);
		p.add(n);
				
			}
/**
 * {@inheritDoc}
 */
	public void setPreference(final JComponent j ,final Dimension d ,final Color back,final Color write,final Font f) {
		j.setPreferredSize(d);
		j.setSize(d);
		j.setFont(f);
		j.setBackground(back);
		j.setForeground(write);
		j.setBorder(new LineBorder(write,3));	  
		  		}
/**
 * {@inheritDoc}
 */
	public void setMyPanel(final JPanel p,final Dimension d) { 
	   p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
	   p.setPreferredSize(d);	  	  	 	  
		}
/**
 * {@inheritDoc}
 */
public Dimension getDimImg() {
	return _DIMIMG_;
}
/**
 * {@inheritDoc}
 */
public  Dimension getDim() {
	return _DIMENSION_;
}
/**
 * {@inheritDoc}
 */
public  Font getFont() {
	return _FONT_;
}
/**
 * {@inheritDoc}
 */
public  int getWidth() {
	return _WIDTH_;
}
/**
 * {@inheritDoc}
 */
public  int getHeight() {
	return _HEIGHT_;
}
/**
 * {@inheritDoc}
 */
public  Color getBackground() {
	return _BACKGROUND_;
}
/**
 * {@inheritDoc}
 */
public  Color getButton() {
	return _BUTTON_;
}
/**
 * {@inheritDoc}
 */
public  Color getWriter() {
	return _WRITER_;
}






}
