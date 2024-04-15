package org.example;

import java.util.Random;

public class Team {
    int goals;
    Seeker teamSeeker;
    Keeper teamKeeper;
    Chaser teamChaser1;
    Chaser teamChaser2;
    Chaser teamChaser3;
    Beater teamBeater1;
    Beater teamBeater2;

    public Team (Seeker teamSeeker,Keeper teamKeeper, Chaser teamChaser1,Chaser teamChaser2,Chaser teamChaser3,Beater teamBeater1,Beater teamBeater2 )
    {
        this.teamBeater1 = teamBeater1;
        this.teamBeater2 = teamBeater2;
        this.teamChaser1 = teamChaser1;
        this.teamChaser2 = teamChaser2;
        this.teamChaser3 = teamChaser3;
        this.teamKeeper = teamKeeper;
        this.teamSeeker = teamSeeker;
        this.goals = 0;

    }
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
