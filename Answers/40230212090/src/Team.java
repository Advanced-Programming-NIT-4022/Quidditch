public class Team
{
    private Keeper keeper;
    private Seeker seeker;
    private Chaser[] chasers; // 3 players so set them in array
    private Beater[] beaters; // 2 players so set them in array
    private int goals;

    public Team(Keeper keeper, Seeker seeker, Chaser[] chasers, Beater[] beaters) // create a constructor to set them at first
    {
        this.keeper = keeper;
        this.seeker = seeker;
        this.chasers = chasers;
        this.beaters = beaters;
        this.goals = 0;
    }
    public void setGoal()
    {
        goals++; // goals = goals + 1
    }


    public void play()
    {
        /*
        اینجوری نوشتن کلا غلطه به دلیل اینکه کل اینا اگه صحیح باشه باید یدونه گل حساب شه نه اینکه هر دونه ایی که درست بود یه گل واسه خودش زده شه
        if (keeper.isSuccessful() == true)
        {
            setGoal();
        }
        /*
        //اینجوری نوشتن غلطه چون هر beater ایی که موفق شد یه گل حساب میکنه مثلا اگه هر سه بیتر موفق شده باشن 3 گل حساب میکنه که اینجوری غلطه
        for (int i = 0 ; i < beaters.length ; i++)
        {
            if (beaters[i].isSuccessful() == true)
            {
                setGoal();
            }
        }
        //چون گفته حداقل باید دو chaser در بازی موفق شوند تا گل زده شود پس باید بشریم اول
        int countOfChaserSuccess = 0;
        for (int i = 0 ; i < chasers.length ; i++)
        {
           if (chasers[i].isSuccessful() == true)
           {
               countOfChaserSuccess++;
           }
        }
        if (countOfChaserSuccess >= 2)
        {
            setGoal();
        }
        */

        int countOfBeaterSuccess = 0;
        for (int i = 0 ; i < beaters.length ; i++)
        {
            if (beaters[i].isSuccessful() == true)
            {
                countOfBeaterSuccess++;
            }
        }

        int countOfChaserSuccess = 0;
        for (int i = 0 ; i < chasers.length ; i++)
        {
            if (chasers[i].isSuccessful() == true)
            {
                countOfChaserSuccess++;
            }
        }

        if (keeper.isSuccessful() && countOfBeaterSuccess >= 1 && countOfChaserSuccess >= 2)
        {
            setGoal();
        }

        if (seeker.isSuccessful() == true)
        {
            System.out.println("Golden Snitch found! Team " + seeker.getName() + " wins!");
            System.exit(0);
        }

    }
    public int getGoals()
    {
    return goals;
    }
}
