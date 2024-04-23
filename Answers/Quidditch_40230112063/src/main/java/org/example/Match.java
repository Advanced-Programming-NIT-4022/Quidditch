package org.example;

public class Match {

    Team team1 = new Team();
    Team team2 = new Team();

    public void winner(String winner_team_name, Team team1, Team team2 ) {
        System.out.println("Number of goals , team1 = " + team1.getGoal());
        System.out.println("Number of goals , team2 = " + team2.getGoal());
        System.out.println("Winner : " + winner_team_name);

    }


    public void start() {
        for (int i = 0; i < 100; i++) {
            if (team1.goldenSnitch()) {
                System.out.println("Golden Snitch");
                winner("team1", team1, team2);
                return;
            } else if (team2.goldenSnitch()) {
                System.out.println("Golden Snitch");
                winner("team2", team1, team2);
                return;
            } else {
                team1.play();
                team2.play();
            }
        }

        if (team1.getGoal() > team2.getGoal()) {
            winner("team1", team1, team2);
        } else if (team2.getGoal() > team1.getGoal()) {
            winner("team2", team1, team2);

        } else {
            System.out.println("Number of goals , team1 = " + team1.getGoal());
            System.out.println("Number of goals , team2 = " + team2.getGoal());
            System.out.println("   Draw   ");
        }
    }
}

