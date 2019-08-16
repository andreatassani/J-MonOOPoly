package view.play;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import controller.actionListeners.Build;
import controller.actionListeners.Buy;
import controller.actionListeners.NextPlayer;
import controller.actionListeners.RollDice;
import controller.actionListeners.Sell;
import controller.audio.AudioManager;
import model.allTypeOfCard.Entity;
import model.allTypeOfCard.EntityDeck;
import model.allTypeOfCard.Property;
import model.history.History;
import model.history.HistoryImpl;
import model.images.ShowImages;
import model.player.ListOfPlayers;
import model.player.Player;
import model.utility.Pawns;

public class SouthUtilityButtons extends JPanel {
	
	public SouthUtilityButtons(ListOfPlayers listPl, ArrayList<Entity> deck, GridCell grid) {
	    
		this.setLayout(new GridLayout());
		History history = new HistoryImpl();
				
		
		JButton rollDice = new JButton("ROLL DICE");
		JButton sell = new JButton("SELL");
		JButton buy = new JButton("BUY");
		JButton menu = new JButton("MENU");
		JButton build = new JButton("BUILD");
		JButton nextPlayer = new JButton("NEXT PLAYER");
		
		rollDice.setBackground(Color.lightGray);
		sell.setBackground(Color.lightGray);
		buy.setBackground(Color.lightGray);
		menu.setBackground(Color.lightGray);
		build.setBackground(Color.lightGray);
		nextPlayer.setBackground(Color.lightGray);
		
		buy.setEnabled(false);
		sell.setEnabled(false);
		build.setEnabled(false);
		nextPlayer.setEnabled(false);
		
		
		this.add(rollDice);
		this.add(buy);
		this.add(sell);
		this.add(build);
		this.add(nextPlayer);
		this.add(menu);
		
		AudioManager sound = new AudioManager();
	            
                rollDice.addActionListener(new RollDice(listPl, grid, deck, rollDice, buy, sell, build, nextPlayer, sound));
                buy.addActionListener(new Buy(listPl, deck, buy, sell, build, sound));
		nextPlayer.addActionListener(new NextPlayer(listPl, deck, rollDice, buy, sell, build, nextPlayer));
		sell.addActionListener(new Sell(listPl, deck, buy, sell, build, sound));
		build.addActionListener(new Build(listPl, deck, build, sound));
		
		this.setBorder(new LineBorder(Color.BLACK));
	}

}
