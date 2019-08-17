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
    private final static int START = 0;
    private final static int PRISON = 10;
    private final static int PARKING = 20;
    private final static int POLICE = 30;
    private final static int MAXPOSITION = 39;
        /**
         * constructor.
         * @param deck
         */
	public GridCell(ArrayList<Entity> deck) {
		this.setLayout(new BorderLayout());
		this.setPreferredSize(MainExternContainerImpl.getLeftSide().getPreferredSize());
		this.setMinimumSize(MainExternContainerImpl.getLeftSide().getSize());
		
		north = new Box(BoxLayout.X_AXIS);
		south = new Box(BoxLayout.X_AXIS);
		east = new Box(BoxLayout.Y_AXIS);
		west = new Box(BoxLayout.Y_AXIS);
		
		this.add(north, BorderLayout.NORTH);
		this.add(south, BorderLayout.SOUTH);
		this.add(east, BorderLayout.EAST);
		this.add(west, BorderLayout.WEST);

	
//		north.add(new CellImpl(deck.get(0)));
//		north.add(new PropertyCellImpl(deck.get(1)));
//		north.add(new CellImpl(deck.get(2)));
//		north.add(new PropertyCellImpl(deck.get(3)));
//		north.add(new CellImpl(deck.get(4)));
//		north.add(new CellImpl(deck.get(5)));
//		north.add(new PropertyCellImpl(deck.get(6)));
//		north.add(new CellImpl(deck.get(7)));
//		north.add(new PropertyCellImpl(deck.get(8)));
//		north.add(new PropertyCellImpl(deck.get(9)));
//		north.add(new CellImpl(deck.get(10)));
//		east.add(new PropertyCellImpl(deck.get(11)));
//		east.add(new CellImpl(deck.get(12)));
//		east.add(new PropertyCellImpl(deck.get(13)));
//		east.add(new PropertyCellImpl(deck.get(14)));
//		east.add(new CellImpl(deck.get(15)));
//		east.add(new PropertyCellImpl(deck.get(16)));
//		east.add(new CellImpl(deck.get(17)));
//		east.add(new PropertyCellImpl(deck.get(18)));
//		east.add(new PropertyCellImpl(deck.get(19)));
//		south.add(new CellImpl(deck.get(30)));
//		south.add(new PropertyCellImpl(deck.get(29)));
//		south.add(new CellImpl(deck.get(28)));
//		south.add(new PropertyCellImpl(deck.get(27)));
//		south.add(new PropertyCellImpl(deck.get(26)));
//		south.add(new CellImpl(deck.get(25)));
//		south.add(new PropertyCellImpl(deck.get(24)));
//		south.add(new PropertyCellImpl(deck.get(23)));
//		south.add(new CellImpl(deck.get(22)));
//		south.add(new PropertyCellImpl(deck.get(21)));
//		south.add(new CellImpl(deck.get(20)));
//		west.add(new PropertyCellImpl(deck.get(39)));
//		west.add(new PropertyCellImpl(deck.get(38)));
//		west.add(new CellImpl(deck.get(37)));
//		west.add(new PropertyCellImpl(deck.get(36)));
//		west.add(new CellImpl(deck.get(35)));
//		west.add(new CellImpl(deck.get(36)));
//		west.add(new PropertyCellImpl(deck.get(33)));
//		west.add(new CellImpl(deck.get(32)));
//		west.add(new PropertyCellImpl(deck.get(31)));
		
		
		
		for(int i=MAXPOSITION; i>=POLICE+1; i--) {
                    west.add(new CellImpl(deck.get(i)));
                }
		for(int i=POLICE; i>=PARKING; i--) {
                    south.add(new CellImpl(deck.get(i)));
                }
		for(int i = PRISON+1; i<= PARKING-1;i++) {
                    east.add(new CellImpl(deck.get(i)));
                }
		for(int i = START; i<= PRISON;i++) {
                    north.add(new CellImpl(deck.get(i)));
                }
		
		
		
		
		
		
		
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
            Image scaledImage = icon.getImage().getScaledInstance(MainExternContainerImpl.getLeftSide().getWidth() / 2, MainExternContainerImpl.getLeftSide().getHeight() / 5, Image.SCALE_DEFAULT);
            icon.setImage(scaledImage);
            logo.setIcon(icon);
            logo.setHorizontalAlignment(SwingConstants.CENTER);
            logo.setVerticalAlignment(SwingConstants.CENTER);
	}
	
}

    

