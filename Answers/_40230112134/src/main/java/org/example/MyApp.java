package org.example;

public class MyApp {
    public static void main(String[] args)
    {
        Match match = new Match();
        match.Start();

        System.out.println(match.ScoreTeam1);
        System.out.println(match.ScoreTeam2);

        if (match.team1.seeker.isSuccessful() == 1)
        {
            System.out.println("Team1 win");
        }
        else if (match.team2.seeker.isSuccessful() == 1)
        {
            System.out.println("Team2 win");
        }
        else
        {
            if (match.ScoreTeam1 > match.ScoreTeam2)
            {
                System.out.println("Team1 win");
            }
            else if (match.ScoreTeam1 == match.ScoreTeam2)
            {
                System.out.println("Draw");
            }
            else if (match.ScoreTeam1 < match.ScoreTeam2)
            {
                System.out.println("Team2 win");
            }
        }
    }
}
