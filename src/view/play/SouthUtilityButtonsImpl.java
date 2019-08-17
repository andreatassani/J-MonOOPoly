package view.play;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Optional;

import javax.swing.JButton;
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
import model.history.History;
import model.history.HistoryImpl;
import model.player.ListOfPlayers;
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
		
		history = new HistoryImpl(Optional.of(deck));
		rollDice = new JButton("ROLL DICE");
		sell = new JButton("SELL");
		buy = new JButton("BUY");
		menu = new JButton("BACK TO MENU'");
		build = new JButton("BUILD");
		nextPlayer = new JButton("NEXT PLAYER");
		sound = new AudioManager();
		
		setBackgroundOfAllButtons();
		setEnableFalseAsDefault();
		
		
		rollDice.addActionListener(new RollDice(listPl, grid, deck, rollDice, buy, sell, build, nextPlayer, sound, history));
        buy.addActionListener(new Buy(listPl, deck, buy, sell, build, sound, grid,history));
		nextPlayer.addActionListener(new NextPlayer(listPl, rollDice, buy, sell, build, nextPlayer,history));
		sell.addActionListener(new Sell(listPl, deck, buy, sell, build, sound));
		build.addActionListener(new Build(listPl, deck, build, sound, grid,history));
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
