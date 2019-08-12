package model.allTypeOfCard;

import java.util.Optional;

import model.player.PlayerImpl;
import model.utility.Colors;

public class Society implements Entity {
	

	   private String name;
	   private PlayerImpl owner;
	   private int toll; //costo pedaggio
	   
	   public Society(String name, int toll, PlayerImpl owner) {
		this.name = name;
		this.owner = owner;
		this.toll = toll;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @param toll the toll to set
	 */
	public void setToll(int toll) {
		this.toll = toll;
	}


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
