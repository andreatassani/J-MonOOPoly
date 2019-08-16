package model.allTypeOfCard;

import java.util.Optional;

import model.player.Player;
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
   * @return true if card is salable (eg: property), false else (eg: community chest or chance)
   */
  boolean isSalable();
}
