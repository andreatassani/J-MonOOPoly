package properties;

import utility.Colors;

/**
 * {@inheritDoc}.
 */

public class PropertiesCardsImpl implements PropertiesCards {

   private String name;
   private String owner;
   private int nHouse;
   private int nHotel;
   @SuppressWarnings("unused")
   private Colors color;
    /**
     * {@inheritDoc}
     */
    @Override
    public void setName(final String n) {
       this.name = n;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setOwner(final String o) {
       this.owner = o;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setNhouse(final int i) {
        this.nHouse = i;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setNhotel(final int y) {
        this.nHotel = y;
    }

    /**
     * {@inheritDoc}
     */
    public void setColor(final Colors c) {
        this.color = c;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() { 
        return name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getOwner() {
         return owner;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getNhouse() {
        return nHouse;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getNhotel() {
        return nHotel;
    }


}
