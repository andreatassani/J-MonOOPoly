package model.allTypeOfCard;

import java.util.ArrayList;
import java.util.Random;

public class CCCDeck {
    private final ArrayList<CCCCard> cccDeck = new ArrayList<CCCCard>();
    private final Random r = new Random();
    private int numberOfCards = 0;
    public void createDeck() {
        cccDeck.add(new CCCCard("Perdi 100", 100));
        this.numberOfCards++;
        cccDeck.add(new CCCCard("Perdi 50", 50));
        this.numberOfCards++;
        cccDeck.add(new CCCCard("Perdi 20", 20));
        this.numberOfCards++;
        cccDeck.add(new CCCCard("Guadagni 100", 100));
        this.numberOfCards++;
        cccDeck.add(new CCCCard("Guadagni 50", 50));
        this.numberOfCards++;
        cccDeck.add(new CCCCard("Guadagni 20", 20));
        this.numberOfCards++;
        cccDeck.add(new CCCCard("Vai al via!", 0));
        this.numberOfCards++;
        cccDeck.add(new CCCCard("Vai in prigione!", 0));
        this.numberOfCards++;
}
    public void getCard() {
        final int risultato = r.nextInt(numberOfCards);
        CCCCard card = cccDeck.get(risultato);
        card.action();
}
}
