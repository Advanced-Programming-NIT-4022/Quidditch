package org.example;
import java.util.Random;

public class Beater extends Player implements Player.Success {
    @Override
    public boolean isSuccessful() {
        Random randNum = new Random();
        if(randNum.nextInt(100)+1<=40)
            return true;
        else return false;
    }
}
