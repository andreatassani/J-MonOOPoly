package model.allTypeOfCard;

import java.awt.Color;
import java.util.ArrayList;

import model.player.PlayerImpl;

public class EntityDeck {
    private final ArrayList<Entity> deck = new ArrayList<>();

    
    public EntityDeck(PlayerImpl bank) {
        deck.add(new Start(bank));
        deck.add(new Property("Forlì",Color.PINK, 1, bank));
        deck.add(new CommunityChest(bank));
        deck.add(new Property("Cesena",Color.PINK, 3, bank));
        deck.add(new Tax(bank));
        deck.add(new Society("Stazione N", 200, 5, bank, Color.GRAY));
        deck.add(new Property("Firenze", Color.ORANGE, 6, bank));
        deck.add(new Chance(bank));
        deck.add(new Property("Pisa",Color.ORANGE, 8, bank));
        deck.add(new Property("Lucca",Color.ORANGE, 9, bank));
        deck.add(new Prison(bank));
        deck.add(new Property("Roma",Color.MAGENTA, 11, bank));
        deck.add(new Society("Enel", 150, 12, bank, Color.GRAY));
        deck.add(new Property("Rieti",Color.MAGENTA, 13, bank));
        deck.add(new Property("Viterbo",Color.MAGENTA, 14, bank));
        deck.add(new Society("Stazione E", 200, 15, bank, Color.GRAY));
        deck.add(new Property("Teramo",Color.CYAN, 16, bank));
        deck.add(new CommunityChest(bank));
        deck.add(new Property("Pescara",Color.CYAN, 18, bank));
        deck.add(new Property("Chieti",Color.CYAN, 19, bank));
        deck.add(new FreeParking(bank));
        deck.add(new Property("Caserta",Color.RED,21, bank));
        deck.add(new Chance(bank));
        deck.add(new Property("Napoli",Color.RED,23, bank));
        deck.add(new Property("Salerno",Color.RED,24, bank));
        deck.add(new Society("Stazione S", 200, 25, bank, Color.GRAY));
        deck.add(new Property("Palermo",Color.YELLOW,26, bank));
        deck.add(new Property("Catania",Color.YELLOW,27, bank));
        deck.add(new Society("Hera", 150, 28, bank, Color.GRAY));
        deck.add(new Property("Trapani",Color.YELLOW,29, bank));
        deck.add(new GoToPrison(bank));
        deck.add(new Property("Venezia",Color.GREEN,31, bank));
        deck.add(new Tax(bank));
        deck.add(new Property("Padova",Color.GREEN,33, bank));
        deck.add(new Chance(bank));
        deck.add(new Society("Stazione O", 200, 35, bank, Color.GRAY));
        deck.add(new Property("Verona",Color.GREEN,36, bank));
        deck.add(new CommunityChest(bank));
        deck.add(new Property("Mantova",Color.BLUE,38, bank));
        deck.add(new Property("Milano",Color.BLUE,39, bank));
    }
    
    public ArrayList<Entity> getDeck(){
        return this.deck;
    }
}
