public class Main {
    public static void main(String[] args) {
        Keeper keeper1 = new Keeper("Keeper 1", 1);
        Seeker seeker1 = new Seeker("Seeker 1", 1);
        Chaser[] chasers1 = {new Chaser("Chaser 1", 1), new Chaser("Chaser 1", 2), new Chaser("Chaser 1", 3)};
        Beater[] beaters1 = {new Beater("Beater 1", 1), new Beater("Beater 1", 2)};
        team team1 = new team(keeper1, seeker1, chasers1, beaters1);
//first team have one keeper & one seeker & two beater & three chaser
        Keeper keeper2 = new Keeper("Keeper 2", 1);
        Seeker seeker2 = new Seeker("Seeker 2", 1);
        Chaser[] chasers2 = {new Chaser("Chaser 2", 1), new Chaser("Chaser 2", 2), new Chaser("Chaser 2", 3)};
        Beater[] beaters2 = {new Beater("Beater 2", 1), new Beater("Beater 2", 2)};
        team team2 = new team(keeper2, seeker2, chasers2, beaters2);
//second team have one keeper & one seeker & two beater & three chaser
        Match match = new Match(team1, team2);
        match.start();
    }
}
