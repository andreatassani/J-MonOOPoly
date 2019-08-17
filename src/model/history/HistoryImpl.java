package model.history;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import model.allTypeOfCard.Entity;
import model.player.Player;
import model.player.PlayerImpl;
import view.play.HistoryGUI;
import view.play.MainExternContainerImpl;

public class HistoryImpl implements History {
	
	private static final int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	private static final int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	private static Dimension leftSideDimension = new Dimension ((int) (width / 1.45),(height));
	private static Dimension rightSideDimension = new Dimension((int) (width - leftSideDimension.getSize().width),(height/2));
	private static Dimension dim = new Dimension((int) (MainExternContainerImpl.getRightSide().getWidth()), (rightSideDimension.getSize().height/24));
	private static final Font f = new Font("Aldhabi", Font.LAYOUT_LEFT_TO_RIGHT,dim.getSize().height);
	private static ArrayList<JButton> fields;
	private static JButton button;
	private static int position =0;
	
	private int setPosition(int position) {
	if(position < 7) return position++;
	else return 0;
	}
	@Override
	public void printPositionPlayer(Player player) {
		fields = HistoryGUI.getHistory();
		 button = fields.get(position);
		 button.setText("" + player.getName() +" Fabio ended up in the number box: " + player.getPosition());
		 fields.set(position, button);
		 HistoryGUI.setHistory(fields);
		 position=setPosition(position);
		 HistoryGUI.setPosition(position);
	}

	@Override
	public void printStartGame() {
		 fields = HistoryGUI.getHistory();
		 button = fields.get(position);
		 button.setText("The game has started! good luck to all");
		 fields.set(position, button);
		 position=setPosition(position);
		 HistoryGUI.setHistory(fields);
		 HistoryGUI.setPosition(position);
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
		 HistoryGUI.setHistory(fields);
		 HistoryGUI.setPosition(position);
		
	}
}

//JOptionPane.showMessageDialog(null,"è il turno di "+ listPl.getCurrentPlayer().getName() + " e si trova sulla casella " + deck.get(listPl.getCurrentPlayer().getPosition()).getName(),
//        "messaggio", 0);

