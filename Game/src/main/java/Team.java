public class Team {
    private Keeper keeper;
    private Seeker seeker;
    private Chaser[] chasers;
    private Beater[] beaters;
    private int goal;
    public Team (Keeper keeper , Seeker seeker , Chaser[] chasers , Beater[] beaters){
        this.keeper = keeper;
        this.seeker = seeker;
        this.chasers = chasers;
        this.beaters = beaters;
        this.goal = 0;
    }
    private void setGoal(){
        goal++;
    }
    public int getgoal(){
        return goal;
    }
    public Seeker getseek(){
        return seeker;
    }
    public void plays(){
        int successchase = 0;
        int successbeat = 0;
        for(Chaser chaser : chasers)
            if(chaser.isSuccessful())
                successchase++;
        for(Beater beater : beaters)
            if(beater.isSuccessful())
                successbeat++;
        if(keeper.isSuccessful() && successchase > 2 && successbeat > 1){
            setGoal();
        }
    }
}
