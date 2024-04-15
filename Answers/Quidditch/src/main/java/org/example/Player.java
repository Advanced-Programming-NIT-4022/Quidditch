package org.example;

import java.util.Random;

class Player implements Success{

    int chance ;
    Random randomNumber = new Random();

    @Override
    public boolean isSuccessful() {

        int successChance = randomNumber.nextInt(100)+1 ;

        if(successChance <= chance)
        {
            return true;
        }
            return false;
    }
}
