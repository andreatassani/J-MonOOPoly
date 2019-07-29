package model.deckChanceCommunityChest;
import java.util.*;
/**
 * 
 * {@inheritDoc}.
 *
 */
public class ChanceCommunityChestDeckImpl implements ChanceCommunityChestDeck {

    private ArrayList<ChanceCommunityChestCard> CCCDeck = new ArrayList<ChanceCommunityChestCard>();
    private Random r = new Random();
    private int numberOfCards;

@Override
public void createDeck() {
	CCCDeck.add(new ChanceCommunityChestCardImpl("Perdi 50", 1));
	numberOfCards++;
	CCCDeck.add(new ChanceCommunityChestCardImpl("Perdi 100", 2));
	numberOfCards++;
	CCCDeck.add(new ChanceCommunityChestCardImpl("Perdi 200", 3));
	numberOfCards++;
	CCCDeck.add(new ChanceCommunityChestCardImpl("Perdi 300", 4));
	numberOfCards++;
	CCCDeck.add(new ChanceCommunityChestCardImpl("Perdi 24", 54));
	numberOfCards++;
	CCCDeck.add(new ChanceCommunityChestCardImpl("Perdi 3", 63));
	numberOfCards++;
	CCCDeck.add(new ChanceCommunityChestCardImpl("Perdi 34", 722));
	numberOfCards++;
	CCCDeck.add(new ChanceCommunityChestCardImpl("Perdi 43", 8));
	numberOfCards++;
	CCCDeck.add(new ChanceCommunityChestCardImpl("Perdi 2", 94));
	numberOfCards++;
	CCCDeck.add(new ChanceCommunityChestCardImpl("Perdi 6", 10));
	numberOfCards++;
}

@Override
public ChanceCommunityChestCard getCommunityChestCard() {
	final int risultato = r.nextInt(numberOfCards/2);
	return CCCDeck.get(risultato);
}

@Override
public ChanceCommunityChestCard getChanceCard() {
	final int risultato = r.nextInt(numberOfCards/2)+numberOfCards/2;
	return CCCDeck.get(risultato);
}

@Override
public void cardEffect(final int id) {
// TODO Auto-generated method stub

}
}
//TODO Creare carte realistiche e implementare il metodo "cardEffect" (serve la classe player)