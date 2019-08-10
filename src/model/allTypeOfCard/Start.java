/**
 * 
 */
package model.allTypeOfCard;

import java.util.Optional;

/**
 * {@inheritDoc}.
 */
public class Start implements Entity {
	
	private String name = "via";
    private final int bonus = 200;
    /**
     * Constructor.
     */
    public Start() {

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
		return Optional.of(this.bonus);
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
