package model.allTypeOfCard;

import java.util.Optional;

import model.player.Player;
/**
 * {@inheritDoc}.
 */
public class Tax implements Entity {
	
    private String name = "tassa";
    private final int forfeit = 100;
    /**
     * Constructor.
     */
    public Tax() {

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
		return Optional.of(this.forfeit);
	}
    @Override
    public String getOwner() {
        return "Bank";
    }
    @Override
    public boolean isSalable() {
        return true;
    }
}
