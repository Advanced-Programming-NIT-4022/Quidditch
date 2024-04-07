public class Team {
    int goals=0;
    Beater beater1 = new Beater();
    Beater beater2 = new Beater();
    Chaser chaser1 = new Chaser();
    Chaser chaser2 = new Chaser();
    Chaser chaser3 = new Chaser();
    Keeper keeper = new Keeper();
    Seeker seeker = new Seeker();
    public int setGoal (int goals){
        return (goals+1);
    }
    public void play (){
        if (keeper.isSuccessful() && (beater1.isSuccessful() || beater2.isSuccessful()) && ( (chaser1.isSuccessful() || chaser2.isSuccessful() ) || (chaser1.isSuccessful() || chaser3.isSuccessful() ) || (chaser2.isSuccessful() || chaser3.isSuccessful() ) ) )
            goals=setGoal(goals);
    }
    public int getGoals (){
        return goals;
    }
}
