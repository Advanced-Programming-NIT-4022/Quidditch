package org.example;

public class Team {
    Keeper keeper= new Keeper();
    Seeker seeker = new Seeker();
    Beater[] beaters = new Beater[2];
    Chaser[] chasers = new Chaser[3];
    int goals;
    public Team() {
        for (int i = 0; i < chasers.length; i++) {
            chasers[i] = new Chaser();
        }
    }
    private void setGoals()
    {
        goals++;
    }
    private boolean
    beaterIsSuccessful() {
        for (Beater beater : beaters) {
            if (beater.isSuccessful()) {
                return true;
            }
        }
        return false;
    }

    private int successfulChasersNum() {
        int successfulChasers = 0;
        for (Chaser chaser : chasers) {
            if (chaser.isSuccessful()) {
                successfulChasers++;
            }
        }
        return successfulChasers;
    }
    public void play()
    {
        if(keeper.isSuccessful() && successfulChasersNum()>=2)
            setGoals();
        if(seeker.isSuccessful())
            goals=+150;
    }
}
