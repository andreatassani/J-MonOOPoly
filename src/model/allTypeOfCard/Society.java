package model.allTypeOfCard;

import java.awt.Color;
import java.util.Optional;

import javax.swing.JOptionPane;

import model.history.History;
import model.history.HistoryImpl;
import model.player.PlayerImpl;
/**
 * 
 * this class implements the figure of Society (in the game this class is represented by Hera and Enel)
 *
 */
public class Society  extends Property {
    /**
     * fields
     */
    private final String name;
    private final int positionInBoard;
    private PlayerImpl owner;
    private final int price;
    private final Color color;
    private final History history;
    
    /**
     * constructor.
     * @param name
     * @param price
     * @param toll
     * @param owner
     */
    
    public Society(final String name,final int price,final int position,final PlayerImpl owner,final Color color) {
        super(name, color, position, owner);	
        this.name = name;
        this.price = price;
        this.owner  = owner;
        this.positionInBoard = position;
        this.color = color;
        this.history = new HistoryImpl(Optional.empty());
    }
    
    public int getPosition() {
        return this.positionInBoard;
    }
    /**
     * @return the name
     */
    public String getName() {
		return this.name;
    }
    /**
     * @param owner the owner to set
     */
    public void setNewOwner(final PlayerImpl owner) {
		this.owner = owner;
    }
    /**
     * @return the toll
     */
    public int getToll() {
		return this.getPrice()/2;
    }
    /**
     * 
     */
    @Override
    public boolean isSalable() {
        return true;
    }
    /**
     * this method charges the player who ends up on this box to pay the toll to the owner;
     * the toll is calculated in this way: toll = (1/2)this.price
     */
    @Override
    public void action(final PlayerImpl pl) {
        if (this.getOwner() == pl){
            return;
            } else {
                pl.setMoney(-this.price/2);
                this.owner.setMoney(this.price/2);
                history.tollHouses(pl,price,6,owner);
            }
    }


    @Override
    public PlayerImpl getOwner() {
        return this.owner;
    }
    @Override
    public boolean isBuildable() {
        return false;
    }
    @Override
    public Color getColor() {
        return this.color;
    }
    @Override
    public int getPrice() {
        return this.price;
    }
	

}
