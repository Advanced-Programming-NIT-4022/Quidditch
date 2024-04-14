package Answers;
import Answers.team;
public class Match {
    team team1;
    team team2;
    Match(team team1, team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }
    public void start() {
        for (int i = 0; i < 100; i++) {
            team1.play();
            team2.play();
        }
        System.out.println("Team 1 goals: " + team1.goals);
        System.out.println("Team 2 goals: " + team2.goals);

        if (team1.seeker.isSuccessful()) {
            System.out.println("Team 1 wins with the golden snitch!");
        } else if (team2.seeker.isSuccessful()) {
            System.out.println("Team 2 wins with the golden snitch!");
        } else {
            if (team1.goals > team2.goals) {
                System.out.println("Team 1 wins!");
            } else if (team2.goals > team1.goals) {
                System.out.println("Team 2 wins!");
            } else {
                System.out.println("It's equal!");
            }
        }
    }
}
