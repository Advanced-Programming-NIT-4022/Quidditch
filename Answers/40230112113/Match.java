public class Match
{
    Team team1;
    Team team2;

    public Match(Team team1,Team team2)
    {
        this.team1=team1;
        this.team2=team2;
    }

    public void start()
    {
        for(int i=1;i<=100;i++)
        {
            team1.play();
            team2.play();
            if((team1.caught==true)||(team2.caught==true))
                break;
        }
    }
}
