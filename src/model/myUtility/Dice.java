package model.myUtility;

import java.util.Random;

public class Dice {
    Random r = new Random();
    public int rollTheDice() {
    	//modificareee
    	int X=6;
        return r.nextInt(1)+X;
    }
}
