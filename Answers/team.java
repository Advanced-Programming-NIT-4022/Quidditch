package Answers;

public class team {
    Keeper keeper;
    Seeker seeker;
    Chaser[] chasers;
    Beater[] beaters;
    int goals;
    team(Keeper keeper, Seeker seeker, Chaser[] chasers, Beater[] beaters) {
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
        boolean ksuccess = keeper.isSuccessful();
        boolean bsuccess = false;
        for (Beater beater : beaters) {
            if (beater.isSuccessful()) {
                bsuccess = true;
                break;
            }
        }
        int chsuccess = 0;
        for (Chaser chaser : chasers) {
            if (chaser.isSuccessful()) {
                chsuccess++;
            }
        }
        if (ksuccess && bsuccess && chsuccess >= 2) {
            setGoal();
        }
    }
}
