public class Team
{
    Beater B = new Beater();
    Seeker S = new Seeker();
    Keeper K = new Keeper();
    Chaser C = new Chaser();

    public void play()
    {
        if((B.isSuccessful()==true)&&(K.isSuccessful()==true)&&(C.isSuccessful()==true))
            setGoal();
        if(S.isSuccessful())
            SeekerScores();
    }

    int goals;

    public void setGoal()
    {
        goals++;
    }
    
    Boolean caught=false;

    public void SeekerScores()
    {
        goals+=150;
        caught=true;
    }
}
