package org.quidditch;

public class MyApp {
    public static void main(String[] args) {
        String team1Name = "Gryffindor";
        String[] team1PlayerNames = {"Steve", "ali", "asghar", "hamid", "zahra", "navid", "yasamin"};
        String team2Name = "Slytherins";
        String[] team2PlayerNames = {"Garry", "Bob", "Sara", "Jack", "Kenshi", "Oliver", "Emma"};
        Match match = new Match(team1Name, team1PlayerNames, team2Name, team2PlayerNames);
        match.start();
    }
}
