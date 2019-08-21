package model.allTypeOfCard;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

import model.player.PlayerImpl;
/**
 * 
 * This is the deck of the Community Chest cards, which had been implemented with CCCCard class (in the same package)
 *
 */
public class CommunityChest implements Entity{

    /**
     * fields
     */
    private final PlayerImpl owner;
    private final String name = "Community Chest";
    private final ArrayList<CCCCard> deck = new ArrayList<>();
    private int numberOfCards;
    private final Random r = new Random();
    private final int positionOnBoard;
    /**
     * constructor
     */
    public CommunityChest(PlayerImpl owner, int positionOnBoard) {
        this.owner = owner;
        this.positionOnBoard = positionOnBoard;
        deck.add(new CCCCard("Gain 200$", 200, owner));
        this.numberOfCards++;
        deck.add(new CCCCard("Gain 250$", 250, owner));
        this.numberOfCards++;
        deck.add(new CCCCard("Gain 300$", 300, owner));
        this.numberOfCards++;
        deck.add(new CCCCard("Gain 500$", 500, owner));
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
        return positionOnBoard;
    }
    @Override
    public Color getColor() {
        return Color.WHITE;
    }

}
