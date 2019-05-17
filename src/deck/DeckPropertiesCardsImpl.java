package deck;

import player.Player;
import utility.Colors;

/**
 * {@inheritDoc}.
 */

public class DeckPropertiesCardsImpl implements DeckPropertiesCards {

   private String name;
   private Player owner;
   private int nHouse;
   private int nHotel;
   @SuppressWarnings("unused")
   private Colors color;
   /**
    * @param c
    * @param n
    * constructor for this class.
    */
   public DeckPropertiesCardsImpl(final String n, final Colors c) {
       this.name = n;
       this.owner = null;
       this.nHouse = 0;
       this.nHotel = 0;
       this.color = c;
}
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
    public void setOwner(final Player o) {
       this.owner = o;
    }

    /**
     * {@inheritDoc}
     * @return 
     */
    @Override
    public void addNhouse(final int i) {
        if (checkNhouse()) {
            this.nHouse += i;
        } else {
            return;
            }       
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addNhotel(final int y) {
        if (checkNhotel()) {
            this.nHotel += y;
        } else {
            return;
        }
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
    public Player getOwner() {
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

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean checkNhouse() {
        return nHouse < 4;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean checkNhotel() {
        return nHotel < 1;
    }
}

