package org.example;
import java.util.Random;

public class Player implements Success {

    private int chance , number;
    private String name ;

    Random random = new Random();

    @Override
    public boolean isSuccessful() {
        random.setSeed(System.currentTimeMillis());
        int random_number = (random.nextInt(100))+1; // generates a number between 1 and 100
        return (random_number<=chance);
    }

    public Player(String name , int number , int chance){
        this.chance = chance;
        this.name = name;
        this.number = number;
    }
}
