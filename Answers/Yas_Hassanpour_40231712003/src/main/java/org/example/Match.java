package org.example;

public class Match {
    Team team1;
    Team team2;
    public Match(){
        team1= new Team();
        team2= new Team();
    }
    public void start()
    {
        for (int i=0; i<100; i++) {
            team1.play();
            team2.play();
        }
        System.out.println("Team 1: "+ team1.goals);
        System.out.println("Team 2: "+team2.goals);

        if(team1.goals== team2.goals)
        {
            System.out.println("It's a draw!");
        }
        if(team1.goals> team2.goals)
        {
            System.out.println("Team 1 is the winner!");
        }
        if(team1.goals< team2.goals)
        {
            System.out.println("Team 2 is the winner!");
        }
    }

}
