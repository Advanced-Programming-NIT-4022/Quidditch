package org.quidditch;

import java.util.Random;

public abstract class Player implements Success {
    protected int successChancePercent;
    Random random = new Random();

    Player() {
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

    Keeper() {
        this.successChancePercent = 70;
    }
}

class Seeker extends Player {
    Seeker() {
        this.successChancePercent = 5;
    }
}

class Chaser extends Player {

    Chaser() {
        this.successChancePercent = 30;
    }
}

class Beater extends Player {
    Beater() {
        this.successChancePercent = 40;
    }
}
