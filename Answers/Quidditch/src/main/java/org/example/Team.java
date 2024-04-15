package org.example;

public class Team {
    int goals=0;
    Seeker teamSeeker;
    Keeper teamKeeper;
    Chaser teamChaser1;
    Chaser teamChaser2;
    Chaser teamChaser3;
    Beater teamBeater1;
    Beater teamBeater2;



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
