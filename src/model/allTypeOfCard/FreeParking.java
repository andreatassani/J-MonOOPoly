package model.allTypeOfCard;

import java.util.Optional;
/**
 * {@inheritDoc}.
 */
public class FreeParking implements Entity {
	
	private String name = "parcheggio";
    /**
     * Constructor.
     */
    public FreeParking() {

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
		return Optional.empty();
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
