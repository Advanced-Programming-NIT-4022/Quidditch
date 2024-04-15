package org.example;

public class Team {
    Keeper keeper;
    Seeker seeker;
    Chaser[] chasers;
    Beater[] beaters;
    int numGoals;
    public Team(Keeper keeper, Seeker seeker, Chaser[] chasers, Beater[] beaters, int numGoals) {
        this.keeper = keeper;
        this.seeker = seeker;
        this.chasers = chasers;
        this.beaters = beaters;
        this.numGoals = 0;
    }
    private void setGoal() {
        this.numGoals++;
    }
    void play() {
        boolean atleastOneBeater = false;
        for (Beater beater : beaters) {
            if (beater.isSuccessful()) {
                atleastOneBeater = true;
                break;
            }
        }
        int successfulChasers = 0;
        boolean atleastTwoChasers = false;
        for (Chaser chaser : chasers) {
            if (chaser.isSuccessful())
                successfulChasers++;
        }
        if (successfulChasers >= 2)
            atleastTwoChasers = true;

        if (keeper.isSuccessful() && atleastOneBeater && atleastTwoChasers)
            setGoal();
    }
}

