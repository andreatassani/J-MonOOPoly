package model.history;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.SwingConstants;

import model.allTypeOfCard.Entity;
import model.player.Player;
import view.play.HistoryGUI;
import view.play.MainExternContainerImpl;

public class HistoryImpl implements History {
	
	private static final int width = Toolkit.getDefaultToolkit().getScreenSize().width;
	private static final int height = Toolkit.getDefaultToolkit().getScreenSize().height;
	private static Dimension leftSideDimension = new Dimension ((int) (width / 1.45),(height));
	private static Dimension rightSideDimension = new Dimension((int) (width - leftSideDimension.getSize().width),(height/2));
	private static Dimension dim = new Dimension((int) (MainExternContainerImpl.getRightSide().getWidth()), (rightSideDimension.getSize().height/24));
	private static final Font f = new Font("Aldhabi", Font.LAYOUT_LEFT_TO_RIGHT,dim.getSize().height);


	@Override
	public void printPositionPlayer(Player player) {
		System.out.println("" + player.getName() + " � finito nella casella numero " + player.getPosition() + "");
	}

	@Override
	public void printStartGame() {
		ArrayList<JButton> fields = HistoryGUI.getHistory();
		 JButton jb = fields.get(0);
		 jb.setText("Inizio");
		 fields.set(0, jb);
		 HistoryGUI.setHistory(fields);
	}

	@Override
	public void buyPropriety(Player player, Entity entity) {
		System.out.println("" + player.getName() + " ha comprato la propriet� " + entity.getName() +"");
		
	}

	@Override
	public void startTurn(Player player) {
		System.out.println("E' il turno di " + player.getName());
		
	}
}

