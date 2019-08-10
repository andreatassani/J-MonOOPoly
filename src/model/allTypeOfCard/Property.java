package model.allTypeOfCard;

import java.awt.Color;
import java.util.Optional;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import model.images.ShowImages;
import model.player.Player;

public class Property implements Entity {
    
    private int positionInBoard = 0;
    private String name;
    private Color color;
    private int nHouses = 0;
    private boolean hotel = false;
    private int price = 0;
    private String ownerName;
    
    public Property(String name, Color color, int position) {
        this.positionInBoard = position;
        this.name = name;
        this.color = color;
        this.ownerName = "bank";
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
    
    public void setNewOwner(Player p) {
        this.nHouses = 0;
        this.hotel = false;
        this.ownerName = p.getName();
    }
    
    public String getOwner() {
        return this.ownerName;
    }
    
    public void addHouse (Player p) {
        if(this.ownerName == p.getName()) {
            if(this.hotel == true) {
                return;
            }
            if(this.nHouses < 4 && this.hotel == false) {
                this.nHouses++;
                p.setMoney(-price/4);
            }
            if(this.nHouses == 4) {
                this.nHouses = 4;
                this.hotel = true;
                p.setMoney(-price/2);
            }
         else {
             return;
         }
        }
    }
    
    public void showCard() {
        ShowImages.propertyMessage(this.ownerName, this.nHouses, this.name, this.color.getRGB());
    }
    
    @Override
    public Optional action() {
       return Optional.empty();
      //if (game.currentPlayer == this.owner){
      //  return;
      //  }
      //else if {
      // game.currentPlayer.setMoney(-((this.price/10)+this.nHouses*(this.price/4)));
      // this.owner.setMoney((this.price/10)+this.nHouses*(this.price/4));
      // if(this.hotel == true){
      //       game.currentPlayer.setMoney(-(this.price*19/10));         
      //       this.owner.setMoney(this.price*19/10); 
      //}
    }

    @Override
    public boolean isSalable() {
        return true;
    }
}
