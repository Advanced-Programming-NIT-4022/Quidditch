package org.example;
import java.util.Random;

public abstract class Player implements Success {
    String name;
    int num;
    public Player(String name, int num) {
        this.name = name;
        this.num = num;
    }
}
class Keeper extends Player {
    public Keeper(String name, int num) {
        super(name, num);
    }
    @Override
    public boolean isSuccessful() {
        Random random = new Random();
        return random.nextInt(100) < 70;
    }
}
class Seeker extends Player {
    public Seeker(String name, int num) {
        super(name, num);
    }
    @Override
    public boolean isSuccessful() {
        Random random = new Random();
        return random.nextInt(100) < 5;
    }
}
class Chaser extends Player {
    public Chaser(String name, int num) {
        super(name, num);
    }
    @Override
    public boolean isSuccessful() {
        Random random = new Random();
        return random.nextInt(100) < 30;
    }
}
class Beater extends Player {
    public Beater(String name, int num) {
        super(name, num);
    }
    @Override
    public boolean isSuccessful() {
        Random random = new Random();
        return random.nextInt(100) < 40;
    }
}