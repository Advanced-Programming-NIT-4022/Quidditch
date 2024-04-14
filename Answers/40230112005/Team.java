public class Team {
    private int goal=0;
    Keeper keeper1= new Keeper();
    Chaser chaser1=new Chaser();
    Chaser chaser2=new Chaser();
    Chaser chaser3=new Chaser();
    Beater beater1=new Beater();
    Beater beater2=new Beater();
    Seeker seeker1=new Seeker();

    private void setGoal(){
        goal++;
    }

    void Play() {
        int chasercounter = 0;
        if (chaser1.isSuccessful()) {
            chasercounter++;
        }
        if (chaser2.isSuccessful()) {
            chasercounter++;
        }
        if (chaser3.isSuccessful()) {
            chasercounter++;
        }
        if (chasercounter > 1 && (beater1.isSuccessful() || beater2.isSuccessful()) && keeper1.isSuccessful()) {
            goal++;
        }
        if (seeker1.isSuccessful()) {
            goal += 150;
        }
    }
        public int score(){
            return goal;
    }
}