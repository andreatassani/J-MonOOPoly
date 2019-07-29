package model.menu;

import java.util.List;
import model.player.Player;
/**
 * Interface for player configuration.
 * 
 *
 */
public interface SettingPlayer {
/**
* creation of the list of players.
* @return a list of players.
* 
*/
List<Player> getPlayer();
/**
* 
* @param players
* the list of players is set.
*/
void setListPlayer(List<Player> players);

}
