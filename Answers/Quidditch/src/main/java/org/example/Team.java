package org.example;

public class Team {
    int goals=0;
    Seeker teamSeeker = new Seeker();
    Keeper teamKeeper = new Keeper();
    Chaser teamChaser1 = new Chaser();
    Chaser teamChaser2 = new Chaser();
    Chaser teamChaser3 = new Chaser();
    Beater teamBeater1 = new Beater();
    Beater teamBeater2 = new Beater();



    private void setGoals()
    {
        goals ++;
    }



    public void play(){
        if(requiredBeatersSuccess() && requiredChaserSuccess() && teamKeeper.isSuccessful())
        {
            setGoals();
        }
    }
    private boolean requiredBeatersSuccess()
    {

        if(teamBeater1.isSuccessful())
        {
         return true;
        }
        if(teamBeater2.isSuccessful())
        {
         return true;
        }
        else
        {
         return false;
        }
    }
    private boolean requiredChaserSuccess()
    {
        int chaserSuccess = 0;
        if(teamChaser1.isSuccessful())
        {
            chaserSuccess ++;
        }
        if(teamChaser2.isSuccessful())
        {
            chaserSuccess ++;
        }
        if(teamChaser3.isSuccessful())
        {
            chaserSuccess ++;
        }
        if(chaserSuccess >= 2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
