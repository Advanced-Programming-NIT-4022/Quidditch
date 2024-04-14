package org.example;
import java.util.Random;

public class Player implements Success {

    int chance;

    Random random = new Random();

    @Override
    public boolean isSuccessful() {
        random.setSeed(System.currentTimeMillis());
        int random_number = (random.nextInt(100))+1; // generates a number between 1 and 100
        return (random_number<=chance);
    }
}
