
public class Team {
    Beater beater1 = new Beater();
    Beater beater2 = new Beater();
    Keeper keeper = new Keeper();
    Seeker seeker = new Seeker();
    Chaser chaser1 = new Chaser();
    Chaser chaser2 = new Chaser();
    Chaser chaser3 = new Chaser();
    int Goal = 0;

    void setGoal() {
        Goal++;
    }
    //طبق قوانین و اتفاق افتادن تمام حالات برای یک گل
    void Play() {
        boolean Beatersuccess = (beater1.isSuccessful() || beater2.isSuccessful());
        boolean chasersuccess = ((chaser1.isSuccessful() && chaser2.isSuccessful())
                || (chaser1.isSuccessful() && chaser3.isSuccessful())
                || (chaser2.isSuccessful() && chaser3.isSuccessful()));
        if (keeper.isSuccessful() && Beatersuccess && chasersuccess) {
            setGoal();
        }
    }

}
