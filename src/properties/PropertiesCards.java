package properties;

import java.awt.Color;

/**
 * 
 * new interface of properties cards.
 *
 */
public interface PropertiesCards {

    /**
     * @param n
     * method to set name of card.
     */
   void setName(String n);
   /**
    * @param o
    * method to set the player that has this property.
    */
   void setOwner(String o);
   /**
    * @param i
    * method to set number of house built in this property (max 4 houses).
    */
   void setNhouse(int i);
   /**
    * @param y
    * method to set number of hotel built in this property (max 1 hotel after built 4 houses).
    */
   void setNhotel(int y);
   /**
    * @param c
    * method to set the color of this property.
    */
   void setColor(Color c);
   /**
    * 
    * @return method to obtain the name of this property.
    */
   String getName();
   /**
    * 
    * @return method to obtain the player that has this property.
    */
   String getOwner();
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
}
