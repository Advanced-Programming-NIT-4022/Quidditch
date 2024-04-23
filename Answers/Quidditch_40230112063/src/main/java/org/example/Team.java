package org.example;

public class Team {

    private Keeper keeper;
    private Seeker seeker;
    private Chaser chaser1;
    private Chaser chaser2;
    private Chaser chaser3;
    private Beater beater1;
    private Beater beater2;
    private int number_of_goals;

    public Team() {
        this.keeper = new Keeper("keeper", 1, 70);
        this.seeker = new Seeker("seeker", 1, 5);
        this.chaser1 = new Chaser("chaser", 1, 30);
        this.chaser2 = new Chaser("chaser", 2, 30);
        this.chaser3 = new Chaser("chaser", 3, 30);
        this.beater1 = new Beater("beater", 1, 40);
        this.beater2 = new Beater("beater", 2, 40);
        this.number_of_goals = 0;
    }

    private void setGoal() {
        number_of_goals++;
    }

    public int getGoal() {
        return number_of_goals;
    }


    public boolean goldenSnitch() {
        if (seeker.isSuccessful()) {
            number_of_goals += 150;
            return true;
        }
        return false;
    }


    public void play() {

        if (keeper.isSuccessful() &&
                (beater1.isSuccessful() || beater2.isSuccessful()) &&
                ((chaser1.isSuccessful() && chaser2.isSuccessful()) || (chaser1.isSuccessful() && chaser3.isSuccessful())
                        || (chaser2.isSuccessful() && chaser3.isSuccessful()))) {
            setGoal();
        }
    }
}
