package model.myUtility;

import java.util.Random;
/**
 * 
 * Utility class to throw a dice and return the result
 *
 */
public class Dice {
    Random r = new Random();
    /**
     * 
     * @return the result of the throw of the dice
     */
    public int rollTheDice() {
    	//modificareee
    	int X=3;
        return r.nextInt(1)+X;
    }
}
