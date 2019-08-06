package view.menu;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HowToPlay extends JPanel {


	private static final long serialVersionUID = -8050329563867823166L;
	private static final int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	private static final int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	private ImageIcon icon;
	private JLabel rules;
	private File pdf;
	
	
	


	
	
	public HowToPlay() {
		this.pdf = new File("res/RegoleMonopoli.pdf");
	
		this.rules = new JLabel();
		this.setLayout(new BorderLayout());
		
		
		
	}
	
}
