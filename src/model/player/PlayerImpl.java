package model.player;

import model.utility.Colors;
import model.utility.Pawns;
/**
 * class for creating a player.
 * 
 *
 */

public class PlayerImpl implements Player {
/**
 * player fields.
 */
    private String name;
    private Colors color;
    private Pawns pawns;
    private int money;
    final private int BANK_AMOUNT = 5500;
 /**
  * constructor of player.
  * @param name.
  * @param color.
  * @param pawns.
  */
    public PlayerImpl(final String name, final Colors color, final Pawns pawns) {

        this.name = name;
        this.color = color;
        this.pawns = pawns;
        this.money = BANK_AMOUNT;
    }
/**
 * {@inheritDoc}
 * 
 */
    public String getName() {
        return name;
    }
 /**
  * {@inheritDoc}
  * 
  */

    public void setName(final String name) {
        this.name = name;
    }
/**
 * 
 * {@inheritDoc}
 */
    public Colors getColors() {
        return color;
    }
/**
 * {@inheritDoc}
 * 
 */
    public void setColor(final Colors color) {
        this.color = color;
    }
/**
 * {@inheritDoc}
 * 
 */
    public Pawns getPawn() {
        return pawns;
    }
/**
 * {@inheritDoc}
 * 
 */
    public void setPawns(final Pawns pawns) {
        this.pawns = pawns;
    }




}