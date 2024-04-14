public class Team
{
    Beater B1;
    Beater B2;
    Seeker S ; 
    Keeper K ;
    Chaser C1;
    Chaser C2;
    Chaser C3;

    int goals;

    public Team(Beater B1,Beater B2,Seeker S,Keeper K,Chaser C1,Chaser C2,Chaser C3)
    {
        this.B1=B1;
        this.B2=B2;
        this.S=S;
        this.K=K;
        this.C1=C1;
        this.C2=C2;
        this.C3=C3;
        this.goals=0;
    }

    public void play()
    {
        if (K.isSuccessful())
            if((B1.isSuccessful())||(B2.isSuccessful()))
                if((C1.isSuccessful()&&C2.isSuccessful())||(C1.isSuccessful()&&C3.isSuccessful())||(C2.isSuccessful()&&C3.isSuccessful()))
                    setGoal();
        if(S.isSuccessful())
            SeekerScores();

    }

    public void setGoal()
    {
        this.goals++;
    }
    
    Boolean caught=false;

    public void SeekerScores()
    {
        this.goals+=150;
        caught=true;
    }
}
