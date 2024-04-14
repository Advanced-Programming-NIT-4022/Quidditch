package org.quidditch;

import java.util.Random;

public abstract class Player implements Success {
    protected int successChancePercent;
    Random random = new Random();
    final String name;
    final int number;

    Player(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public boolean isSuccessful() {
        if (this.random.nextInt(100) + 1 < this.successChancePercent) {
            return true;
        }
        return false;
    }
}

class Keeper extends Player {
    Keeper(String name, int number) {
        super(name, number);
        this.successChancePercent = 70;
    }
}

class Seeker extends Player {
    Seeker(String name, int number) {
        super(name, number);
        this.successChancePercent = 5;
    }
}

class Chaser extends Player {
    Chaser(String name, int number) {
        super(name, number);
        this.successChancePercent = 30;
    }
}

class Beater extends Player {
    Beater(String name, int number) {
        super(name, number);
        this.successChancePercent = 40;
    }
}
