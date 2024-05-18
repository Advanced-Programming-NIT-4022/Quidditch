public class MyApp {
    public static void main(String[] args) {
        Keeper keep1 = new Keeper("Keeper1" , 1);
        Seeker seek1 = new Seeker("Seeker1" , 2);
        Chaser[] chasers1 = {
                new Chaser("Chaser1" , 3) , new Chaser("Chaser2" , 4) , new Chaser("Chaser3" , 5)
        };
        Beater[] beaters1 = {
                new Beater("Beater1", 6), new Beater("Beater2", 7)
        };
        Keeper keeper2 = new Keeper("Keeper2", 8);
        Seeker seeker2 = new Seeker("Seeker2", 9);
        Chaser[] chasers2 = {
                new Chaser("Chaser4", 10), new Chaser("Chaser5", 11), new Chaser("Chaser6", 12)
        };
        Beater[] beaters2 = {
                new Beater("Beater3", 13), new Beater("Beater4", 14)
        };

        Team team1 = new Team(keep1, seek1, chasers1, beaters1);
        Team team2 = new Team(keeper2, seeker2, chasers2, beaters2);

        Match match = new Match(team1, team2);
        for(int i=0 ; i<100 ; i++){
            System.out.println("Match " + (i + 1) + ":");
            match.start();
            System.out.println();
        }
    }
}
