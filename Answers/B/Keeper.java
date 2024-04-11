package Quidditch.Answers.B;

import Quidditch.Answers.B.Player;

import java.util.*;

public class Keeper extends Player {
    @Override
    public void isSuccessful() {
        Random rand = new Random() ;
        firstKeeperOfTeam1 = rand.nextInt(100);
        firstKeeperOfTeam2 = rand.nextInt(100);
    }
    public Keeper(){
        isSuccessful();
    }

    public int keeper1() {
        if (firstKeeperOfTeam1 <= 70) return successful1OfTeam1 = 1;
        else return successful1OfTeam1 = 0;
    }

    public int keeper2() {
        if (firstKeeperOfTeam2 <= 70) return successful1OfTeam2 = 1;
        else return successful1OfTeam2 = 0;
    }
}

