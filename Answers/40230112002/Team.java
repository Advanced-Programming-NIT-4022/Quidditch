public class Team {

    private Keeper keeper;
    private Seeker seeker;

    private Chaser chaser1;
    private Chaser chaser2;
    private Chaser chaser3;

    private Beater beater1;
    private Beater beaser2;
    private int goals;

    private void setGoals(){
        goals++;
    }

    public void play(){
        if(keeper.isSuccessful() && seeker.isSuccessful() && (beater1.isSuccessful() || beaser2.isSuccessful()) && (chaser1.isSuccessful())|| chaser2.isSuccessful() || chaser3.isSuccessful()){
            setGoals();

        }
    }

}
