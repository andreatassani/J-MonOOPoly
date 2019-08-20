package model.allTypeOfCard;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

import model.player.PlayerImpl;
/**
 * 
 * This is the deck of the Chance cards, which had been implemented with CCCCard class (in the same package)
 *
 */
public class Chance implements Entity{

    /**
     * fields
     */
    private final PlayerImpl owner;
    private final String name = "Chance";
    private final ArrayList<CCCCard> deck = new ArrayList<>();
    private int numberOfCards;
    private final Random r = new Random();
    private final int positionOnBoard;
    /**
     * constructor
     */
    public Chance(final PlayerImpl owner,final int positionOnBoard) {
        this.positionOnBoard = positionOnBoard;
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

    /**
     * this method draws a Chance card randomly
     */
    @Override
    public void action(final PlayerImpl pl) {
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
    @Override
    public boolean isBuildable() {
        return false;
    }
    @Override
    public int getPosition() {
        return this.positionOnBoard;
    }
    @Override
    public Color getColor() {
        return Color.WHITE;
    }

}
