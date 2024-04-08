public class Team {
    private Keeper kpr;
    private Seeker skr;
    private Beater b1, b2;
    private Chaser ch1, ch2, ch3;
    private int goal;
    public Team()
    {
        this.skr = new Seeker(5);
        this.ch1 = new Chaser(30);
        this.ch2 = new Chaser(30);
        this.ch3 = new Chaser(30);
        this.b1 = new Beater(40);
        this.b2 = new Beater(40);
        this.kpr = new Keeper(70);
        this.goal = 0;
    }

    private void setGoal()
    {
        this.goal++;
    }

    public boolean instantWin()
    {
        if(skr.isSuccessful())
        {
            this.goal = 150;
            return true;
        }
        return false;

    }



    public void play(){
        if(kpr.isSuccessful() && (b1.isSuccessful() || b2.isSuccessful())&& ((ch1.isSuccessful() && ch2.isSuccessful()) || (ch1.isSuccessful() && ch3.isSuccessful()) || (ch2.isSuccessful()&&ch3.isSuccessful())))
        {
            setGoal();
            return;
        }
    }

    public int getScore()
    {
        return this.goal;
    }

}
