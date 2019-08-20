package model.situation;


import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;

import model.allTypeOfCard.Property;
import model.player.ListOfPlayers;
import model.player.PlayerImpl;
import view.play.SituationView;
/**
 * 
*class that implements the situation's interface.
 */
public class SituationImpl implements Situation {
	/**
	 * SituationImpl fields.
	 */		
	private	static  ListOfPlayers players;
	private static ArrayList<JPanel> flowPanels = new ArrayList<JPanel>();
	private JPanel panel;
	private JButton button;
	private static String properties;
	private int i;
	
	/**
	 * constructor of the SituationImpl.
	 */
	public SituationImpl () {
		players=SituationView.getListOfPlayers();
		properties="";
	}
	/**
	* Set the player's money within the GUI.
	* @param pl
	*
	*/
	public void setMoney(PlayerImpl pl) {
		flowPanels=SituationView.getSituation();
		panel=flowPanels.get(players.getIndexFromPlayer(pl));
		button=(JButton) panel.getComponent(1);
		button.setText(""+pl.getMoney());
		SituationView.setSituation(flowPanels);
		}
	/**
	* Set the player's position within the GUI.
	* @param pl
	*
	*/
	public void setPosition(PlayerImpl pl) {
		flowPanels=SituationView.getSituation();
		panel=flowPanels.get(players.getIndexFromPlayer(pl));
		button=(JButton) panel.getComponent(3);
		button.setText("Position: "+pl.getPosition());
		SituationView.setSituation(flowPanels);
		}
	/**
	* Set the properties of the player within the GUI.
	* @param pl
	*
	*/
	public void setPropriety(PlayerImpl pl) {
		flowPanels=SituationView.getSituation();
		panel=flowPanels.get(players.getIndexFromPlayer(pl));
		button=(JButton) panel.getComponent(2);
		button.setText("Propriety: "+pl.getListOfProperties().size());
		properties="";
			for(Property prop : pl.getListOfProperties()) 
			properties = ( properties + " " + prop.getName() + " number of houses: "+ prop.getHouses() + ". Hotel is present: " +prop.getHotel()+"\n");
		SituationView.setSituation(flowPanels);
		}
	/**
	* Deactivate the player's buttons.
	* @param pl
	*
	*/
	public void lose(PlayerImpl pl) {
		flowPanels=SituationView.getSituation();
		panel=flowPanels.get(players.getIndexFromPlayer(pl));
		for(i=0;i<panel.getComponentCount();i++) {
		button=(JButton) panel.getComponent(i);
		button.setEnabled(false);
		}
		SituationView.setSituation(flowPanels);
		}
	/**
	 * Static method that returns a string with the properties of a player inside.
	 */
	public static String getProperties() {
		return properties;
	}

}
	
	


