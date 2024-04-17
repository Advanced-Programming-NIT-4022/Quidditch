package org.example;
import java.lang.Math;
public class Seeker extends Player {
    Seeker(String name, int number) {
        super(name, number);
    }
    @Override
    public boolean isSuccessful(){
        return 0.05 > Math.random();
    }
}
