package model.menu;

import java.util.ArrayList;
import java.util.List;
import model.player.Player;
/**
 * 
 * a class that creates a list of players.
 *
 */
	public class SettingPlayerImpl implements SettingPlayer {
/**
 * SettingPlayerImpl fields.
 */
		private Integer numPlayer;
		private List<Player> players;
/**
 * constructor of settingPlayerImpl.
 * @param numPlayer number of competitors
 * 
 * 
 */
		public SettingPlayerImpl(final int numPlayer) {
			this.numPlayer = numPlayer;
			this.players = new ArrayList<>();

}
/**
* {@inheritDoc}
* 
*/
		public List<Player> getPlayer() {
			return players;
}
/**
* {@inheritDoc}
* 
*/
		public void setListPlayer(final List<Player> players) {
			for (int i = 0; i <= numPlayer; i++) {
				players.add(players.get(i));
}

} 

}
