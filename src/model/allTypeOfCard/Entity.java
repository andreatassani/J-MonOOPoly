package model.allTypeOfCard;


import java.awt.Color;

import model.player.PlayerImpl;
     /**
      * 
      * interface for all sort of card used in the game (eg: water and electricity).
     * @param <X>
      *
      */
public interface Entity {

  /**
   * @return method to obtain the name of this property.
   */
  String getName();
  /** 
   * @return its action that will be done.
   */
  void action(PlayerImpl pl);
  /**
   * 
   * @return the owner of the card
   */
  PlayerImpl getOwner();
  /**
   * 
   * @return true if card is salable (eg: property, society), false else (eg: community chest or chance)
   */
  boolean isSalable();
  /**
   * 
   * @return true if the player can build houses/hotel on the card (property), false else (society)
   */
  boolean isBuildable();
 /**
  * 
  * @return the position on board, clockwise, starting for topLeft(Start Cell)
  */
  int getPosition();
  /*
   * 
   * @return the colour of the corresponding cell
   */
  Color getColor();
}
