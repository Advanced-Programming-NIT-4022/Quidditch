package org.example;
import java.lang.Math;
public class Match {
    Team team1 = new Team();
    Team team2 = new Team();
    public void start(){
        for (int i = 0; i < 100; i++) {
            team1.play();
            team2.play();
        }
        System.out.format("Team1 =  %d\n", team1.numberOfGoals);
        System.out.format("Team2 =  %d\n", team2.numberOfGoals);
        if (team1.findsGoldenSnitch){
            System.out.println("Team1 finds the golden snitch & won.");
        }
        else if(team2.findsGoldenSnitch){
            System.out.println("Team2 finds the golden snitch & won.");
        }
        else {
            if (team1.numberOfGoals > team2.numberOfGoals) {
                System.out.println("Result: Team1 won.");
            } else if (team2.numberOfGoals > team1.numberOfGoals) {
                System.out.println("Result: Team2 won.");
            } else if (team1.numberOfGoals == team2.numberOfGoals) {
                System.out.println(" Result: draw");
            }
        }
    }
}
