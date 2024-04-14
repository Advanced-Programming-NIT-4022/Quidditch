package org.example;

class Team {
    Keeper keeper;
    Seeker seeker;
    Chaser[] chasers;
    Beater[] beaters;
    int goals;

    public Team(Keeper keeper, Seeker seeker, Chaser[] chasers, Beater[] beaters) {
        this.keeper = keeper;
        this.seeker = seeker;
        this.chasers = chasers;
        this.beaters = beaters;
        this.goals = 0;
    }

    private void setGoal() {
        this.goals++;
    }

    public void play() {
        boolean keeperSuccess = keeper.isSuccessful();
        int successfulBeaters = 0;
        for (Beater beater : beaters) {
            if (beater.isSuccessful()) {
                successfulBeaters++;
            }
        }
        int successfulChasers = 0;
        for (Chaser chaser : chasers) {
            if (chaser.isSuccessful()) {
                successfulChasers++;
            }
        }
        if (keeperSuccess && successfulBeaters >= 1 && successfulChasers >= 2) {
            setGoal();
        }
    }
}
