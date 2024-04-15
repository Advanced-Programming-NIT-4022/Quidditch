class Match {
    private final Team team1;
    private final Team team2;

    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            team1.play();
            team2.play();
        }

        int team1Goals = team1.getGoals();
        int team2Goals = team2.getGoals();

        System.out.println("Team 1 goals: " + team1Goals);
        System.out.println("Team 2 goals: " + team2Goals);

        if (team1Goals == team2Goals) {
            System.out.println("It's a draw!");
        } else if (team1Goals > team2Goals) {
            System.out.println("Team 1 wins!");
        } else {
            System.out.println("Team 2 wins!");
        }
    }
}
