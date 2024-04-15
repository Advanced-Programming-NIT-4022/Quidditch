package org.example;

import java.util.Random;

class Seeker extends Player{

    @Override
    public boolean isSuccessful() {
        Random randomNumber = new Random();
        int successChance = randomNumber.nextInt(100);
        if(successChance < 5)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


}
