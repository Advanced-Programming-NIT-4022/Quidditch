package Quidditch.Answers.B;

public class Match {
    Team team = new Team();

    public Match() {
        System.out.print("first team: ");
        System.out.println(team.myTeam1);
        System.out.print("second team: ");
        System.out.println(team.myTeam2);
    }

    public void start() {
        team.play();
    }

}
