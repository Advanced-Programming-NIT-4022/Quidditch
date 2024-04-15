package org.example;

public class MyApp {
    public static void main(String[] args) {
        int goals1 = 0;
        int goals2 = 0;
        Keeper keeper1 = new Keeper("Harry", 1);
        Seeker seeker1 = new Seeker("Ron", 2);
        Chaser[] chasers1 = {new Chaser("Ginny", 3), new Chaser("Katie", 4), new Chaser("Angelina", 5)};
        Beater[] beaters1 = {new Beater("Oliver", 6), new Beater("Fred", 7)};
        Team team1 = new Team(keeper1, seeker1, chasers1, beaters1, goals1);

        Keeper keeper2 = new Keeper("Draco", 1);
        Seeker seeker2 = new Seeker("Marcus", 2);
        Chaser[] chasers2 = {new Chaser("Adrian", 3), new Chaser("Vincent", 4), new Chaser("Trence", 5)};
        Beater[] beaters2 = {new Beater("Miles", 6), new Beater("Andrew", 7)};
        Team team2 = new Team(keeper1, seeker1, chasers1, beaters1, goals2);

        Match match = new Match(team1, team2);
        match.start();
    }
}
