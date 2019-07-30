package model.allTypeOfCard;

import java.util.Optional;

import model.player.Player;
     /**
      * 
      * interface for the  private society (water and electricity).
     * @param <X>
      *
      */
public interface Entity {
    /**
     * @param n
     * method to set name of card.
     */
  void setName(String n);
  /**
   * 
   * @return method to obtain the name of this property.
   */
  String getName();
  /**
   * 
   * @return its action that will be done.
   */
  Optional action();
}
