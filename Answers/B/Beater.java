package Quidditch.Answers.B;

import java.util.Random;

public class Beater extends Player {
    public void isSuccessful() {
        Random rand = new Random();
        firstBeaterOfTeam1 = rand.nextInt(100);
        secondBeaterOfTeam1 = rand.nextInt(100);
        firstBeaterOfTeam2 = rand.nextInt(100);
        secondBeaterOfTeam2 = rand.nextInt(100);
    }

    public Beater() {
        isSuccessful();
    }

    public int beater1OfTeam1() {
        if (firstBeaterOfTeam1 <= 40) return successful1OfTeam1 = 1;
        else return successful1OfTeam1 = 0;
    }

    public int beater2OfTeam1() {
        if (secondBeaterOfTeam1 <= 40) return successful2OfTeam1 = 1;
        else return successful2OfTeam1 = 0;
    }

    public int beater1OfTeam2() {
        if (firstBeaterOfTeam2 <= 40) return successful1OfTeam2 = 1;
        else return successful1OfTeam2 = 0;
    }

    public int beater2OfTeam2() {
        if (successful1OfTeam2 <= 40) return successful2OfTeam2 = 1;
        else return successful2OfTeam2 = 0;
    }
}

