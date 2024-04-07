package org.example;

import java.sql.SQLOutput;

public class Match {
    public void Start() {

        Team team1 = new Team();
        Team team2 = new Team();
        for (int i = 0; i < 100; i++) {
            team1.Play();
            team2.Play();
        }
        System.out.println(" team1 Goals : " + team1.Goal);
        System.out.println(" team2 Goals : " + team2.Goal);
        if(team1.Goal>team2.Goal)
        {
            System.out.println(" Resault : team1 won");
        }
        if(team1.Goal<team2.Goal)
        {
            System.out.println(" Resault : team2 won");
        }
        if(team1.Goal==team2.Goal)
        {
            System.out.println(" Resault : draw");
        }
    }
}
