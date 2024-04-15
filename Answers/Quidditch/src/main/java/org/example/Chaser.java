package org.example;

import java.util.Random;

class Chaser extends Player {

    @Override
    public boolean isSuccessful() {
        Random randomNumber = new Random();
        int successChance = randomNumber.nextInt(100);
        if(successChance < 30)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}