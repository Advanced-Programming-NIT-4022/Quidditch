package org.example;

class Match {
    Team team1;
    Team team2;

    public Match(Team team1, Team team2) {
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
        if (team1.goals > team2.goals) {
            System.out.println("Team 1 wins!");
        } else if (team2.goals > team1.goals) {
            System.out.println("Team 2 wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}