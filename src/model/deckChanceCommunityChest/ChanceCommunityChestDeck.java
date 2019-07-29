package model.deckChanceCommunityChest;
/**
 * 
 * interface of the deck, containing the Chance and Community cards,
 * with the methods to get the cards and their effects.
 *
 */
public interface ChanceCommunityChestDeck {
/**
 * method to create the deck of Community Chest and Chance cards, adding every card to the arrayList "CCCDeck"
 */
void createDeck();
/**
 * 
 * @return a random Community Chest card from the deck (id 1-5)
 * 
 */
ChanceCommunityChestCard getCommunityChestCard();
/**
 * 
 * @return a random Chance card from the deck (id 6-10)
 */
 ChanceCommunityChestCard getChanceCard();
/**
 * 
 * @param id
 * 
 * used to associate an effect to the correct card
 */
 void cardEffect(int id);
}
