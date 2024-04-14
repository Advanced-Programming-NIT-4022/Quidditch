package org.example;

public class Team
{
    Keeper keeper;
    Seeker seeker;
    Chaser[] chasers = new Chaser[3];
    Beater[] beaters = new Beater[2];
    int goal;

    public Team()
    {
        super();
        this.keeper = new Keeper("hosein" , 6);
        this.seeker = new Seeker("hasan",5);
        this.chasers[0] = new Chaser("amir",3);
        this.chasers[1] = new Chaser("harry",10);
        this.chasers[2] = new Chaser("tom",2);
        this.beaters[0] = new Beater("ALI",1);
        this.beaters[1] = new Beater("AmirAli",15);
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
        if (K == 1 && CHCH == 1 && BB == 1)
        {
            setGoal();
        }
    }
}
