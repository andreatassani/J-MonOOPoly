
package model.allTypeOfCard;

import java.util.Optional;

/**
 *{@inheritDoc}.
 */
public class Prison implements Entity {
	
	private String name = "prigione";
    private final int stopRound = 2;
    /**
     * Constructor.
     */
    public Prison() {

	}
    /**
     * {@inheritDoc}
     */
    public void setName(final String n) {
        this.name = n;
    }
    /**
     * {@inheritDoc}
     */
    public String getName() {
        return this.name;
    }
    /**
     * {@inheritDoc}
     */
	@Override
	public Optional action() {
		return Optional.of(this.stopRound);
	}

}
