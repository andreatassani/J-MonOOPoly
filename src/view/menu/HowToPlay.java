package view.menu;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;

import controller.menu.ControllerMainMenu;
import controller.menu.ControllerNewGameMenu;
/**
 * 
 * class for tutorial management.
 *
 */
public class HowToPlay extends JFrame {
/**
 * HowToPlay fields.
 */
	private static final long serialVersionUID = -8050329563867823166L;
	private static Dimension d = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
	private static final int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	private static final int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	private static final Font f = new Font("Cooper Black", Font.CENTER_BASELINE,40);
	private static final Color backGround = new Color(173,238,216);
	private static final Color button = new Color(236,28,36);
	private static final Dimension dim = new Dimension(300,40);	
	private JPanel general;
	private JLabel img;
	private ImageIcon icon;
	private JButton back;
	private ControllerNewGameMenu action;
/**
 * builder of howToPlay.	
 */
	public HowToPlay() {
/**
 * declaration of the fields. 
 */
	 this.action = new ControllerNewGameMenu();
	 this.general = new JPanel();
	 this.img = new JLabel();
	 this.icon = new ImageIcon("res/howToPlay.png");
	 this.back = new JButton("Back");
/**
 * Actionlistener that allows you to return
 * to the previous menu. 
 */
	 ActionListener al = (e)->{
		 action.back(this);
     };
/**
 *i set the size of the background image, the JComponents that 
 *contain it.     
 */	
	 Image scaledImage = icon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT);
	 img.setIcon(icon);
	 img.setSize(this.getSize());
	 general.setSize(this.getSize());
/**
 *imposed the esthetic customizations
 *of the JComponents.  	 
 */	 
	 setPreference(back, dim, button, Color.black, f);
	 general.setBackground(backGround);
/**
 *i add JComponents to the frame.
 */	 
	 back.addActionListener(al);
	 general.add(img);
	 this.add(general, BorderLayout.CENTER);
	 this.add(back, BorderLayout.SOUTH);	 	 
	}
/**
* method for customizing a JComponent.	  
* @param j JComponent to customize
* @param d JComponent size
* @param back JComponent background color
* @param write JComponent foreground color
* @param f JComponent font
* 
*/	
	  public void setPreference(JComponent j , Dimension d , Color back, Color write, Font f) {
		  j.setPreferredSize(d);
		  j.setSize(d);
		  j.setFont(f);
		  j.setBackground(back);
		  j.setForeground(write);
		  j.setBorder(new LineBorder(write,3));	  
	  		}	
}
