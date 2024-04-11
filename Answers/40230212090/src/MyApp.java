public class MyApp
{
    public static void main(String[] args)
    {
        Keeper keeper1 = new Keeper("Keeper1", 1);
        Seeker seeker1 = new Seeker("Seeker1", 2);
        Chaser[] chasers1 = {new Chaser("Chaser1", 3), new Chaser("Chaser2", 4), new Chaser("Chaser3", 5)};
        Beater[] beaters1 = {new Beater("Beater1", 6), new Beater("Beater2", 7)};
        Keeper keeper2 = new Keeper("Keeper2", 8);
        Seeker seeker2 = new Seeker("Seeker2", 9);
        Chaser[] chasers2 = {new Chaser("Chaser4", 10), new Chaser("Chaser5", 11), new Chaser("Chaser6", 12)};
        Beater[] beaters2 = {new Beater("Beater3", 13), new Beater("Beater4", 14)};

        // Creating teams
        Team team1 = new Team(keeper1, seeker1, chasers1, beaters1);
        Team team2 = new Team(keeper2, seeker2, chasers2, beaters2);

        // Creating match and starting
        Match match = new Match(team1, team2);
        match.start();
    }
}
