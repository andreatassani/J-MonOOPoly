package model.allTypeOfCard;

import java.util.ArrayList;
import java.util.Random;

import model.player.PlayerImpl;

public class Chance implements Entity{

    private PlayerImpl owner;
    private String name = "Chance";
    private ArrayList<CCCCard> deck = new ArrayList<>();
    private int numberOfCards;
    private final Random r = new Random();
    
    public Chance(PlayerImpl owner) {
        this.owner = owner;
        deck.add(new CCCCard("Perdi 200$", -200, owner));
        this.numberOfCards++;
        deck.add(new CCCCard("Perdi 250$", -250, owner));
        this.numberOfCards++;
        deck.add(new CCCCard("Perdi 300$", -300, owner));
        this.numberOfCards++;
        deck.add(new CCCCard("Perdi 500$", -500, owner));
        this.numberOfCards++;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void action(PlayerImpl pl) {
        final int risultato = r.nextInt(numberOfCards);
        deck.get(risultato).action(pl);
    }

    @Override
    public PlayerImpl getOwner() {
        return this.owner;
    }

    @Override
    public boolean isSalable() {
        return false;
    }

}
