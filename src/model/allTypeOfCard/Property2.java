package model.allTypeOfCard;

import java.util.Optional;

import model.player.Player;
import model.utility.Colors;

public class Property2 implements Entity {
    
    private String name;
//    private Colors color;
    private int nHouses = 0;
    private boolean hotel = false;
    private int price = 0;
    private String ownerName;
    
    public Property2(String name, Colors color, int price) {
        this.name = name;
//        this.color = color;
        this.price = price;
        this.ownerName = "bank";
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
    public int getPrice() {
        return this.price;
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

}
