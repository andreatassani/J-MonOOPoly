package model.deckChanceCommunityChest;
/**
 * 
 * interface of Chance and Community Chest cards.
 *
 */
public interface ChanceCommunityChestCard {
/**
 *
 * @return the name of the card
 * 
 */
 String getName();
/**
 * 
 * @return the id of the card;
 * ids from 1 to 5 for Comunity Chest cards
 * ids from 6 to 10 for Chance cards
 * 
 */
 int getId();
}
