package view.play;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import model.allTypeOfCard.Entity;
/**
 * 
 * class that implements the view of playground.
 * 
 */
public class GridCell extends JPanel {
    /**
     * fields.
     */
    private static final long serialVersionUID = 1L;
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
		
		icon = new ImageIcon("res/menuIcon/logo.png");
	        logo = new JLabel();
	        Image scaledImage = icon.getImage().getScaledInstance(MainExternContainerImpl.getLeftSide().getWidth() / 2, MainExternContainerImpl.getLeftSide().getHeight() / 5, Image.SCALE_DEFAULT);
	        icon.setImage(scaledImage);
	        logo.setIcon(icon);
	        logo.setHorizontalAlignment(SwingConstants.CENTER);
	        logo.setVerticalAlignment(SwingConstants.CENTER);
		
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
}

    

