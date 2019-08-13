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

import controller.audio.AudioManager;
import model.allTypeOfCard.Entity;
import model.allTypeOfCard.EntityDeck;
import model.allTypeOfCard.Property;
import model.images.ShowImages;
import model.player.ListOfPlayers;
import model.player.Player;

public class SouthUtilityButtons extends JPanel {
    
        
    
	
	public SouthUtilityButtons(ListOfPlayers listPl, ArrayList<Entity> deck) {
		this.setLayout(new GridLayout());
		
		
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
		
		rollDice.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        sound.getDiceSound().play();
                        Random r = new Random();
                        rollDice.setEnabled(false);
                        int risultato = r.nextInt(6)+1;
                        ShowImages.dice(risultato);
                        int pos = listPl.getCurrentPlayer().getPosition();
                        listPl.getCurrentPlayer().setPosition(pos+risultato);
                        for(int i = 0; i<risultato; i++) {
                            sound.getPawnSound().play();
                        }
                        //Da togliere
                        JOptionPane.showMessageDialog(null,"il giocatore "+listPl.getCurrentPlayer().getName()+" è finito sulla casella "+deck.get(pos+risultato).getName(),
                                "messaggio", 0);
                        if(deck.get(pos+risultato).getOwner() == listPl.getCurrentPlayer()) {
                            buy.setEnabled(false);
                            sell.setEnabled(true);
                            build.setEnabled(true);
                            if(((Property)deck.get(pos+risultato)).getHotel()) {
                                build.setEnabled(false);
                            }
                            
                        } else if(deck.get(pos+risultato).getOwner() == listPl.getPlayerFromIndex(0) && deck.get(pos+risultato).isSalable() ) {
                            buy.setEnabled(true);
                            sell.setEnabled(false);
                        } else if (deck.get(pos+risultato).getOwner() != listPl.getPlayerFromIndex(0) && deck.get(pos+risultato).isSalable() && deck.get(pos+risultato).getOwner() != listPl.getCurrentPlayer()) {
                            deck.get(pos+risultato).action(listPl.getCurrentPlayer());
                          //Da togliere
                            JOptionPane.showMessageDialog(null,"il giocatore "+listPl.getCurrentPlayer().getName()+"possiede"+listPl.getCurrentPlayer().getMoney(),
                                    "messaggio", 0);
                            buy.setEnabled(true);
                        } else if (deck.get(pos+risultato).isSalable() == false) {
                            deck.get(pos+risultato).action(listPl.getCurrentPlayer());
                        }
                        nextPlayer.setEnabled(true);
                        if(listPl.getCurrentPlayer().getMoney() <= 0) {
                            JOptionPane.showMessageDialog(null,"il giocatore " + listPl.getCurrentPlayer().getName() + " ha perso! :(",
                                    "messaggio", 0);
                            rollDice.setEnabled(true);
                            buy.setEnabled(false);
                            sell.setEnabled(false);
                            build.setEnabled(false);
                            nextPlayer.setEnabled(false);
                            listPl.nextPlayer();
                            for(int i = 1; i<4; i++) {
                                int stopTurns = listPl.getCurrentPlayer().getStopTurns();
                                if(stopTurns != 0) {
                                    //Da togliere
                                    JOptionPane.showMessageDialog(null,"il giocatore " + listPl.getCurrentPlayer().getName() + " deve ancora aspettare " + stopTurns + "turni in prigione",
                                            "messaggio", 0);
                                    stopTurns -= 1;
                                }
                            }
                          //Da togliere
                            JOptionPane.showMessageDialog(null,"è il turno di"+ listPl.getCurrentPlayer().getName() + " e si trova sulla casella " + deck.get(listPl.getCurrentPlayer().getPosition()).getName(),
                                    "messaggio", 0);
                        }
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
                        for(int i = 1; i<4; i++) {
                            int stopTurns = listPl.getCurrentPlayer().getStopTurns();
                            if(stopTurns != 0) {
                                //Da togliere
                                JOptionPane.showMessageDialog(null,"il giocatore " + listPl.getCurrentPlayer().getName() + " deve ancora aspettare " + stopTurns + "turni in prigione",
                                        "messaggio", 0);
                                stopTurns -= 1;
                            }
                        }
                      //Da togliere
                        JOptionPane.showMessageDialog(null,"è il turno di "+ listPl.getCurrentPlayer().getName() + " e si trova sulla casella " + deck.get(listPl.getCurrentPlayer().getPosition()).getName(),
                                "messaggio", 0);
                    }
                });
		buy.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        listPl.getCurrentPlayer().buyProperty((Property)deck.get(listPl.getCurrentPlayer().getPosition()));
                        sound.getCashSound().play();
                        buy.setEnabled(false);
                        sell.setEnabled(true);
                        build.setEnabled(true);
                      //Da togliere
                        JOptionPane.showMessageDialog(null,"il giocatore " + listPl.getCurrentPlayer().getName() + " ha acquistato la proprietà " + deck.get(listPl.getCurrentPlayer().getPosition()).getName() + " e gli rimangono " + listPl.getCurrentPlayer().getMoney() + "$",
                                "messaggio", 0);
                        if(listPl.getCurrentPlayer().getMoney() <= 0) {
                            JOptionPane.showMessageDialog(null,"il giocatore " + listPl.getCurrentPlayer().getName() + " ha perso! :(",
                                    "messaggio", 0);
                            rollDice.setEnabled(true);
                            buy.setEnabled(false);
                            sell.setEnabled(false);
                            build.setEnabled(false);
                            nextPlayer.setEnabled(false);
                            listPl.nextPlayer();
                            for(int i = 1; i<4; i++) {
                                int stopTurns = listPl.getCurrentPlayer().getStopTurns();
                                if(stopTurns != 0) {
                                    //Da togliere
                                    JOptionPane.showMessageDialog(null,"il giocatore " + listPl.getCurrentPlayer().getName() + " deve ancora aspettare " + stopTurns + " turni in prigione",
                                            "messaggio", 0);
                                    stopTurns -= 1;
                                }
                            }
                          //Da togliere
                            JOptionPane.showMessageDialog(null,"è il turno di"+ listPl.getCurrentPlayer().getName() + " e si trova sulla casella " + deck.get(listPl.getCurrentPlayer().getPosition()).getName(),
                                    "messaggio", 0);
                        }
                    }
                 });
		sell.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        listPl.getPlayerFromIndex(0).buyProperty((Property)deck.get(listPl.getCurrentPlayer().getPosition()));
                        sound.getCashSound().play();
                        buy.setEnabled(true);
                        sell.setEnabled(false);
                      //Da togliere
                        JOptionPane.showMessageDialog(null,"il giocatore " + listPl.getCurrentPlayer().getName() + " ha venduto la proprietà " + deck.get(listPl.getCurrentPlayer().getPosition()).getName() + " e gli rimangono " + listPl.getCurrentPlayer().getMoney() + "$",
                                "messaggio", 0);
                    }
                 });
		
		build.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        ((Property)deck.get(listPl.getCurrentPlayer().getPosition())).addHouse();
		        if(((Property)deck.get(listPl.getCurrentPlayer().getPosition())).getHotel()) {
		        //Da togliere
                        JOptionPane.showMessageDialog(null,"il giocatore " + listPl.getCurrentPlayer().getName() + " ha costruito un hotel sulla proprietà " + deck.get(listPl.getCurrentPlayer().getPosition()).getName() + " e gli rimangono " + listPl.getCurrentPlayer().getMoney() + "$",
                                "messaggio", 0);
                        build.setEnabled(false);
                     
		        }
		        else {
		          //Da togliere
	                        JOptionPane.showMessageDialog(null,"il giocatore " + listPl.getCurrentPlayer().getName() + " ha costruito una casa sulla proprietà " + deck.get(listPl.getCurrentPlayer().getPosition()).getName() + ",ora ha " +
	                                ((Property)deck.get(listPl.getCurrentPlayer().getPosition())).getHouses() + " e gli rimangono " + listPl.getCurrentPlayer().getMoney() + "$", "messaggio", 0);
		        }
		        for(int i = 1; i<4; i++) {
                            int stopTurns = listPl.getCurrentPlayer().getStopTurns();
                            if(stopTurns != 0) {
                                //Da togliere
                                JOptionPane.showMessageDialog(null,"il giocatore " + listPl.getCurrentPlayer().getName() + " deve ancora aspettare " + stopTurns + " turni in prigione",
                                        "messaggio", 0);
                                stopTurns -= 1;
                            }
                        }
                      //Da togliere
                        JOptionPane.showMessageDialog(null,"è il turno di"+ listPl.getCurrentPlayer().getName() + " e si trova sulla casella " + deck.get(listPl.getCurrentPlayer().getPosition()).getName(),
                                "messaggio", 0);
		    }
		});
		

		
		
		this.setBorder(new LineBorder(Color.BLACK));
	}

}
