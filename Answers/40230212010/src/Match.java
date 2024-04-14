public class Match {
    
    Team team1;
    Team team2;

    Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    void start() {
        for (int i = 0; i < 100; i++) {
            team1.play();
            team2.play();
        }

        int team1Score = team1.getScore();
        int team2Score = team2.getScore();

        System.out.println("Team 1 score: " + team1Score);
        System.out.println("Team 2 score: " + team2Score);

        if (team1Score > team2Score) {
            System.out.println("Team 1 wins!");
        } else if (team2Score > team1Score) {
            System.out.println("Team 2 wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }

}
