package org.example;
import java.lang.Math;
public class Keeper extends Player {
    Keeper(String name, int number) {
        super(name, number);
    }
    @Override
    public boolean isSuccessful(){
        return 0.7 > Math.random();
    }
}
