package org.example;
import java.lang.Math;
public class Chaser extends Player{
    Chaser(String name, int number) {
        super(name, number);
    }
    @Override
    public boolean isSuccessful() {
        return 0.3 > Math.random();
    }
}
