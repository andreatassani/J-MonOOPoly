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
import model.customComponent.CustomMethodsImpl;
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
    private static final long serialVersionUID = 1L;
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
     * @param listPl list of players.
     * @param deck group of all cards.
     * @param grid playground.
     * @param main is the container.
     */
    public SouthUtilityButtonsImpl(final ListOfPlayers listPl, final ArrayList<Entity> deck, final GridCell grid, final MainExternContainerImpl main) {
                this.setLayout(new GridLayout());
                history = new HistoryImpl(Optional.of(deck));
                rollDice = new JButton("ROLL DICE");
                sell = new JButton("SELL");
                buy = new JButton("BUY");
                menu = new JButton("GAME OVER");
                build = new JButton("BUILD");
                nextPlayer = new JButton("NEXT PLAYER");
                sound = new AudioManager();

                setBackgroundOfAllButtons();
                setEnableFalseAsDefault();

                rollDice.addActionListener(new RollDice(listPl, grid, deck, rollDice, buy, sell, build, nextPlayer, sound, history, main));
                buy.addActionListener(new Buy(listPl, deck, buy, build, sound, grid, history, main));
                nextPlayer.addActionListener(new NextPlayer(listPl, rollDice, buy, sell, build, nextPlayer, history));
                sell.addActionListener(new Sell(listPl, deck, buy, sell, build, sound, history));
                build.addActionListener(new Build(listPl, deck, build, sound, grid, history, main));
                menu.addActionListener(new BackToMenu(main));

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
    public final void setBackgroundOfAllButtons() {
        Color color = new CustomMethodsImpl().getBackground();
        rollDice.setBackground(color);
        sell.setBackground(color);
        buy.setBackground(color);
        menu.setBackground(color);
        build.setBackground(color);
        nextPlayer.setBackground(color);
    }
    /**
     * {@inheritDoc}
     */
    public final void setEnableFalseAsDefault() {
        buy.setEnabled(false);
        sell.setEnabled(false);
        build.setEnabled(false);
        nextPlayer.setEnabled(false);
    }
}
