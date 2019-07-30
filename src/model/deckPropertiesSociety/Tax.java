package model.deckPropertiesSociety;

import java.util.Optional;

import model.player.Player;
/**
 * {@inheritDoc}.
 * @param
 */
public class Tax implements Entity {
	
    private String tax = "tassa";
    private int forfeit = 100;
    /**
     * Constructor.
     */
    public Tax() {

	}
    /**
     * {@inheritDoc}
     */
    public void setName(final String n) {
        this.tax = n;
    }
    /**
     * {@inheritDoc}
     */
    public String getName() {
        return this.tax;
    }
    /**
     * {@inheritDoc}
     */
	@Override
	public Optional action() {
		return Optional.of(this.forfeit);
	}
}
