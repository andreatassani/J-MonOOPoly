package model.allTypeOfCard;

import java.awt.Color;
import java.util.Optional;

import javax.swing.JOptionPane;

import model.history.History;
import model.history.HistoryImpl;
import model.myUtility.ShowImages;

import model.player.PlayerImpl;

public class Property implements Entity {
    
    private int positionInBoard = 0;
    private String name;
    private Color color;
    private int nHouses = 0;
    private boolean hotel = false;
    private int price = 0;
    private PlayerImpl owner;
    private History history;
    
    public Property(String name, Color color, int position, PlayerImpl owner) {
        this.positionInBoard = position;
        this.name = name;
        this.color = color;
        this.owner = owner;
        this.history = new HistoryImpl(Optional.empty());
        
        if(color == Color.PINK) {
            this.price = 60;
        } else if(color == Color.ORANGE) {
            this.price = 100;
        } else if(color == Color.MAGENTA) {
            this.price = 140;
        } else if(color == Color.CYAN) {
            this.price = 180;
        } else if(color == Color.RED) {
            this.price = 220;
        } else if(color == Color.YELLOW) {
            this.price = 260;
        } else if(color == Color.GREEN) {
            this.price = 300;
        } else if(color == Color.BLUE) {
            this.price = 360;
        }
    }
    
    public int getHouses() {
        return this.nHouses;
    }
        
    public boolean getHotel() {
        return this.hotel;
    }
    public int getPosition() {
        return this.positionInBoard;
    }
    @Override
    public String getName() {
        return this.name;
    }
    
    public int getPrice() {
        return this.price;
    }
    public Color getColor() {
        return this.color;
    }

    public void setNewOwner(PlayerImpl pl) {
        this.nHouses = 0;
        this.hotel = false;
        this.owner = pl;
    }
    
    public PlayerImpl getOwner() {
        return this.owner;
    }
    
    public void addHouse () {
            if(this.nHouses < 4 && this.hotel == false) {
                this.nHouses++;
                this.owner.setMoney(-price/4);
            }
            else if (this.nHouses == 4) {
                this.nHouses = 0;
                this.hotel = true;
                this.owner.setMoney(-price/2);
            }
         else {
             return;
         }
    }
    
    public void showCard() {
        ShowImages.propertyMessage(this);
    }
    
    @Override
    public void action(PlayerImpl pl) {
      if (this.getOwner() == pl){
        return;
        }
      else {
       if (this.hotel == true){
             pl.setMoney(-(this.price*2));         
             this.owner.setMoney(this.price*2);
           //Da togliere
             history.tollHotel(pl, price, owner);
             JOptionPane.showMessageDialog(null,"il giocatore " + pl.getName() + " ha pagato "+this.price*2 +"$ di pedaggio al giocatore "+this.owner.getName(),"messaggio", 0);
      } else {
          pl.setMoney(-((this.price/10)+this.nHouses*(this.price/4)));
          this.owner.setMoney((this.price/10)+this.nHouses*(this.price/4));
        //Da togliere
          history.tollHouses(pl,price,nHouses,owner);
          JOptionPane.showMessageDialog(null,"il giocatore " + pl.getName() + " ha pagato "+(this.price/10)+this.nHouses*(this.price/4) +"$ di pedaggio al giocatore "+this.owner.getName(),"messaggio", 0);
      }
     }
    }
    @Override
    public boolean isSalable() {
        return true;
    }

    @Override
    public boolean isBuildable() {
        return true;
    }
    
    
}
