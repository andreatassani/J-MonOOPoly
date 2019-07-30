package view.play;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.util.Optional;

import javax.lang.model.type.NullType;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import model.allTypeOfCard.Entity;


public class Cell extends JPanel {
	
		private Dimension dim = new Dimension(104, 90);
		private Dimension dimCorner = new Dimension(111, 91);
		private Dimension dimEastWest = new Dimension(111,88);
		private Color col;
		private JLabel name;
		private JButton image;
		private ImageIcon icon;
		//private JLabel cost;
		int position;
		
	public Cell(int i, String n, Color c, Optional<String> s) {
		
		col = c;
		
		name = new JLabel("" + n, SwingConstants.CENTER);
		name.setBackground(c);
		this.setLayout(new BorderLayout());
		mySetSize(dim);
		
		if (i == 0 || i == 10 || i == 20 || i == 30) {
			mySetSize(dimCorner);
		}
		if (i >= 11 && i<= 19 || i >= 31 && i<= 39 ) {
			mySetSize(dimEastWest);
			}

		
		this.setBackground(c);
		image = new JButton();
		
		//cost = new JLabel(s.get(), SwingConstants.CENTER);
		//this.add(cost, BorderLayout.SOUTH);
		this.add(name, BorderLayout.NORTH);
		
		this.add(image, BorderLayout.CENTER);
		this.setBorder(new LineBorder(Color.BLACK));
		
		
		if(s.isPresent()) {
			icon = new ImageIcon(s.get());
		Image scaledImage = icon.getImage().getScaledInstance(80, 60, Image.SCALE_DEFAULT);
		icon.setImage(scaledImage);
		
		image.setIcon(icon);
		}

	}
	
	public void mySetSize(Dimension d) {
		this.setMaximumSize(d);
		this.setMinimumSize(d);
		this.setPreferredSize(d);
		this.setSize(d);
	}


}
