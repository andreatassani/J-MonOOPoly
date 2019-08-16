package model.utility;

import java.util.Random;

public class Dice {
    Random r = new Random();
    public int rollTheDice() {
        return r.nextInt(1)+1;
    }
}
