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
import model.player.Player;
import model.player.PlayerImpl;
import view.play.HistoryGUI;
import view.play.MainExternContainerImpl;

public class HistoryImpl implements History {
	

	private static ArrayList<JButton> fields;
	private Optional<ArrayList<Entity>> deck;
	private Optional<String> nameCard;
	private static JButton button;
	private static int position =0;
	
	private static final int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	private static final int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	private static Dimension leftSideDimension = new Dimension ((int) (width / 1.45),(height));
	private static Dimension rightSideDimension = new Dimension((int) (width - leftSideDimension.getSize().width),(height/2));
	private static Dimension dim = new Dimension((int) (MainExternContainerImpl.getRightSide().getWidth()), (rightSideDimension.getSize().height/15));
	private static final Font f = new Font("Aldhabi", Font.LAYOUT_LEFT_TO_RIGHT,(int) (dim.getSize().height/1.45));
	private static final Color j = new Color(173,238,216);
	
	public HistoryImpl (Optional<ArrayList<Entity>> deck) {
		this.deck=deck;
	}
	
	private int setPosition(int pos) {
	pos++;
	return pos;
	}
	
	private void incrementButtons (ArrayList<JButton> fields) {
		int i,y=fields.size();
		for(i=0;i<y;i++) {
			final JButton but = new JButton ("" +i);
	    but.setHorizontalAlignment(SwingConstants.LEFT);
	    but.setFont(f);
	    but.setBackground(j);
	    but.setMaximumSize(dim);
	    but.setMinimumSize(dim);
	    fields.add(but);
		}
		HistoryGUI.setHistory(fields);
		
	}
	@Override
	public void printPositionPlayer(Player player, int card) {
		fields = HistoryGUI.getHistory();
		 button = fields.get(position);
		 nameCard = Optional.of(deck.get().get(card).getName().toString());
		 button.setText("" + player.getName() +" ended up in the box: " + nameCard.get());
		 fields.set(position, button);
		 HistoryGUI.setHistory(fields);
		 position=setPosition(position);

	}

	@Override
	public void printStartGame() {
		 fields = HistoryGUI.getHistory();
		 button = fields.get(position);
		 button.setText("The game has started! good luck to all");
		 fields.set(position, button);
		 position=setPosition(position);
		 HistoryGUI.setHistory(fields);

	}

	@Override
	public void buyPropriety(Player player, Entity entity) {
		System.out.println("" + player.getName() + " ha comprato la propriet� " + entity.getName() +"");
		
	}

	@Override
	public void startTurn(PlayerImpl player) {
		fields = HistoryGUI.getHistory();
		 button = fields.get(position);
		 button.setText("Is the turn of: " + player.getName());
		 fields.set(position, button);
		 position=setPosition(position);
		 incrementButtons(fields);
		 HistoryGUI.resetGUI();

		
	}
}

//JOptionPane.showMessageDialog(null,"è il turno di "+ listPl.getCurrentPlayer().getName() + " e si trova sulla casella " + deck.get(listPl.getCurrentPlayer().getPosition()).getName(),
//        "messaggio", 0);

