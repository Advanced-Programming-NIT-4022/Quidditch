package org.quidditch;

public class Team {
    Keeper keeper = new Keeper();
    Seeker seeker = new Seeker();
    Chaser[] chaser = new Chaser[3];
    Beater[] beater = new Beater[2];
    private int goals;

    public Team() {
        for (int i = 0; i < this.chaser.length; i++) {
            this.chaser[i] = new Chaser();
        }
        for (int i = 0; i < this.beater.length; i++) {
            this.beater[i] = new Beater();
        }
        this.goals = 0;
    }

    private void setGoal() {
        this.goals++;
    }

    public int getGoals() {
        return this.goals;
    }

    protected void play() {
        if (this.keeper.isSuccessful() && (this.beater[0].isSuccessful()) || this.beater[1].isSuccessful()) {
            int chasersSucceeded = 0;
            for (Chaser chaser : this.chaser) {
                if (chaser.isSuccessful()) chasersSucceeded++;
            }
            if (chasersSucceeded >= 2) setGoal();
        }
    }

    protected boolean seekerPlayWasSuccessful() {
        if (this.seeker.isSuccessful()) {
            this.goals += 150;
            return true;
        }
        return false;
    }
}
