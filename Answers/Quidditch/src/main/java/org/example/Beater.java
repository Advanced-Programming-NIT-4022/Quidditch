package org.example;

import java.util.Random;

class Beater extends Player{



    @Override
    public boolean isSuccessful() {
        Random randomNumber = new Random();
        int successChance = randomNumber.nextInt(100);
        if(successChance < 40)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
