package view.play;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.util.Optional;

import javax.lang.model.type.NullType;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import model.allTypeOfCard.Entity;
import model.images.ShowImages;


public class Cell extends JPanel {
	
		private Dimension dimCorner = new Dimension(MainExternContainer.getLeftSide().getWidth() / 11, MainExternContainer.getLeftSide().getHeight() / 12);
		private Dimension dimEastWest = new Dimension(MainExternContainer.getLeftSide().getWidth() / 11 + 1, MainExternContainer.getLeftSide().getHeight() / 11 + 1);
		private Dimension dim = new Dimension(MainExternContainer.getLeftSide().getWidth() / 14, MainExternContainer.getLeftSide().getHeight() / 12);

		private Color col;
		private JLabel name;
		private JButton image;
		private ImageIcon icon;
		int position;
		Entity card;
		
	public Cell(int i, String s, Color c) {
		
		
		this.col = c;
		this.position = i;
		
		name = new JLabel("" + s, SwingConstants.CENTER);
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
		image.setSize(40, 30);
		image.addActionListener(new EvtCell(s));

		this.add(new PositionPawns(), BorderLayout.SOUTH);
		this.add(name, BorderLayout.NORTH);
		
		this.add(image);
		this.setBorder(new LineBorder(Color.BLACK));
		
		
		if(ShowImages.nonPropertyCell(s).isPresent()) {
			mySetIcon(image, ShowImages.nonPropertyCell(s).get());
		}

	}
	
	public void mySetSize(Dimension d) {
		this.setMaximumSize(d);
		this.setMinimumSize(d);
		this.setPreferredSize(d);
		this.setSize(d);
	}
	
	public void mySetIcon(JButton b, String s) {
		icon = new ImageIcon(s);
		Image scaledImage = icon.getImage().getScaledInstance(MainExternContainer.getLeftSide().getWidth() / 30, MainExternContainer.getLeftSide().getHeight() / 27, Image.SCALE_DEFAULT);
		icon.setImage(scaledImage);
		b.setIcon(icon);
	}
}
