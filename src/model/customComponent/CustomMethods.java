package model.customComponent;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.myEnum.Colors;
import model.myEnum.Pawns;
/**
 * 
 * Interface that allows you to
 * customize JComponets.
 *
 */
public interface CustomMethods {	
/**
 * Method for creating a sub-panel with customized measurements.
 * @param player a JPanel.
 * @param name a JTextField.
 * @param color a JComboBox.
 * @param pawn a JComboBox.
 */
	void createSetPlayer(final JPanel player,final JTextField name,final JComboBox<Colors> color,final JComboBox<Pawns> pawn,final Font f);
/**
 * Method for creating a panel with customized measurements.
 * @param p
 * @param d
 */	
	void createNumPlayerPanel(final JPanel p,final JLabel l,final JButton n,final Font f);
 
/**
 * Method for customizing a JComponent.	  
 * @param j JComponent to customize
 * @param d JComponent size
 * @param back JComponent background color
 * @param write JComponent foreground color
 * @param f JComponent font
 */
	void setPreference(final JComponent j ,final Dimension d ,final Color back,final Color write,final Font f);
 
/**
 * Method for creating a panel with customized measurements.
 * @param p
 * @param d
 */
	void setMyPanel(final JPanel p,final Dimension d);
/**
 * To set the size of an image. 
 * @return image size
 */
	Dimension getDimImg();
/**
 * To set the font.  
 * @return the font
 */
	Font getFont();
/**
 * To set the width.  
 * @return width.
 */
	int getWidth();
/**
 * To set the height.  
 * @return height
 */
	int getHeight();
/**
 * To set the color of the game background.  
 * @return background color
 */
	Color getBackground();
/**
 *  To set the background color of the buttons. 
 * @return button color
 */
	Color getButton();
/**
 * To set the color of the writing in the buttons.  
 * @return written color
 */
	Color getWriter();
/**
 * To set the dimension of component.
 * @return dimension of screen
 */
	public  Dimension getDim();
	
 
 
}
