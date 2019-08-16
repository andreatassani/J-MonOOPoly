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
/**
 * 
 * class that implements the view of playground.
 * 
 */
public class GridCell extends JPanel {
    /**
     * fields.
     */
    private Box north;
    private Box east;
    private Box south;
    private Box west;
    private JLabel logo;
    private ImageIcon icon;
        /**
         * constructor.
         * @param deck
         */
	public GridCell(ArrayList<Entity> deck) {
		this.setLayout(new BorderLayout());
		this.setPreferredSize(MainExternContainer.getLeftSide().getPreferredSize());
		this.setMinimumSize(MainExternContainer.getLeftSide().getSize());
		
		north = new Box(BoxLayout.X_AXIS);
		south = new Box(BoxLayout.X_AXIS);
		east = new Box(BoxLayout.Y_AXIS);
		west = new Box(BoxLayout.Y_AXIS);
		
		this.add(north, BorderLayout.NORTH);
		this.add(south, BorderLayout.SOUTH);
		this.add(east, BorderLayout.EAST);
		this.add(west, BorderLayout.WEST);

		
		north.add(new Cell(0, "Go!", Color.WHITE));
		north.add(new PropertyCell((Property) deck.get(1)));
		north.add(new Cell(2, "Chance", Color.WHITE));
		north.add(new PropertyCell((Property) deck.get(3)));
		north.add(new Cell(4, "Tax", Color.WHITE));
		north.add(new Cell(5, "Station N", Color.GRAY));
		north.add(new PropertyCell((Property) deck.get(6)));
		north.add(new Cell(7, "Chance", Color.WHITE));
		north.add(new PropertyCell((Property) deck.get(8)));
		north.add(new PropertyCell((Property) deck.get(9)));
		north.add(new Cell(10,"Prison", Color.WHITE));
		east.add(new PropertyCell((Property) deck.get(11)));
		east.add(new Cell(12, "Enel", Color.GRAY));
		east.add(new PropertyCell((Property) deck.get(13)));
		east.add(new PropertyCell((Property) deck.get(14)));
		east.add(new Cell(15, "Station E", Color.GRAY));
		east.add(new PropertyCell((Property) deck.get(16)));
		east.add(new Cell(17, "Community Chest", Color.WHITE));
		east.add(new PropertyCell((Property) deck.get(18)));
		east.add(new PropertyCell((Property) deck.get(19)));
		south.add(new Cell(30, "Police", Color.WHITE));
		south.add(new PropertyCell((Property) deck.get(29)));
		south.add(new Cell(28, "Hera", Color.GRAY));
		south.add(new PropertyCell((Property) deck.get(27)));
		south.add(new PropertyCell((Property) deck.get(26)));
		south.add(new Cell(25, "Station S", Color.GRAY));
		south.add(new PropertyCell((Property) deck.get(24)));
		south.add(new PropertyCell((Property) deck.get(23)));
		south.add(new Cell(22, "Chance", Color.WHITE));
		south.add(new PropertyCell((Property) deck.get(21)));
		south.add(new Cell(20, "Parking", Color.WHITE));
		west.add(new PropertyCell((Property) deck.get(39)));
		west.add(new PropertyCell((Property) deck.get(38)));
		west.add(new Cell(33, "Community Chest", Color.WHITE));
		west.add(new PropertyCell((Property) deck.get(36)));
		west.add(new Cell(35, "Station O", Color.GRAY));
		west.add(new Cell(36, "Community Chest", Color.WHITE));
		west.add(new PropertyCell((Property) deck.get(33)));
		west.add(new Cell(38, "Tax", Color.WHITE));
		west.add(new PropertyCell((Property) deck.get(31)));
		
		this.setBackground(new Color(149, 255, 213));                 //this custom-color is a light green for the playground
		setIcon();
		
		this.add(logo, BorderLayout.CENTER);
		}
	/**
	 * 
	 * @return the box on the north of border layout.
	 */
	public Box getNorthBox() {
	    return this.north;
	}
	/**
	 * 
	 * @return the box on the east of border layout.
	 */
	public Box getEastBox() {
            return this.east;
        }
	/**
	 * 
	 * @return the box on the south of border layout.
	 */
	public Box getSouthBox() {
            return this.south;
        }
	/**
	 * 
	 * @return the box on the west of border layout.
	 */
	public Box getWestBox() {
            return this.west;
        }
	/**
	 * this method allow to set icon of a label.
	 */
	public void setIcon() {
	    icon = new ImageIcon("res/logo.png");
	    logo = new JLabel();
            Image scaledImage = icon.getImage().getScaledInstance(MainExternContainer.getLeftSide().getWidth() / 2, MainExternContainer.getLeftSide().getHeight() / 5, Image.SCALE_DEFAULT);
            icon.setImage(scaledImage);
            logo.setIcon(icon);
            logo.setHorizontalAlignment(SwingConstants.CENTER);
            logo.setVerticalAlignment(SwingConstants.CENTER);
	}
	
}

    

