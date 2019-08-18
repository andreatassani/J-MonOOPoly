package model.situation;

import model.player.PlayerImpl;

public interface Situation {
	
	void setPosition(PlayerImpl pl);
	
	void setMoney(PlayerImpl pl);
	
	void setPropriety(PlayerImpl pl);
	
	
}
