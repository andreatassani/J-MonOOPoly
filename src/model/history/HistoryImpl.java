package model.history;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Optional;

import javax.swing.JButton;
import javax.swing.SwingConstants;

import model.allTypeOfCard.Entity;
import model.allTypeOfCard.Property;
import model.player.PlayerImpl;
import model.situation.Situation;
import model.situation.SituationImpl;
import view.play.HistoryView;
import view.play.SituationView;
/**
 * 
*class that implements the history's interface.
 */
public class HistoryImpl implements History {
/**
 * HistoryImpl fields.
 */	
	private static ArrayList<JButton> fields;
	private Optional<ArrayList<Entity>> deck;
	private Optional<String> nameCard;
	private int price;
	private int tool;
	private static JButton button;
	private static int position = 0;
	private Situation situation;
	private static final Font F = new Font("Aldhabi", Font.LAYOUT_LEFT_TO_RIGHT,(int) (HistoryView.getDim().getSize().height/1.45));
/**
 * constructor of the HistoryImpl.
 */
	public HistoryImpl (Optional<ArrayList<Entity>> deck) {
		this.deck = deck;
		this.situation = new SituationImpl();
	}
	/**
	 * Increase the position.
	 * @param pos is the position
	 */	
	private int setPosition(int pos) {
		pos++;
		return pos;
	}
	/**
	 * Add buttons to the array list of buttons of the historyView
	 *   @param fields is the input list of buttons
	 */	
	private void incrementButtons (ArrayList<JButton> fields) {
		final JButton but = new JButton ("");
	    but.setHorizontalAlignment(SwingConstants.LEFT);
	    but.setFont(F);
	    but.setBackground(HistoryView.getColor());
	    but.setMaximumSize(HistoryView.getDim());
	    but.setMinimumSize(HistoryView.getDim());
	    fields.add(but);
		HistoryView.setHistory(fields);
	}
	/**
	 * Print the position of the player in the historyView.
	 *   @param player is the subject of the history
	 *   @param card is the index of the card inside the deck
	 */
	public void printPositionPlayer(PlayerImpl player,int card) {
		fields = HistoryView.getHistory();
		 button = fields.get(position);
		 this.nameCard = Optional.of(deck.get().get(card).getName().toString());
		 if((this.nameCard.get().equals("Prison"))	||	(this.nameCard.get().equals("Parking"))) button.setText("" + player.getName() +" ended up in the space: " + nameCard.get() +". Nothing is happening!");
		 else if(this.nameCard.get().equals("Police")) button.setText(player.getName() +" will go to prison and will remain there for 2 rounds ");
		 else button.setText(player.getName() +" ended up on the space: " +   nameCard.get() );
		 fields.set(position, button);
		 position=setPosition(position);
		 incrementButtons(fields);
		 HistoryView.resetGUI();
		 situation.setPosition(player);
		 }

	/**
	 * Print the start of the game in the historyView.
	 * 
	 */
	public void printStartGame() {
		 fields = HistoryView.getHistory();
		 button = fields.get(position);
		 button.setText("The game has started! Good luck to all.");
		 fields.set(position, button);
		 position=setPosition(position);
		 incrementButtons(fields);
		 HistoryView.resetGUI();
	}
	/**
	 * Print a message if a player passes by the start.
	 * @param player is the subject of the history
	 */
	public void start(PlayerImpl player) {
		 fields = HistoryView.getHistory();
		 button = fields.get(position);
		 button.setText(player.getName() + " has passed from the start! He will recive a bonus of 200$");
		 fields.set(position, button);
		 position=setPosition(position);
		 incrementButtons(fields);
		 HistoryView.resetGUI();
		 situation.setMoney(player);
	}
	/**
	 * Print a message if a player buy a property.
	 * @param player is the subject of the history
	 */
	public void buyPropriety(PlayerImpl player) {
		 fields = HistoryView.getHistory();
		 button = fields.get(position);
		 this.nameCard = Optional.of(deck.get().get(player.getPosition()).getName().toString());
		 this.price = ((Property)deck.get().get(player.getPosition())).getPrice();
		 button.setText("" + player.getName() +" bought the " + nameCard.get() + " property for " + price +"$");
		 fields.set(position, button);
		 position=setPosition(position);
		 incrementButtons(fields);
		 HistoryView.resetGUI();
		 situation.setMoney(player);
		 situation.setPropriety(player);
		
		 
	
	}
	/**
	 * 
	 * Print a message at the beginning of the turn.
	 * @param player is the subject of history message.
	 */
	public void startTurn(PlayerImpl player) {
		HistoryView.resetColor(player);
		SituationView.resetColor(player);
		fields = HistoryView.getHistory();
		 button = fields.get(position);
		 button.setText(player.getName() + ", it's your turn! " );
		 fields.set(position, button);
		 position=setPosition(position);
		 incrementButtons(fields);
		 HistoryView.resetGUI();
		 

		
	}
	/**
	 * 
	 * print a chance message if you ended up into chance position.
	 * chance can give you or take away money.
	 * @param player is the subject of history message.
	 * @param amount is the quantity of money to give/take away .
	 */
	public void chance (PlayerImpl player, int amount) {
		 fields = HistoryView.getHistory();
		 button = fields.get(position);
		 if(amount <0)button.setText("" + player.getName()+ " drawn the card: Lose " + -amount +"$");
		 else button.setText("" + player.getName() +" drawn the card: Gain " + amount +"$");
		 fields.set(position, button);
		 position=setPosition(position);
		 incrementButtons(fields);
		 HistoryView.resetGUI();
		 situation.setMoney(player);
	}
	/**
	* 
	* print a message if you ended up into tax position.
	* @param player is the subject of history message.
	*/
	public void lost (PlayerImpl player) {
		 fields = HistoryView.getHistory();
		 button = fields.get(position);
		 button.setText("" + player.getName() + " was taxed at 200$");
		 fields.set(position, button);
		 position=setPosition(position);
		 incrementButtons(fields);
		 HistoryView.resetGUI();
		 situation.setMoney(player);
	}
	/**
	* 
	*print a message if you ended up into other player's property.
	* @param player is the subject of history message.
	* @param price is used to calculate the total amount of tool.
	* @param nHouses is used to calculate the total amount of tool.
	* @param owner is the other subject of history message.
	* 
	*/
	
	public void tollHouses (PlayerImpl player,int price,int nHouses,PlayerImpl owner) {
		fields = HistoryView.getHistory();
		 button = fields.get(position);
		 tool= (price/10) + (nHouses*(price/4));
		 button.setText(player.getName() + " paid " + tool +"$ of toll to "+owner.getName());
		 fields.set(position, button);
		 position=setPosition(position);
		 incrementButtons(fields);
		 HistoryView.resetGUI();
		 situation.setMoney(player);
		 situation.setMoney(owner);
		 situation.setPropriety(player);
		 situation.setPropriety(owner);
		}
	/**
	* 
	*print a message if you ended up into other player's property.
	* @param player is the subject of history message.
	* @param price is used to calculate the total amount of tool.
	* @param nHouses is used to calculate the total amount of tool.
	* @param owner is the other subject of history message.
	* 
	*/
	public void tollHotel (PlayerImpl player,int price,PlayerImpl owner) {
		fields = HistoryView.getHistory();
		 button = fields.get(position);
		 this.tool= (price*2);
		 button.setText(player.getName() + " paid " + tool +"$ of toll to "+owner.getName());
		 fields.set(position, button);
		 position=setPosition(position);
		 incrementButtons(fields);
		 HistoryView.resetGUI();
		 situation.setMoney(player);
		 situation.setMoney(owner);
		 situation.setPropriety(player);
		 situation.setPropriety(owner);
	}
	/**
	* 
	* print a message if you build an hotel.
	* @param player is the subject of history message.
	* @param pos is position of the hotel.
	*/
	public void buildHotel(PlayerImpl player ,int pos) {
		fields = HistoryView.getHistory();
		button = fields.get(position);
		this.price= ((Property)deck.get().get(pos)).getPrice()/2;
		button.setText(player.getName() + " has built a hotel on the property " + deck.get().get(pos).getName() + ", paying him: " + this.price +"$");
		fields.set(position, button);
		position=setPosition(position);
		incrementButtons(fields);
		HistoryView.resetGUI();
		situation.setMoney(player);
		situation.setPropriety(player);
		
		
		
	}
	/**
	* 
	* print a message if you build an house.
	* @param player is the subject of history message.
	* @param pos is position of the house.
	*/
	public void buildHouse(PlayerImpl player ,int pos) {
		
		fields = HistoryView.getHistory();
		button = fields.get(position);
		this.price= ((Property)deck.get().get(pos)).getPrice()/4;
		button.setText(player.getName() + " has built a house on the property " + deck.get().get(pos).getName() + ", paying him: " + this.price +"$. Num of houses:" + ((Property)deck.get().get(pos)).getHouses());
		fields.set(position, button);
		position=setPosition(position);
		incrementButtons(fields);
		HistoryView.resetGUI();
		situation.setMoney(player);
		situation.setPropriety(player);
		
	}
	/**
	* 
	* print a message if you sell a property.
	* @param player is the subject of history message.
	* 
	*/
	public void sellPropriety(PlayerImpl player) {
		
		fields = HistoryView.getHistory();
		button = fields.get(position);
		button.setText(player.getName() + " sold the property " + deck.get().get(player.getPosition()).getName());
		fields.set(position, button);
		position=setPosition(position);
		incrementButtons(fields);
		HistoryView.resetGUI();
		situation.setMoney(player);
		situation.setPropriety(player);
		
	}
	/**
	* 
	* print a message if a player ended up into police position.
	* @param player is the subject of history message.
	* @param turn is the number of turn you have to stay in prison.
	* 
	*/
	public void stop(PlayerImpl player,int turn) {
	
	fields = HistoryView.getHistory();
	 button = fields.get(position);
	 button.setText(player.getName() + " cannot continue because he is in prison. Rounds left: " +turn);
	 fields.set(position, button);
	 position=setPosition(position);
	 incrementButtons(fields);
	 HistoryView.resetGUI();
	
	
	}
	/**
	* 
	* print a message if a player can go out to the prison.
	* @param player is the subject of history message.
	* 
	*/
	public void endStop(PlayerImpl player) {
	
	fields = HistoryView.getHistory();
	 button = fields.get(position);
	 button.setText(player.getName() + " can get out of prison!");
	 fields.set(position, button);
	 position=setPosition(position);
	 incrementButtons(fields);
	 HistoryView.resetGUI();
	}
	/**
	* 
	* print a message when a player loses.
	* @param player is the subject of history message.
	* 
	*/
	public void losePlayer(PlayerImpl player) {
		 fields = HistoryView.getHistory();
		 button = fields.get(position);
		 button.setText(player.getName() + " has finished playing for this game");
		 fields.set(position, button);
		 position=setPosition(position);
		 incrementButtons(fields);
		 HistoryView.resetGUI();
		 situation.setMoney(player);
		 situation.lose(player);
	}
}


