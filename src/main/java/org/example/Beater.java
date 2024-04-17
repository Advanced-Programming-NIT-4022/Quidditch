package org.example;
import java.lang.Math;
public class Beater extends Player implements Success{
    Beater(String name, int number) {
        super(name, number);
    }

    @Override
    public boolean isSuccessful() {
        return 0.4 > Math.random();
    }
}
