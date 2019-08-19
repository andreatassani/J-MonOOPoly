package model.situation;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Optional;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import model.allTypeOfCard.Entity;
import model.allTypeOfCard.Property;
import model.player.ListOfPlayers;
import model.player.PlayerImpl;
import view.play.SituationView;

public class SituationImpl implements Situation {
	
	private	static  ListOfPlayers players;
	
	
	private static ArrayList<JPanel> flowPanels = new ArrayList<JPanel>();
	private JPanel panel;
	private JButton button;
	private static String properties;
	
	
	
	
	public SituationImpl () {
		players=SituationView.getListOfPlayers();
		properties="";
	}

	public static String getProperties() {
		return properties;
	}
	
	 
		
	
	
	
	public void setMoney(PlayerImpl pl) {
		flowPanels=SituationView.getSituation();
		panel=flowPanels.get(players.getIndexFromPlayer(pl));
		button=(JButton) panel.getComponent(1);
		button.setText(""+pl.getMoney());
		SituationView.setSituation(flowPanels);
		}
	public void setPosition(PlayerImpl pl) {
		flowPanels=SituationView.getSituation();
		panel=flowPanels.get(players.getIndexFromPlayer(pl));
		button=(JButton) panel.getComponent(3);
		button.setText("Position: "+pl.getPosition());
		SituationView.setSituation(flowPanels);
		}
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

}
	
	


