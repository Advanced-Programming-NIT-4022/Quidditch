package org.example;



public class Match {
    public void Start() {

        Team team1 = new Team();
        Team team2 = new Team();

        for (int i = 0; i < 100; i++) {
            team1.Play();
            team2.Play();
        }
        if (team1.seeker.isSuccessful) {
            System.out.println(" Resault : seeker of team1 found the snitch and team1 won");
            return;
        }
        if (team2.seeker.isSuccessful) {
            System.out.println(" Resault : seeker of team2 found the snitch and team2 won");
            return;
        }
        System.out.println("**************************************");
        System.out.println(" team1 Goals : " + team1.Goal);
        System.out.println(" team2 Goals : " + team2.Goal);
        System.out.println("**************************************");
        if (team1.Goal > team2.Goal) {
            System.out.println(" Resault : team1 won");
            System.out.println("**************************************");
        }
        if (team1.Goal < team2.Goal) {
            System.out.println(" Resault : team2 won");
            System.out.println("**************************************");
        }
        if (team1.Goal == team2.Goal) {
            System.out.println(" Resault : draw");
            System.out.println("**************************************");
        }
    }
}
