package model.allTypeOfCard;

import java.awt.Color;
import java.util.ArrayList;

public class EntityDeck {
    private final ArrayList<Entity> deck = new ArrayList<>();
    Property forli = new Property("Forlì",Color.PINK, 1);
    Property cesena = new Property("Cesena",Color.PINK, 3);
    Property firenze = new Property("Firenze",Color.ORANGE, 6);
    Property pisa = new Property("Pisa",Color.ORANGE, 8);
    Property lucca = new Property("Lucca",Color.ORANGE, 9);
    Property roma = new Property("Roma",Color.MAGENTA, 11);
    Property rieti = new Property("Rieti",Color.MAGENTA, 13);
    Property viterbo = new Property("Viterbo",Color.MAGENTA, 14);
    Property teramo = new Property("Teramo",Color.CYAN, 16);
    Property pescara = new Property("Pescara",Color.CYAN, 18);
    Property chieti = new Property("Chieti",Color.CYAN, 19);
    Property caserta = new Property("Caserta",Color.RED,21);
    Property napoli = new Property("Napoli",Color.RED,23);
    Property salerno = new Property("Salerno",Color.RED,24);
    Property palermo = new Property("Palermo",Color.YELLOW,26);
    Property catania = new Property("Catania",Color.YELLOW,27);
    Property trapani = new Property("Trapani",Color.YELLOW,29);
    Property venezia = new Property("Venezia",Color.GREEN,31);
    Property padova = new Property("Padova",Color.GREEN,32);
    Property verona= new Property("Verona",Color.GREEN,34);
    Property mantova = new Property("Mantova",Color.BLUE,37);
    Property milano = new Property("Milano",Color.BLUE,39);
    
    public EntityDeck() {
        deck.add(forli);
        deck.add(cesena);
        deck.add(firenze);
        deck.add(pisa);
        deck.add(lucca);
        deck.add(roma);
        deck.add(rieti);
        deck.add(viterbo);
        deck.add(teramo);
        deck.add(pescara);
        deck.add(chieti);
        deck.add(caserta);
        deck.add(napoli);
        deck.add(salerno);
        deck.add(palermo);
        deck.add(catania);
        deck.add(trapani);
        deck.add(venezia);
        deck.add(padova);
        deck.add(verona);
        deck.add(mantova);
        deck.add(milano);
    }
    
    public ArrayList<Entity> getDeck(){
        return this.deck;
    }
}
