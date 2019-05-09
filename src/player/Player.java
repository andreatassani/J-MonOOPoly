package player;

import utility.Colors;
import utility.Pawns;

/**
 * Interface for player creation management
 * 
 *
 */

public interface Player {
/**
 * Pawn creation
 * @return
 */
	
	public Pawns getPawn(); 
/**
 * Pawns setting
 * @param pawns
 */
 
	public void setPawns(Pawns pawns);
 /**
  * Color creation
  * @return
  */
 
	public Colors getColors();   
 /**
  * Colors setting
  * @param color
  */
 
	public void setColor(Colors color);
 /**
  * Name creation
  * @return
  */
 
	public  String getName(); 
 /**
  * Name setting
  * @param name
  */
 
	public void setName(String name);
 
}
