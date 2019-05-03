package properties;

import player.Player;
import utility.Colors;

/**
 * {@inheritDoc}.
 */

public class PropertiesCardsImpl implements PropertiesCards {

   private String name;
   private Player owner;
   private int nHouse;
   private int nHotel;
   @SuppressWarnings("unused")
   private Colors color;
   /**
    * @param n
    * @param o
    * @param cs
    * constructor for this class 
    */
   public PropertiesCardsImpl(final String n, final Player o, final Colors c) {
       this.name = n;
       this.owner = o;
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
        if(checkNhouse() == true) {
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
        if(checkNhotel() == true) {
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
        if(nHouse < 4) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean checkNhotel() {
        if(nHotel < 1) {
            return true;
        } else {
            return false;
        }
    }
}

