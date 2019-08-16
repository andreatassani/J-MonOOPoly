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

import controller.actionListeners.BackToMenu;
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
import model.myEnum.Pawns;
import model.player.ListOfPlayers;
import model.player.Player;
/**
 * 
 * implementation of SouthUtilityButtons.
 *
 */
public class SouthUtilityButtonsImpl extends JPanel implements SouthUtilityButtons {
        /**
         * fields.
         */
        private History history;
        private JButton rollDice;
        private JButton sell;
        private JButton buy;
        private JButton menu;
        private JButton build;
        private JButton nextPlayer;
        private AudioManager sound;
	/**
	 * constructor.
	 * @param listPl
	 * @param deck
	 * @param grid
	 */
         public SouthUtilityButtonsImpl(ListOfPlayers listPl, ArrayList<Entity> deck, GridCell grid, MainExternContainerImpl frame) {
	    
		this.setLayout(new GridLayout());
		
		history = new HistoryImpl();
		rollDice = new JButton("ROLL DICE");
		sell = new JButton("SELL");
		buy = new JButton("BUY");
		menu = new JButton("BACK TO MENU'");
		build = new JButton("BUILD");
		nextPlayer = new JButton("NEXT PLAYER");
		sound = new AudioManager();
		
		setBackgroundOfAllButtons();
		setEnableFalseAsDefault();
		
		
		rollDice.addActionListener(new RollDice(listPl, grid, deck, rollDice, buy, sell, build, nextPlayer, sound));
                buy.addActionListener(new Buy(listPl, deck, buy, sell, build, sound, grid));
		nextPlayer.addActionListener(new NextPlayer(listPl, deck, rollDice, buy, sell, build, nextPlayer));
		sell.addActionListener(new Sell(listPl, deck, buy, sell, build, sound));
		build.addActionListener(new Build(listPl, deck, build, sound, grid));
		menu.addActionListener(new BackToMenu(frame));
		
		this.add(rollDice);
		this.add(buy);
		this.add(sell);
		this.add(build);
		this.add(nextPlayer);
		this.add(menu);
		this.setBorder(new LineBorder(Color.BLACK));
	}
    /**
     * {@inheritDoc}
     */
    public void setBackgroundOfAllButtons() {
        rollDice.setBackground(Color.lightGray);
        sell.setBackground(Color.lightGray);
        buy.setBackground(Color.lightGray);
        menu.setBackground(Color.lightGray);
        build.setBackground(Color.lightGray);
        nextPlayer.setBackground(Color.lightGray);
    }
    /**
     * {@inheritDoc}
     */
    public void setEnableFalseAsDefault() {
        buy.setEnabled(false);
        sell.setEnabled(false);
        build.setEnabled(false);
        nextPlayer.setEnabled(false);
    }
    
}
