package org.example;



public class Match {
    public void Start() {

        Team team1 = new Team();
        team1.keeper.Setname("Ali");
        //all player names can be set....
        Team team2 = new Team();
        team2.keeper.Setname("Kourosh");
        //all player names can be set....
        team1.Play();
        team2.Play();
        if(team1.seeker.isSuccessful)
        {
            System.out.println("///////////////////////////////////////////");
            System.out.println(" team1 found the snitch and won");
            System.out.println("///////////////////////////////////////////");
            return ;
        }
        if(team2.seeker.isSuccessful)
        {
            System.out.println("///////////////////////////////////////////");
            System.out.println(" team2 found the snitch and won");
            System.out.println("///////////////////////////////////////////");
            return ;
        }

        for (int i = 1; i < 100; i++) {
            team1.Play();
            team2.Play();
        }
        System.out.println("///////////////////////////////////////////");
        System.out.println("**************************************");
        System.out.println(" team1 Goals : " + team1.Goal);
        System.out.println(" team2 Goals : " + team2.Goal);
        System.out.println("**************************************");
        if (team1.Goal > team2.Goal) {
            System.out.println(" Result : team1 won");
            System.out.println("///////////////////////////////////////////");
        }
        if (team1.Goal < team2.Goal) {
            System.out.println(" Result : team2 won");
            System.out.println("///////////////////////////////////////////");
        }
        if (team1.Goal == team2.Goal) {
            System.out.println(" Result : draw");
            System.out.println("///////////////////////////////////////////");
        }
    }
}
