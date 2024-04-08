public class Team {

    private Keeper keeper;
    private Seeker seeker;

    private Chaser[] chasers;

    private Beater beater1;
    private Beater beaser2;
    private int goals;

    public Team(Keeper keeper, Seeker seeker, Chaser[] chasers, Beater beater1, Beater beater2) {
        this.keeper = keeper;
        this.seeker = seeker;
        this.chasers = chasers;
        this.beater1 = beater1;
        this.beaser2 = beater2;
        this.goals = 0;

    }


    private void setGoals() {
        goals++;
    }

    private boolean twoChasersSuccess() {
        int count = 0;
        for (Chaser chaser : chasers) {
            if (chaser.isSuccessful()) {
                count++;
            }
            if (count >= 2) {
                return true;
            }
        }
        return false;
    }

    public void play() {
        if (keeper.isSuccessful() && seeker.isSuccessful() && (beater1.isSuccessful() || beaser2.isSuccessful()) && twoChasersSuccess()) {
            setGoals();

        }
    }

    public int getGoals() {
        return goals;
    }
}