package view.play;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Optional;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import model.allTypeOfCard.Entity;
import model.allTypeOfCard.EntityDeck;
import model.allTypeOfCard.Property;
import model.allTypeOfCard.Start;
import view.play.*;




public class GridCell extends JPanel {

 
	public GridCell() {
	    final ArrayList<Entity> deck = new EntityDeck().getDeck();
		this.setLayout(new BorderLayout());
		this.setPreferredSize(MainExternContainer.getLeftSide().getPreferredSize());
		this.setMinimumSize(MainExternContainer.getLeftSide().getSize());
		
		Box north = new Box(BoxLayout.X_AXIS);
		Box south = new Box(BoxLayout.X_AXIS);
		Box east = new Box(BoxLayout.Y_AXIS);
		Box west = new Box(BoxLayout.Y_AXIS);
		JLabel logo = new JLabel();
		ImageIcon icon;
		
		this.add(north, BorderLayout.NORTH);
		this.add(south, BorderLayout.SOUTH);
		this.add(east, BorderLayout.EAST);
		this.add(west, BorderLayout.WEST);

		north.add(new Cell(0, "Via!", Color.WHITE, Optional.of("res/Cells/Via!.png")));
		north.add(new PropertyCell((Property) deck.get(0)));
		north.add(new Cell(2, "Probabilità", Color.WHITE, Optional.of("res/Cells/Probabilità.png")));
		north.add(new PropertyCell((Property) deck.get(1)));
		north.add(new Cell(4, "Tassa", Color.WHITE, Optional.of("res/Cells/Tassa.png")));
		north.add(new Cell(5, "stazione N", Color.GRAY, Optional.of("res/Cells/Stazione.png")));
		north.add(new PropertyCell((Property) deck.get(2)));
		north.add(new Cell(7, "Imprevisto", Color.WHITE, Optional.of("res/Cells/Imprevisto.png")));
		north.add(new PropertyCell((Property) deck.get(3)));
		north.add(new PropertyCell((Property) deck.get(4)));
		north.add(new Cell(10,"Prigione", Color.WHITE, Optional.of("res/Cells/Prigione.png")));
		east.add(new PropertyCell((Property) deck.get(5)));
		east.add(new Cell(12, "enel", Color.WHITE, Optional.of("res/Cells/lampadina.png")));
		east.add(new PropertyCell((Property) deck.get(6)));
		east.add(new PropertyCell((Property) deck.get(7)));
		east.add(new Cell(15, "stazione E", Color.GRAY, Optional.of("res/Cells/Stazione.png")));
		east.add(new PropertyCell((Property) deck.get(8)));
		east.add(new Cell(17, "Probabilità", Color.WHITE, Optional.of("res/Cells/Probabilità.png")));
		east.add(new PropertyCell((Property) deck.get(9)));
		east.add(new PropertyCell((Property) deck.get(10)));
		south.add(new Cell(30, "Polizia", Color.WHITE, Optional.of("res/Cells/Polizia.png")));
		south.add(new PropertyCell((Property) deck.get(16)));
		south.add(new Cell(22, "Imprevisto", Color.WHITE, Optional.of("res/Cells/Imprevisto.png")));
		south.add(new PropertyCell((Property) deck.get(15)));
		south.add(new PropertyCell((Property) deck.get(14)));
		south.add(new Cell(25, "stazione S", Color.GRAY, Optional.of("res/Cells/Stazione.png")));
		south.add(new PropertyCell((Property) deck.get(13)));
		south.add(new PropertyCell((Property) deck.get(12)));
		south.add(new Cell(28, "hera", Color.WHITE, Optional.of("res/Cells/acqua.png")));
		south.add(new PropertyCell((Property) deck.get(11)));
		south.add(new Cell(20, "Parcheggio", Color.WHITE, Optional.of("res/Cells/Parcheggio.png")));
		west.add(new PropertyCell((Property) deck.get(21)));
		west.add(new PropertyCell((Property) deck.get(20)));
		west.add(new Cell(33, "probabilità", Color.WHITE, Optional.of("res/Cells/probabilità.png")));
		west.add(new PropertyCell((Property) deck.get(19)));
		west.add(new Cell(35, "stazione O", Color.GRAY, Optional.of("res/Cells/Stazione.png")));
		west.add(new Cell(36, "Imprevisto", Color.WHITE, Optional.of("res/Cells/Imprevisto.png")));
		west.add(new PropertyCell((Property) deck.get(18)));
		west.add(new Cell(38, "Tassa", Color.WHITE, Optional.of("res/Cells/Tassa.png")));
		west.add(new PropertyCell((Property) deck.get(17)));
		
		this.setBackground(new Color(149, 255, 213));

		icon = new ImageIcon("res/logo.png");
		Image scaledImage = icon.getImage().getScaledInstance(MainExternContainer.getLeftSide().getWidth() / 2, MainExternContainer.getLeftSide().getHeight() / 5, Image.SCALE_DEFAULT);
		icon.setImage(scaledImage);
		logo.setIcon(icon);
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		logo.setVerticalAlignment(SwingConstants.CENTER);
		this.add(logo, BorderLayout.CENTER);
		}
	}

    

