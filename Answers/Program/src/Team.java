class Team {
    private final Keeper keeper;
    private final Seeker seeker;
    private final Chaser[] chasers;
    private final Beater[] beaters;
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

    public void play() {
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

        if (seeker.isSuccessful()) {
            System.out.println("Seeker found the golden snitch!");
            goals += 150;
        }
    }

    public int getGoals() {
        return goals;
    }
}