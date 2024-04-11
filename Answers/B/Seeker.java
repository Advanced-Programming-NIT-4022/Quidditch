package Quidditch.Answers.B;

import Quidditch.Answers.B.Player;

import java.util.Random;

public class Seeker extends Player {


    public void isSuccessful() {
        Random rand = new Random();
        firstSeekerOfTeam1 = rand.nextInt(100);
        firstSeekerOfTeam2 = rand.nextInt(100);
    }

    public Seeker() {
        isSuccessful();
    }

    public int seeker1() {
        if (firstSeekerOfTeam1 <= 5) return successful1OfTeam1 = 1;
        else return successful1OfTeam1 = 0;
    }

    public int seeker2() {
        if (firstSeekerOfTeam2 <= 5) return successful1OfTeam2 = 1;
        else return successful1OfTeam2 = 0;
    }
}
