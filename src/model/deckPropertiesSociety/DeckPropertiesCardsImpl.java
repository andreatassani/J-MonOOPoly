package model.propertiesDeck;


//      LEGGI I COMMENTI CHE TI HO SCRITTO SOTTO POPI CANCELLA TUTTI I COMMENTI DI QUESTO TIPO
import model.player.Player;
import model.utility.Colors;

/**
 * {@inheritDoc}.
 */

public class DeckPropertiesCardsImpl extends PrivateSocietyImpl {

   private String name;
   private Player owner;
   private int nHouse;
   private int nHotel;
   @SuppressWarnings("unused")
   private Colors color;
   /**
    * @param c
    * @param n
    * constructor for this class.
    */
   public DeckPropertiesCardsImpl(final String n, final Colors c) {
       this.name = n;
       this.owner = null;
       this.nHouse = 0;
       this.nHotel = 0;
       this.color = c;
   }
   
   //   TO-DO PER MICHELEEEEEEEEEEE
   //   come detto all'ultimo meeting, la carta proprietà estende società privata.
   //   perciò come da definizione di extends, la classe carta proprietà eredita tutti i metodi che ho già implementato 
   //   in società privata, DOVRESTI SOLO CREARE QUELLI CHE SERVONO A TE PER LA GESTIONE DELLA COMPRAVENDITA E COSTRUZIONE HOTEL
}

