package org.example;

import java.sql.SQLOutput;

public class Match {
    Team team1 = new Team();
    Team team2 = new Team();

    public void start ()
    {
        for (int i = 0; i < 100; i++)
        {
            if(team1.teamSeeker.isSuccessful())
            {
                team1.goals += 150;
                System.out.println("team 1 WINS ");
                System.out.println("team 1 score is :"+ team1.goals);
                System.out.println("team 2 score is :"+ team2.goals);
                return;
            }
            if(team2.teamSeeker.isSuccessful())
            {
                team2.goals += 150;
                System.out.println("team 2 WINS ");
                System.out.println("team 1 score is :"+ team1.goals);
                System.out.println("team 2 score is :"+ team2.goals);
                return;
            }
            team1.play();
            team2.play();
        }
        if(team1.goals < team2.goals)
        {
            System.out.println("team 2 WINS ");
            System.out.println("team 1 score is :"+ team1.goals);
            System.out.println("team 2 score is :"+ team2.goals);

        }
        else if(team1.goals > team2.goals)
        {
            System.out.println("team 1 WINS ");
            System.out.println("team 1 score is :"+ team1.goals);
            System.out.println("team 2 score is :"+ team2.goals);

        }
        else
        {
            System.out.println("DRAW");
            System.out.println("team 1 score is :"+ team1.goals);
            System.out.println("team 2 score is :"+ team2.goals);

        }

    }
}