package model.allTypeOfCard;


import java.util.Optional;

//      LEGGI I COMMENTI CHE TI HO SCRITTO SOTTO POPI CANCELLA TUTTI I COMMENTI DI QUESTO TIPO
import model.player.Player;
import model.utility.Colors;

/**
 * {@inheritDoc}.
 * @param <X>
 * @param <X>
 */

public class Property<X> extends Society {

   private Colors color;
   private int toll0House; //costo pedaggio con n edifici
   private int toll1House;
   private int toll2House;
   private int toll3House;
   private int toll4House;
   private int toll1Hotel;
   /**
    * 
    * 
    * constructor for this class.
    */
   public Property(final String name, X owner, Colors color, int toll0House, int toll1House,
			int toll2House, int toll3House, int toll4House, int toll1Hotel) {
	   	super(name, owner, toll0House);
	   	this.color = color;
		this.toll1House = toll1House;
		this.toll2House = toll2House;
		this.toll3House = toll3House;
		this.toll4House = toll4House;
		this.toll1Hotel = toll1Hotel;
	}
   
   /**
    * @return the color
    */
   public Colors getColor() {
	return color;
   }
   /**
    * @param color the color to set
    */
   public void setColor(Colors color) {
	this.color = color;
   }
   /**
    * @return the toll1House
    */
   public int getToll1House() {
	return toll1House;
   }
   /**
    * @param toll1House the toll1House to set
    */
   public void setToll1House(int toll1House) {
	this.toll1House = toll1House;
   }
   /**
    * @return the toll2House
    */
   public int getToll2House() {
	return toll2House;
   }
   /**
    * @param toll2House the toll2House to set
    */
   public void setToll2House(int toll2House) {
	this.toll2House = toll2House;
   }
   /**
    * @return the toll3House
    */
   public int getToll3House() {
	return toll3House;
   }
   /**
    * @param toll3House the toll3House to set
    */
   public void setToll3House(int toll3House) {
	this.toll3House = toll3House;
   }
   /**
    * @return the toll4House
    */
   public int getToll4House() {
	return toll4House;
   }
   /**
    * @param toll4House the toll4House to set
    */
   public void setToll4House(int toll4House) {
	this.toll4House = toll4House;
   }
   /**
    * @return the toll1Hotel
    */
   public int getToll1Hotel() {
	return toll1Hotel;
   }
   /**
    * @param toll1Hotel the toll1Hotel to set
    */
   public void setToll1Hotel(int toll1Hotel) {
	this.toll1Hotel = toll1Hotel;
   }
   
   public Optional action() {
	return Optional.empty();
   }

}
   //   TO-DO PER MICHELEEEEEEEEEEE
   //   come detto all'ultimo meeting, la carta proprietà estende società privata.
   //   perciò come da definizione di extends, la classe carta proprietà eredita tutti i metodi che ho già implementato 
   //   in società privata, DOVRESTI SOLO CREARE QUI QUELLI CHE SERVONO A TE PER LA GESTIONE DELLA COMPRAVENDITA E COSTRUZIONE HOTEL


