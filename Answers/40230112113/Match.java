public class Match
{
    Team team1 = new Team();
    Team team2 = new Team();

    public void start()
    {
        for(int i=1;i<=100;i++)
        {
            team1.play();
            team1.goals=team1.goals;
            team2.play();
            team2.goals=team2.goals;
            if((team1.caught==true)||(team2.caught==true))
                break;
        }
    }
}
