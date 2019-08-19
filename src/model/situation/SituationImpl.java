package model.situation;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Optional;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import model.allTypeOfCard.Entity;
import model.allTypeOfCard.Property;
import model.player.ListOfPlayers;
import model.player.PlayerImpl;
import view.play.SituationGUI;

public class SituationImpl implements Situation {
	
	private	static  ListOfPlayers players;
	
	
	private static ArrayList<JPanel> flowPanels = new ArrayList<JPanel>();
	private JPanel panel;
	private JButton button;
	private String properties;
	
	
	
	public SituationImpl () {
		players=SituationGUI.getListOfPlayers();
	}
	
	
	public void setMoney(PlayerImpl pl) {
		flowPanels=SituationGUI.getSituation();
		panel=flowPanels.get(players.getIndexFromPlayer(pl));
		button=(JButton) panel.getComponent(1);
		button.setText(""+pl.getMoney());
		SituationGUI.setSituation(flowPanels);
		}
	public void setPosition(PlayerImpl pl) {
		flowPanels=SituationGUI.getSituation();
		panel=flowPanels.get(players.getIndexFromPlayer(pl));
		button=(JButton) panel.getComponent(3);
		button.setText("Position: "+pl.getPosition());
		SituationGUI.setSituation(flowPanels);
		}
	public void setPropriety(PlayerImpl pl) {
		flowPanels=SituationGUI.getSituation();
		panel=flowPanels.get(players.getIndexFromPlayer(pl));
		button=(JButton) panel.getComponent(2);
		button.setText("Propriety: "+pl.getListOfProperties().size());
		properties = " ";
		for(Property prop : pl.getListOfProperties()) {
			properties = ( properties + " "+ prop.getName() + " number of houses: "+ prop.getHouses() + ". Hotel is present: " +prop.getHotel()+"\n");
		}
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
					
				JOptionPane.showMessageDialog(null," "+ properties,"messaggio", 0);
				
			}
		});
		SituationGUI.setSituation(flowPanels);
		}

}
	
	


