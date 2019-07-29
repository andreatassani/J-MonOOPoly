package model.deckChanceCommunityChest;
/**
 * 
 * {@inheritDoc}.
 *
 */
public class ChanceCommunityChestCardImpl implements ChanceCommunityChestCard {

 private String name;
 private int id;
/**
 * 
 * @param name
 * @param id
 * the constructor of the cards
 */
 public ChanceCommunityChestCardImpl(final String name, final int id) {
 this.name = name;
 this.id = id;
}

/**
 * {@inheritDoc}
 */
@Override
 public String getName() {
	return this.name;
}
/**
 * {@inheritDoc}
 */
@Override
 public int getId() {
	return this.id;
}

}
