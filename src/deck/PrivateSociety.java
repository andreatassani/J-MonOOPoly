package deck;

import player.Player;
     /**
      * 
      * interface for the  private society (water and electricity).
      *
      */
public interface PrivateSociety {
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
   * method to set the value of this card.
   */
  void setValue(int i);
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
   * @return method to obtain the value of this society
   */
  int getValue();

}
