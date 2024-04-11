package Quidditch.Answers.B;

import Quidditch.Answers.B.Player;

import java.util.Random;

public class Chaser extends Player {
    public void isSuccessful() {
        Random rand = new Random();
        firstChaserOfTeam1 = rand.nextInt(100);
        secondChaserOfTeam1 = rand.nextInt(100);
        thirdChaserOfTeam1 = rand.nextInt(100);
        firstChaserOfTeam2 = rand.nextInt(100);
        secondChaserOfTeam2 = rand.nextInt(100);
        thirdChaserOfTeam2 = rand.nextInt(100);
    }

    public Chaser() {
        isSuccessful();
    }

    public int chaser1OfTeam1() {
        if (firstChaserOfTeam1 <= 30) return successful1OfTeam1 = 1;
        else return successful1OfTeam1 = 0;
    }

    public int chaser2OfTeam1() {
        if (secondChaserOfTeam1 <= 30) return successful2OfTeam1 = 1;
        else return successful2OfTeam1 = 0;
    }

    public int chaser3OfTeam1() {
        if (thirdChaserOfTeam1 <= 30) return successful3OfTeam1 = 1;
        else return successful2OfTeam1 = 0;
    }

    public int chaser1OfTeam2() {
        if (firstChaserOfTeam2 <= 30) return successful1OfTeam2 = 1;
        else return successful1OfTeam2 = 0;
    }

    public int chaser2OfTeam2() {
        if (secondChaserOfTeam2 <= 30) return successful2OfTeam2 = 1;
        else return successful2OfTeam2 = 0;
    }

    public int chaser3OfTeam2() {
        if (thirdChaserOfTeam2 <= 30) return successful3OfTeam2 = 1;
        else return successful3OfTeam2 = 0;
    }
}