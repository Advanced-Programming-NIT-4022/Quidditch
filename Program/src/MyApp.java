public class MyApp {
    public static void main(String[] args) {
        // Creating players for team 1
        Keeper keeper1 = new Keeper("Keeper 1", 1);
        Seeker seeker1 = new Seeker("Seeker 1", 2);
        Chaser[] chasers1 = {new Chaser("Chaser 1", 3), new Chaser("Chaser 2", 4),
                new Chaser("Chaser 3", 5)};
        Beater[] beaters1 = {new Beater("Beater 1", 6),
                new Beater("Beater 2", 7)};
        Team team1 = new Team(keeper1, seeker1, chasers1, beaters1);

        // Creating players for team 2
        Keeper keeper2 = new Keeper("Keeper 2", 1);
        Seeker seeker2 = new Seeker("Seeker 2", 2);
        Chaser[] chasers2 = {new Chaser("Chaser 4", 3), new Chaser("Chaser 5", 4),
                new Chaser("Chaser 6", 5)};
        Beater[] beaters2 = {new Beater("Beater 3", 6),
                new Beater("Beater 4", 7)};
        Team team2 = new Team(keeper2, seeker2, chasers2, beaters2);

        // Starting the match
        Match match = new Match(team1, team2);
        match.start();
    }
}