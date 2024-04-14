public class Team {
    public int goals=0;
    public boolean won=false;
    Keeper keeper;
    Seeker seeker;
    Beater beater1,beater2;
    Chaser chaser1,chaser2,chaser3;
    public void setGoal(){
        goals++;
    }
    public void Play(){
        if(seeker.isSuccessful()){
            won=true;
            goals+=150;
        }
        if(keeper.isSuccessful() && (beater1.isSuccessful() || beater2.isSuccessful()) && (chaser1.isSuccessful()?
                chaser2.isSuccessful()&&chaser3.isSuccessful() : chaser2.isSuccessful()||chaser3.isSuccessful()) ){
            setGoal();
        }
    }
    public Team(Beater[] beaters,Chaser[] chasers,Seeker seeker,Keeper keeper){
        this.beater1=beaters[0];
        this.beater2=beaters[1];
        this.seeker=seeker;
        this.chaser1=chasers[0];
        this.chaser2=chasers[1];
        this.chaser3=chasers[2];
        this.keeper=keeper;
    }
    public Team(){
        this.beater1=new Beater();
        this.beater2=new Beater();
        this.seeker=new Seeker("abol","09394242609");
        this.chaser1=new Chaser();
        this.chaser2=new Chaser();
        this.chaser3=new Chaser();
        this.keeper=new Keeper("sadra","091231");
    }
    public void reset(){
        goals=0;
        won=false;
    }
}
