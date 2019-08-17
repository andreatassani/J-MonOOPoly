package model.allTypeOfCard;

import java.awt.Color;

import javax.swing.JOptionPane;

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
    private String name;
    private int positionInBoard = 0;
    private PlayerImpl owner;
    private int price;
    private Color color;
    
    /**
     * constructor.
     * @param name
     * @param price
     * @param toll
     * @param owner
     */
    
    public Society(String name, int price, int position, PlayerImpl owner, Color color) {
        super(name, color, position, owner);	
        this.name = name;
        this.price = price;
        this.owner  = owner;
        this.positionInBoard = position;
        this.color = color;
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
    public void setOwner(PlayerImpl owner) {
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
        return false;
    }


    @Override
    public void action(PlayerImpl pl) {
        if (this.getOwner() == pl){
            return;
            } else {
                pl.setMoney(this.price/2);
                this.owner.setMoney(this.price/2);
              //Da togliere
                JOptionPane.showMessageDialog(null,"il giocatore " + pl.getName() + " ha pagato "+this.price/2 +"$ di pedaggio al giocatore "+this.owner.getName(),"messaggio", 0);
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
    
    public Color getColor() {
        return this.color;
    }
	

}
