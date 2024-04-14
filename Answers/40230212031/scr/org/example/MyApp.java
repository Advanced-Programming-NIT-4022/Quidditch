import java.util.ArrayList;
import java.util.List;
public class MyApp {
    public static void main(String[] args) {
        Match match = new Match();

        List<Player> team1Players = new ArrayList<>();
        team1Players.add(new Keeper("Amir", 1));
        team1Players.add(new Seeker("Ali", 2));
        team1Players.add(new Chaser("Danial", 3));
        team1Players.add(new Chaser("Hossein", 4));
        team1Players.add(new Chaser("Sasan", 5));
        team1Players.add(new Beater("mohsen", 6));
        team1Players.add(new Beater("Alireza", 7));

        List<Player> team2Players = new ArrayList<>();
        team2Players.add(new Keeper("Ali", 1));
        team2Players.add(new Seeker("Emad", 2));
        team2Players.add(new Chaser("Arian", 3));
        team2Players.add(new Chaser("Masoud", 4));
        team2Players.add(new Chaser("Mojtaba", 5));
        team2Players.add(new Beater("Sina", 6));
        team2Players.add(new Beater("Soheil", 7));

        Team team1 = new Team(team1Players);
        Team team2 = new Team(team2Players);


        match.setTeam1(team1);
        match.setTeam2(team2);

        match.start();
    }
}
