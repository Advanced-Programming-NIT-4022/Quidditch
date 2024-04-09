public class Match {
    Team team1 = new Team();

    Team team2 = new Team();

    public void start(){
        team1.play();
        team2.play();
    }
    int goal1 = team1.getGoals();
    int goal2 = team2.getGoals();
}
