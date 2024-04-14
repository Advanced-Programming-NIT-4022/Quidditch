package org.quidditch;

public class Team {
    final String name;
    Keeper keeper;
    Seeker seeker;
    Chaser[] chaser = new Chaser[3];
    Beater[] beater = new Beater[2];
    private int goals;

    public Team(String name, String[] playerNames) {
        this.name = name;
        this.keeper = new Keeper(playerNames[0], 1);
        this.seeker = new Seeker(playerNames[1], 2);
        this.chaser[0] = new Chaser(playerNames[2], 3);
        this.chaser[1] = new Chaser(playerNames[3], 4);
        this.chaser[2] = new Chaser(playerNames[4], 5);
        this.beater[0] = new Beater(playerNames[5], 6);
        this.beater[1] = new Beater(playerNames[6], 7);
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
