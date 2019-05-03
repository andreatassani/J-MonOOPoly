package player;

import utility.Colors;
import utility.Pawns;

/*
*
* 
*
*/
public interface Player {
  /**
   * pawn creation
   * @return
   */
 public Pawns getPawn(); 
 
 public void setPawns(Pawns pawns);
 
 // player color
 public Colors getColors();   
 
 public void setColor(Colors color);
 
 // player name
 public  String getName(); 
 
 public void setName(String name);
 
}
