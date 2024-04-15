package org.example;

public class Match extends Team
{
    Team team1 = new Team();
    int ScoreTeam1 = 0;
    int ScoreTeam2 = 0;
    Team team2 = new Team();

    public Match()
    {
        super();
    }

    public void Start()
    {
        for (int i = 0; i < 100; i++)
        {
            team1.play();
            team2.play();
            if (team1.seeker.isSuccessful() == 1)
            {
                ScoreTeam1 += 150;
                break;
            }
            if (team2.seeker.isSuccessful() == 1)
            {
                ScoreTeam2 += 150;
                break;
            }
        }
        for (int i = 0; i < team1.goal; i++)
        {
            ScoreTeam1 +=10;
        }
        for (int i = 0; i < team2.goal; i++)
        {
            ScoreTeam2 +=10;
        }
    }

}
