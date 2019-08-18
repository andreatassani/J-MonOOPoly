package model.history;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Optional;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import model.allTypeOfCard.Entity;
import model.allTypeOfCard.Property;
import model.player.Player;
import model.player.PlayerImpl;
import model.situation.Situation;
import model.situation.SituationImpl;
import view.play.HistoryGUI;
import view.play.MainExternContainerImpl;

public class HistoryImpl implements History {
	

	private static ArrayList<JButton> fields;
	private Optional<ArrayList<Entity>> deck;
	private Optional<String> nameCard;
	private int price;
	private int tool;
	private static JButton button;
	private static int position =0;
	private Situation situation;
	
	private static final int WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width;
	private static final int HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;
	private static Dimension leftSideDimension = new Dimension ((int) (WIDTH / 1.45),(HEIGHT));
	private static Dimension rightSideDimension = new Dimension((int) (WIDTH - leftSideDimension.getSize().width),(HEIGHT/2));
	private static Dimension dim = new Dimension((int) (MainExternContainerImpl.getRightSide().getWidth()), (rightSideDimension.getSize().height/15));
	private static final Font f = new Font("Aldhabi", Font.LAYOUT_LEFT_TO_RIGHT,(int) (dim.getSize().height/1.45));
	private static final Color j = new Color(173,238,216);
	
	public HistoryImpl (Optional<ArrayList<Entity>> deck) {
		this.deck=deck;
		this.situation = new SituationImpl();
	}
	
	private int setPosition(int pos) {
	pos++;
	return pos;
	}
	
	private void incrementButtons (ArrayList<JButton> fields) {
		final JButton but = new JButton ("");
	    but.setHorizontalAlignment(SwingConstants.LEFT);
	    but.setFont(f);
	    but.setBackground(j);
	    but.setMaximumSize(dim);
	    but.setMinimumSize(dim);
	    fields.add(but);
		HistoryGUI.setHistory(fields);
	}
	@Override
	public void printPositionPlayer(PlayerImpl player,int card) {
		fields = HistoryGUI.getHistory();
		 button = fields.get(position);
		 this.nameCard = Optional.of(deck.get().get(card).getName().toString());
		 System.out.println(this.nameCard.get());
		 if((this.nameCard.get().equals("Prison"))	||	(this.nameCard.get().equals("Parking"))) button.setText("" + player.getName() +" ended up in the space: " + nameCard.get() +". Nothing is happening!");
		 else if(this.nameCard.get().equals("Police")) button.setText(player.getName() +" will go to prison and will remain there for 2 rounds ");
		 else button.setText(player.getName() +" ended up in the space: " + nameCard.get());
		 fields.set(position, button);
		 position=setPosition(position);
		 incrementButtons(fields);
		 HistoryGUI.resetGUI();
		 situation.setPosition(player);
		 

	}

	@Override
	public void printStartGame() {
		 fields = HistoryGUI.getHistory();
		 button = fields.get(position);
		 button.setText("The game has started! Good luck to all.");
		 fields.set(position, button);
		 position=setPosition(position);
		 incrementButtons(fields);
		 HistoryGUI.resetGUI();
		

	}

	@Override
	public void buyPropriety(PlayerImpl player) {
		 fields = HistoryGUI.getHistory();
		 button = fields.get(position);
		 this.nameCard = Optional.of(deck.get().get(player.getPosition()).getName().toString());
		 this.price = ((Property)deck.get().get(player.getPosition())).getPrice();
		 button.setText("" + player.getName() +" bought the " + nameCard.get() + " propriety for " + price +"$");
		 fields.set(position, button);
		 position=setPosition(position);
		 incrementButtons(fields);
		 HistoryGUI.resetGUI();
		 situation.setMoney(player);
		 situation.setPropriety(player);
	}

	@Override
	public void startTurn(PlayerImpl player) {
		fields = HistoryGUI.getHistory();
		 button = fields.get(position);
		 button.setText(player.getName() + ", it's your turn! " );
		 fields.set(position, button);
		 position=setPosition(position);
		 incrementButtons(fields);
		 HistoryGUI.resetGUI();

		
	}
	
	public void chance (PlayerImpl player, int amount) {
		 fields = HistoryGUI.getHistory();
		 button = fields.get(position);
		 if(amount <0)button.setText("" + player.getName() +" lost " + amount +"$");
		 else button.setText("" + player.getName() +" earns " + amount +"$");
		 fields.set(position, button);
		 position=setPosition(position);
		 incrementButtons(fields);
		 HistoryGUI.resetGUI();
		 situation.setMoney(player);
	}
	
	public void lost (PlayerImpl player) {
		 fields = HistoryGUI.getHistory();
		 button = fields.get(position);
		 button.setText("" + player.getName() + " was taxed at 200$");
		 fields.set(position, button);
		 position=setPosition(position);
		 incrementButtons(fields);
		 HistoryGUI.resetGUI();
		 situation.setMoney(player);
		
		
	}
	
	public void tollHouses (PlayerImpl player,int price,int nHouses,PlayerImpl owner) {
		fields = HistoryGUI.getHistory();
		 button = fields.get(position);
		 tool= (price/10) + (nHouses*(price/4));
		 button.setText(player.getName() + " paid " + tool +"$ of tool to "+owner.getName());
		 fields.set(position, button);
		 position=setPosition(position);
		 incrementButtons(fields);
		 HistoryGUI.resetGUI();
		 situation.setMoney(player);
		 situation.setMoney(owner);
		
		
	}
	
	public void tollHotel (PlayerImpl player,int price,PlayerImpl owner) {
		fields = HistoryGUI.getHistory();
		 button = fields.get(position);
		 this.tool= (price*2);
		 button.setText(player.getName() + " paid " + tool +"$ of tool to "+owner.getName());
		 fields.set(position, button);
		 position=setPosition(position);
		 incrementButtons(fields);
		 HistoryGUI.resetGUI();
		 situation.setMoney(player);
		 situation.setMoney(owner);
	}
	
	public void buildHotel(PlayerImpl player ,int pos) {
		fields = HistoryGUI.getHistory();
		button = fields.get(position);
		this.price= ((Property)deck.get().get(pos)).getPrice()/2;
		button.setText(player.getName() + " has built a hotel on the property " + deck.get().get(pos).getName() + ", paying him: " + this.price +"$");
		fields.set(position, button);
		position=setPosition(position);
		incrementButtons(fields);
		HistoryGUI.resetGUI();
		situation.setMoney(player);
		situation.setPropriety(player);
		
		
	}

	public void buildHouse(PlayerImpl player ,int pos) {
		
		fields = HistoryGUI.getHistory();
		button = fields.get(position);
		this.price= ((Property)deck.get().get(pos)).getPrice()/4;
		button.setText(player.getName() + " has built a house on the property " + deck.get().get(pos).getName() + ", paying him: " + this.price +"$. Num of houses:" + ((Property)deck.get().get(pos)).getHouses());
		fields.set(position, button);
		position=setPosition(position);
		incrementButtons(fields);
		HistoryGUI.resetGUI();
		situation.setMoney(player);
		situation.setPropriety(player);
		
	}
	
public void sellPropriety(PlayerImpl player) {
		
		fields = HistoryGUI.getHistory();
		button = fields.get(position);
		button.setText(player.getName() + " sold the property " + deck.get().get(player.getPosition()).getName());
		fields.set(position, button);
		position=setPosition(position);
		incrementButtons(fields);
		HistoryGUI.resetGUI();
		
	}
}

//JOptionPane.showMessageDialog(null,"è il turno di "+ listPl.getCurrentPlayer().getName() + " e si trova sulla casella " + deck.get(listPl.getCurrentPlayer().getPosition()).getName(),
//        "messaggio", 0);

