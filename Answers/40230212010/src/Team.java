class Team {
    private Keeper keeper;
    private Seeker seeker;
    private Chaser[] chasers;
    private Beater[] beaters;
    private int goals;

    public Team(Keeper keeper, Seeker seeker, Chaser[] chasers, Beater[] beaters) {
        this.keeper = keeper;
        this.seeker = seeker;
        this.chasers = chasers;
        this.beaters = beaters;
        this.goals = 0;
    }

    private void setGoal() {
        goals++;
    }

    public boolean hasSeekerFoundSnitch() {
        return seeker.isSuccessful();
    }

    public boolean play() {
        if (hasSeekerFoundSnitch()) {
            System.out.println("Golden Snitch found by " + seeker.name + " Team scores 150 points!");
            return true;
        }

        if (keeper.isSuccessful() && atLeastOneBeaterSuccessful() && atLeastTwoChasersSuccessful()) {
            setGoal();
            
        }
        return false;
    }

    private boolean atLeastOneBeaterSuccessful() {
        for (Beater beater : beaters) {
            if (beater.isSuccessful()) {
                return true;
            }
        }
        return false;
    }

    private boolean atLeastTwoChasersSuccessful() {
        int successfulChasers = 0;
        for (Chaser chaser : chasers) {
            if (chaser.isSuccessful()) {
                successfulChasers++;
                if (successfulChasers >= 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public int getGoals() {
        return goals;
    }
}