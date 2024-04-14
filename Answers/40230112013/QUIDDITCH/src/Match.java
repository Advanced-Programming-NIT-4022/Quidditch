public class Match {
    public void Start() {
        Team team1 = new Team();
        Team team2 = new Team();
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                team1.Play();
                team2.Play();
            }
            if (i % 2 == 1) {
                team2.Play();
                team1.Play();
            }
        }
        if (team1.seeker.isSuccessful()) {
            System.out.println("The Snitch was found by team_1 and they won.");
            return;
        }
        if (team2.seeker.isSuccessful()) {
            System.out.println("The Snitch was found by team_2 and they won.");
            return;
        }

        System.out.println("--------------------------------");
        System.out.println(" team1 Goals : " + team1.Goal);
        System.out.println(" team2 Goals : " + team2.Goal);
        System.out.println("--------------------------------");
        if (team1.Goal > team2.Goal) {
            System.out.println("team1 won");
            System.out.println("--------------------------------");
        }
        if (team1.Goal < team2.Goal) {
            System.out.println("team2 won");
            System.out.println("--------------------------------");
        }
        if (team1.Goal == team2.Goal) {
            System.out.println(" Result : draw");
            System.out.println("--------------------------------");
        }
    }
}
