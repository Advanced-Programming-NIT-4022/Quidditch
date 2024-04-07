public class Match {
    private Team team1;
    private Team team2;

    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }



    public void start() {
        for (int i = 0; i < 100; i++) {
            team1.play();
            team2.play();
        }

        System.out.println("Team 1 goals: " + team1.getGoals());
        System.out.println("Team 2 goals: " + team2.getGoals());

        if (team1.getGoals() > team2.getGoals()) {
            System.out.println("Team 1 Wins!");
        } else if (team2.getGoals() > team1.getGoals()) {
            System.out.println("Team 2 Wins!");
        } else {
            System.out.println("Draw!");
        }
    }
}
