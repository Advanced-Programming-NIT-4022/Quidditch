public class MyApp {
    public static void main(String[] args) {
        // Create players for two teams
        Keeper keeper1 = new Keeper("John", 1);
        Seeker seeker1 = new Seeker("Mike", 2);
        Chaser[] chasers1 = { new Chaser("Alice", 3), new Chaser("Bob", 4), new Chaser("Eve", 5) };
        Beater[] beaters1 = { new Beater("Charlie", 6), new Beater("David", 7) };
        Team team1 = new Team(keeper1, seeker1, chasers1, beaters1);

        Keeper keeper2 = new Keeper("Sarah", 1);
        Seeker seeker2 = new Seeker("Emily", 2);
        Chaser[] chasers2 = { new Chaser("Grace", 3), new Chaser("Henry", 4), new Chaser("Ivy", 5) };
        Beater[] beaters2 = { new Beater("Jack", 6), new Beater("Kelly", 7) };
        Team team2 = new Team(keeper2, seeker2, chasers2, beaters2);

        // Start the match
        Match match = new Match(team1, team2);
        match.start();
    }
}
