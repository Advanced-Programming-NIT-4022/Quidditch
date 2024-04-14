public class Team {
    Keeper keeper;
    Seeker seeker;
    Chaser[] chasers = new Chaser[3];
    Beater[] beaters = new Beater[2];
    private int goals;

    Team(Keeper keeper, Seeker seeker, Chaser[] chasers, Beater[] beaters) {
        this.keeper = keeper;
        this.seeker = seeker;
        this.chasers = chasers;
        this.beaters = beaters;
    }

    private void setGoal() {
        goals++;
    }

    void play() {
        boolean keeperSuccess = keeper.isSuccessful();
        int successfulBeaters = 0;
        int successfulChasers = 0;

        for (Beater beater : beaters) {
            if (beater.isSuccessful()) {
                successfulBeaters++;
            }
        }

        for (Chaser chaser : chasers) {
            if (chaser.isSuccessful()) {
                successfulChasers++;
            }
        }

        if (keeperSuccess && successfulBeaters >= 1 && successfulChasers >= 2) {
            setGoal();
        }
    }

    int getGoals() {
        return goals;
    }

    int getScore() {
        return goals * 10;
    }
}