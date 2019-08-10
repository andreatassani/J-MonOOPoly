package model.allTypeOfCard;

import java.util.Optional;
/**
 * 
 * {@inheritDoc}.
 *
 */
public class GoToPrison implements Entity {
	
	private String name = "parcheggio";
	private final int nStopRound = 2;
    /**
     * Constructor.
     */
    public GoToPrison() {

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
		return Optional.of(nStopRound);
	}
    @Override
    public String getOwner() {
        return "Bank";
    }
    @Override
    public boolean isSalable() {
        return false;
    }

}
