package deck;

import player.Player;
import utility.Colors;

/** 
 *interface of properties cards.
 */
public interface DeckPropertiesCards {

    /**
     * @param n
     * method to set name of card.
     */
  void setName(String n);
   /**
    * @param o
    * method to set the player that has this property.
    */
  void setOwner(Player o);
   /**
    * @param i
    * method to set number of house built in this property (max 4 houses).
    */
  void addNhouse(int i);
   /**
    * @param y
    * method to set number of hotel built in this property (max 1 hotel after built 4 houses).
    */
  void addNhotel(int y);
   /**
    * @param c
    * method to set the color of this property.
    */
  void setColor(Colors c);
   /**
    * 
    * @return method to obtain the name of this property.
    */
   String getName();
   /**
    * 
    * @return method to obtain the player that has this property.
    */
   Player getOwner();
   /**
    * 
    * @return method to obtain the number of house built in this property.
    */
   int getNhouse();
   /**
    * 
    * @return method to obtain the number of hotel built in this property.
    */
   int getNhotel();
   /**
    * 
    * @return method to check if houses are minus of 4 in this property.
    */
   boolean checkNhouse();
   /**
    * 
    * @return method to check if hotels are minus of 1 in this property.
    */
   boolean checkNhotel();
}
