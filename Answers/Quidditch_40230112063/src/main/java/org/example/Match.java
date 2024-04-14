package org.example;

import java.util.Objects;

public class Match {

    Team team1 = new Team();
    Team team2 = new Team();

    public void winner(String winner_team_name , Team team1 , Team team2)
    {
        System.out.println("Number of goals , team1 = "+team1.number_of_goals);
        System.out.println("Number of goals , team2 = "+team2.number_of_goals);
        System.out.println("Winner : "+winner_team_name);

    }


    public void start(){
        for (int i=0 ; i<100 ; i++){
            if(Objects.equals(team1.goldenSnitch(), "Golden Snitch")){
                System.out.println("Golden Snitch");
                winner("team1",team1,team2);
                return;
            }
            else if (Objects.equals(team2.goldenSnitch(),"Golden Snitch")){
                System.out.println("Golden Snitch");
                winner("team2",team1,team2);
                return;
            }
            else{
                team1.play();
                team2.play();
            }
        }

        if(team1.number_of_goals>team2.number_of_goals){
            winner("team1",team1,team2);
        }
        else if(team2.number_of_goals>team1.number_of_goals){
            winner("team2",team1,team2);

        }
        else{
            System.out.println("Number of goals , team1 = "+team1.number_of_goals);
            System.out.println("Number of goals , team2 = "+team2.number_of_goals);
            System.out.println("   Draw   ");
        }
    }
}

