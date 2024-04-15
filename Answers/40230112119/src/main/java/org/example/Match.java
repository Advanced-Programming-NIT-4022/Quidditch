package org.example;

public class Match {
    Team team1;
    Team team2;
    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }
    public void start() {
        int team1score = team1.numGoals;
        int team2score = team2.numGoals;

        for (int i = 0; i < 100; i++) {
            team1.play();
            if (team1.seeker.isSuccessful()) {
                team1score += 150;
                break;
            }
            team2.play();
            if (team2.seeker.isSuccessful()) {
                team2score += 150;
                break;
            }
        }
        for (int i = 0; i < team1.numGoals; i++) {
            team1score += 10;
        }
        for (int i = 0; i < team2.numGoals; i++) {
            team2score += 10;
        }

        System.out.println("Team one score:  " + team1score);
        System.out.println("Team two score:  " + team2score);
        if (team1score > team2score)
            System.out.println("TEAM ONE WINS!!!");
        else if (team1score < team2score)
            System.out.println("TEAM TWO WINS!!!");
        else
            System.out.println("There's no winner!");
    }

}
