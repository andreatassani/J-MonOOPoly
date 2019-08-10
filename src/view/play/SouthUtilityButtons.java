package view.play;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import model.allTypeOfCard.Entity;
import model.allTypeOfCard.EntityDeck;
import model.images.ShowImages;
import model.player.ListOfPlayers;
import model.player.Player;

public class SouthUtilityButtons extends JPanel {
    
	
	public SouthUtilityButtons(ListOfPlayers listPl) {
	        
		this.setLayout(new GridLayout());
		final ArrayList<Entity> deck = new EntityDeck().getDeck();
		
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
		
		rollDice.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Random r = new Random();
                        rollDice.setEnabled(false);
                        int risultato = r.nextInt(6)+1;
                        ShowImages.dice(risultato);
                        int pos = listPl.getCurrentPlayer().getPosition();
                        listPl.getCurrentPlayer().setPosition(pos+risultato);
                        System.out.println("il giocatore"+listPl.getCurrentPlayer().getName()+"è finito sulla casella"+(pos+risultato));
                        if(listPl.getCurrentPlayer().hasProperty(deck.get(pos+risultato))) {
                            buy.setEnabled(false);
                            sell.setEnabled(true);
                        } else {
                            if(deck.get(pos+risultato).getOwner() == "Bank" && deck.get(pos+risultato).isSalable() ) {
                            buy.setEnabled(true);}
                            sell.setEnabled(false);
                        }
                        
                        nextPlayer.setEnabled(true);
                    }
                });
		nextPlayer.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        rollDice.setEnabled(true);
                        buy.setEnabled(false);
                        sell.setEnabled(false);
                        build.setEnabled(false);
                        nextPlayer.setEnabled(false);
                        listPl.nextPlayer();
                        System.out.println("è il turno di"+ listPl.getCurrentPlayer().getName());
                    }
                });
		
		
		this.setBorder(new LineBorder(Color.BLACK));
	}

}
