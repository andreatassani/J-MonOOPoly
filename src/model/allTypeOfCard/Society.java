package model.allTypeOfCard;

import model.player.PlayerImpl;
/**
 * 
 * this class implements the figure of Society (in the game this class is represented by Hera and Enel)
 *
 */
public class Society implements Entity {
    /**
     * fields
     */
    private String name;
    private PlayerImpl owner;
    private int price;
    private int toll; //costo pedaggio
    /**
     * constructor.
     * @param name
     * @param price
     * @param toll
     * @param owner
     */
    public Society(String name, int price, int toll, PlayerImpl owner) {
        this.name = name;
	this.price = price;
	this.toll = toll;
	this.owner = owner;	
    }
    /**
     * @return the name
     */
    public String getName() {
		return name;
    }
    /**
     * @param owner the owner to set
     */
    public void setOwner(PlayerImpl owner) {
		this.owner = owner;
    }
    /**
     * @return the toll
     */
    public int getToll() {
		return toll;
    }
    /**
     * 
     */
    @Override
    public boolean isSalable() {
        return false;
    }


    @Override
    public void action(PlayerImpl pl) {
    }


    @Override
    public PlayerImpl getOwner() {
        return this.owner;
    }
	

}
