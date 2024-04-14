class Match {
    private Team team1;
    private Team team2;
    private int rounds;

    public Match(Team team1, Team team2, int rounds) {
        this.team1 = team1;
        this.team2 = team2;
        this.rounds = rounds;
    }

    public void start() {
        for (int i = 0; i < rounds; i++) {
            System.out.println("Round " + (i + 1) + " begins:");
            
            if (team1.play()) {
                System.out.println("Team 1 wins with " + team1.getGoals() + " goals!");
                return;
            }
            team2.play();
            if (team2.play()) {
                System.out.println("Team 2 wins with " + team2.getGoals() + " goals!");
                return;
            }
            System.out.println("End of Round " + (i + 1) + "\n");
        }

        System.out.println("Final scores:");
        System.out.println("Team 1 goals: " + team1.getGoals());
        System.out.println("Team 2 goals: " + team2.getGoals());
        if (team1.getGoals() == team2.getGoals()) {
            System.out.println("It's a draw!");
        } else {
            Team winner = (team1.getGoals() > team2.getGoals()) ? team1 : team2;
            System.out.println("Winner: Team " + ((winner == team1) ? "1" : "2"));
        }
    }
}