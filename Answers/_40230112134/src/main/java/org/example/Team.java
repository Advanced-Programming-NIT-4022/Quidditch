package org.example;

public class Team extends Player
{
    Keeper keeper = new Keeper();
    Seeker seeker;
    Chaser[] chasers;
    Beater[] beaters;
    int goal;

    public void setTeam(Keeper keeper, Seeker seeker, Chaser[] chasers, Beater[] beaters)
    {
        this.keeper = keeper;
        this.seeker = seeker;
        this.chasers = chasers;
        this.beaters = beaters;
        this.goal = 0;
    }
    private void setGoal()
    {
        goal ++;
    }
    public void play()
    {
        int CHCH , BB ;
        int K = keeper.isSuccessful();
        int B1 = beaters[0].isSuccessful();
        int B2 = beaters[1].isSuccessful();
        int CH1 = chasers[0].isSuccessful();
        int CH2 = chasers[1].isSuccessful();
        int CH3 = chasers[2].isSuccessful();
        if ((CH1 == 1 && CH2 == 1 && CH3 == 0) || (CH1 == 1 && CH2 == 0 && CH3 == 1) || (CH1 == 0 && CH2 == 1 && CH3 == 1) || (CH1 == 1 && CH2 == 1 && CH3 == 1))
        {
            CHCH = 1;
        }
        else
        {
            CHCH = 0;
        }
        if ((B1 == 1 && B2 == 0) || (B1 == 1 && B2 == 1) || (B1 == 0 && B2 == 1))
        {
            BB = 1;
        }
        else
        {
            BB = 0;
        }
        if (K ==1 && CHCH == 1 && BB == 1)
        {
            setGoal();
        }
    }
}
