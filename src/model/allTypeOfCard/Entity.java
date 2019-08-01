package model.allTypeOfCard;

import java.util.Optional;

import model.player.Player;
     /**
      * 
      * interface for all sort of card used in the game (eg: water and electricity).
     * @param <X>
      *
      */
public interface Entity {
    //XTasso: ho semplicemente silenziato il metodo "setName", ne parliamo poi a voce :-)
//    /**
//     * @param n
//     * method to set name of card.
//     */
//  void setName(String n);
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
