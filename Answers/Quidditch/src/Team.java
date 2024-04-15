public class Team {
    Keeper keeper1 = new Keeper();
    Seeker seeker1 = new Seeker();
    Chaser chaser1 = new Chaser();
    Chaser chaser2 = new Chaser();
    Chaser chaser3 = new Chaser();
    Beater beater1 = new Beater();
    Beater beater2 = new Beater();
    int goal = 0;
    private void setGoal(){
        this.goal++;
    }
    public void play(){
        if (seeker1.isSuccessful() == 1) {
            setGoal();
        }
        if (beater1.isSuccessful() + beater2.isSuccessful() >= 1) {
            setGoal();
        }
        if (chaser1.isSuccessful() + chaser2.isSuccessful() + chaser3.isSuccessful() >= 2) {
            setGoal();
        }
    }
}
