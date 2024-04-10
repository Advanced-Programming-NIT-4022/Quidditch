package Quidditch.Answers.B;



import java.util.ArrayList;
import java.util.Arrays;

public class Team extends Player {
    public int goal1 = 0;
    public int goal2 = 0;
    public ArrayList<String> myTeam1 = new ArrayList<>(Arrays.asList("The first keeper", "The first seeker", "The first chaser", "The second chaser",
            "The third chaser", "The first beater", "The second beater"));
    public ArrayList<String> myTeam2 = new ArrayList<>(Arrays.asList("The second keeper", "The second seeker", "The fourth chaser", "The fifth chaser",
            "The sixth chaser", "The third beater", "The fourth beater"));

    public int getGoal1() {
        return goal1;
    }

    public int getGoal2() {
        return goal2;
    }

    private void setGoal1(int goal1) {
        this.goal1 = goal1;
    }

    private void setGoal2(int goal2) {
        this.goal2 = goal2;
    }

    public void play() {
        for (int i = 0; i < 100; i++) {
            Keeper keeper = new Keeper();
            Seeker seeker = new Seeker();
            Chaser chaser = new Chaser();
            Beater beater = new Beater();

            if (keeper.keeper1() == 1 && (beater.beater1OfTeam1() == 1 || beater.beater2OfTeam1() == 1)
                    && (chaser.chaser1OfTeam1() == 1 && (chaser.chaser2OfTeam1() == 1 || chaser.chaser3OfTeam1() == 1))) {
                goal1++;
                setGoal1(goal1);
            }
            if (keeper.keeper2() == 1 && (beater.beater1OfTeam2() == 1 || beater.beater2OfTeam2() == 1)
                    && (chaser.chaser1OfTeam2() == 1 && (chaser.chaser2OfTeam2() == 1 || chaser.chaser3OfTeam2() == 1))) {
                goal2++;
                setGoal2(goal2);
            }

            if (seeker.seeker1() == 1 && seeker.seeker2() == 1) {
            } else if (seeker.seeker1() == 1 && seeker.seeker2() == 0) {
                goal1 += 150;
                break;
            } else if (seeker.seeker2() == 1 && seeker.seeker1() == 0) {
                goal2 += 150;
                break;
            }
        }
        int Number1 = getGoal1();
        int Number2 = getGoal2();
        System.out.println("Scoreboard:" + "\n");
        System.out.print("First team: ");
        System.out.println(getGoal1());
        System.out.print("Second team: ");
        System.out.println(getGoal2());
        System.out.println("--------------------------------");
        if (Number1 > Number2) {
            System.out.println("The winner of the game is the first team.");
        } else if (Number1 < Number2) {
            System.out.println("The winner of the game is the second team.");
        } else if (Number1 == Number2) {
            System.out.println("The game ended with a draw.");
        }
    }
}

