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

import model.utility.Colors;
import model.utility.NumPlayers;
import model.utility.Pawns;
/**
 * 
 * Class implements CustomMethods 
 *
 */
public class CustomMethodsImpl implements CustomMethods {
/**
 * CustomMethods fields.	
 */	
	private static final int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	private static final int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	private static final Color backGround = new Color(173,238,216);
	private static final Color button = new Color(242,59,59);
	private static Dimension d = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
	private static final Font f = new Font("Cooper Black", Font.CENTER_BASELINE,30);		
	private static final Dimension dimPlayer = new Dimension(width/2,height);
	private static final Dimension dimName = new Dimension(width/5,height/28);
	private static final Dimension dimCombo = new Dimension(width/10,height/28);
	private static final Dimension dimImg = new Dimension(width/4,height/2);
	private static final Dimension dimComboColor = new Dimension((width/4)/3,height/28);
	private static final Dimension dimNameG = new Dimension(width/3,height/28);
	private static final Color writer = Color.white;	
/**
 * {@inheritDoc}
 */
	public void createSetPlayer(JPanel player, JTextField name, JComboBox<Colors> color, JComboBox<Pawns> pawn, Font f) {
		player.setBackground(backGround);
		player.setLayout(new FlowLayout(FlowLayout.CENTER));
		player.setPreferredSize(dimPlayer);
		name.setBackground(button);
		name.setPreferredSize(dimName);
		name.setFont(f);
		name.setForeground(Color.white);
		name.setBorder(new LineBorder(Color.WHITE,4));
		color.setBackground(backGround);
		color.setPreferredSize(dimComboColor);
		color.setFont(f);
		color.setMaximumRowCount(3);
		pawn.setBackground(backGround);
		pawn.setFont(f);		
		pawn.setPreferredSize(dimCombo);
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
	public void createNumPlayerPanel(JPanel p, JLabel l, JButton n, Font f) {
		p.setLayout(new FlowLayout(FlowLayout.LEFT));
		p.setPreferredSize(dimPlayer);
		l.setPreferredSize(dimNameG);
		l.setBorder(new LineBorder(Color.black,4));
		l.setForeground(Color.BLACK);
		l.setFont(f);
		n.setFont(f);
		n.setPreferredSize(dimComboColor);
		n.setBackground(backGround);
		p.add(l);
		p.add(n);
				
			}
/**
 * {@inheritDoc}
 */
	public void setPreference(JComponent j , Dimension d , Color back, Color write, Font f) {
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
	public void setMyPanel(JPanel p, Dimension d) { 
	   p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
	   p.setPreferredSize(d);	  	  	 	  
		}
/**
 * {@inheritDoc}
 */
public Dimension getDimImg() {
	return dimImg;
}
/**
 * {@inheritDoc}
 */
public  Dimension getDim() {
	return d;
}
/**
 * {@inheritDoc}
 */
public  Font getFont() {
	return f;
}
/**
 * {@inheritDoc}
 */
public  int getWidth() {
	return width;
}
/**
 * {@inheritDoc}
 */
public  int getHeight() {
	return height;
}
/**
 * {@inheritDoc}
 */
public  Color getBackground() {
	return backGround;
}
/**
 * {@inheritDoc}
 */
public  Color getButton() {
	return button;
}
/**
 * {@inheritDoc}
 */
public  Color getWriter() {
	return writer;
}






}
