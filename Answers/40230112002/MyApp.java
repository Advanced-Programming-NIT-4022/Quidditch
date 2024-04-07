public class MyApp {
    public static void main(String[] args) {
        Keeper keeper1 = new Keeper();
        Seeker seeker1 = new Seeker();
        Chaser[] chasers1 = {new Chaser(), new Chaser(), new Chaser()};
        Beater beater1 = new Beater();
        Beater beater2 = new Beater();

        Team team1 = new Team(keeper1, seeker1, chasers1, beater1 , beater2);

        Keeper keeper2 = new Keeper();
        Seeker seeker2 = new Seeker();
        Chaser[] chasers2 = {new Chaser(), new Chaser(), new Chaser()};
        Beater beaters1 = new Beater();
        Beater beaters2 = new Beater();

        Team team2 = new Team(keeper2, seeker2, chasers2, beaters1 , beaters2);

        Match match = new Match(team1 , team2);
        match.start();
    }

}
