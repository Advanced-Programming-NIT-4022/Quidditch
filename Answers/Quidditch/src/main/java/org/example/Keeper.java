package org.example;

import java.util.Random;

class Keeper extends Player {


    @Override
    public boolean isSuccessful() {
        Random randomNumber = new Random();
        int successChance = randomNumber.nextInt(100);
        if(successChance < 70)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
