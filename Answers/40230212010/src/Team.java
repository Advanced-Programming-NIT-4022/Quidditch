class Team {
    private Keeper keeper;
    private Seeker seeker;
    private Chaser[] chasers;
    private Beater[] beaters;
    private int goals = 0;

    public Team(String teamName) {
        // Initialize players with example names and numbers
        keeper = new Keeper(teamName + " Keeper", 1);
        seeker = new Seeker(teamName + " Seeker", 2);
        chasers = new Chaser[]{
            new Chaser(teamName + " Chaser1", 3),
            new Chaser(teamName + " Chaser2", 4),
            new Chaser(teamName + " Chaser3", 5)
        };
        beaters = new Beater[]{
            new Beater(teamName + " Beater1", 6),
            new Beater(teamName + " Beater2", 7)
        };
    }

    private void setGoal() {
        this.goals++;
    }

    public void play() {
        // Check conditions and set goal if met
        if (keeper.isSuccessful() && 
            (beaters[0].isSuccessful() || beaters[1].isSuccessful()) &&
            (chasers[0].isSuccessful() && chasers[1].isSuccessful() || chasers[1].isSuccessful() && chasers[2].isSuccessful() || chasers[0].isSuccessful() && chasers[2].isSuccessful())) {
            setGoal();
        }
    }

    public int getGoals() {
        return goals;
    }

    public boolean hasSeekerCaughtSnitch() {
        return seeker.isSuccessful();
    }
}