package model.allTypeOfCard;

import java.util.Optional;

import model.utility.Colors;

public class Society<X> implements Entity {
	

	   private String name;
	   private X owner;
	   private int toll; //costo pedaggio
	   
	   public Society(String name, X owner, int toll) {
		this.name = name;
		this.owner = owner;
		this.toll = toll;
	}

	   
	@Override
	public Optional action() {
		// TODO Auto-generated method stub
		return Optional.of(this.toll);
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
	public void setOwner(X owner) {
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
    public String getOwner() {
        return "Bank";
    }


    @Override
    public boolean isSalable() {
        return false;
    }
	

}
