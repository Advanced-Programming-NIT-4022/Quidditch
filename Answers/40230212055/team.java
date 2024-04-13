package tamrin3_AP;

import java.util.Scanner;

public class team {

    int goal_team1 = 0;
    int goal_team2 = 0;


    player seeker1 = new Seeker();
    player keeper1 = new Keeper();
    player chaser11 = new Chaser();
    player chaser12 = new Chaser();
    player chaser13 = new Chaser();
    player beater11 = new beater();
    player beater12 = new beater();


    player seeker2 = new Seeker();
    player keeper2 = new Keeper();
    player chaser21 = new Chaser();
    player chaser22 = new Chaser();
    player chaser23 = new Chaser();
    player beater21 = new beater();
    player beater22 = new beater();

    public String team1 (int i) {

        if (seeker1.isSuccessful() == true) {

            System.out.println("seeker team 1 found the golden snitch and they won the match" + "in round : " + i);
            System.out.println("rasult : " + "\nnumbeer of goal team 1 : " + this.goal_team1 +
                    "\nnumber of goal team 2 :" + this.goal_team2);

            if (this.goal_team2 == this.goal_team1)
                System.out.println("the number of equal goal\n");

            System.out.print("peres enter for exit ...");
            Scanner input1 = new Scanner(System.in);
            String forexit1 = input1.nextLine();

            return "false";
        }


        if (seeker1.isSuccessful() && keeper1.isSuccessful()) {

            if (chaser11.isSuccessful() || chaser12.isSuccessful() || chaser13.isSuccessful()) {

                if (beater11.isSuccessful() || beater11.isSuccessful()) {

                    setGoal_team1(this.goal_team1 + 1);
                    System.out.println("SUIIIII1");
                    System.out.println("rasult : " + "\nnumbeer of goal team 1 : " + this.goal_team1 +
                            "\nnumber of goal team 2 :" + this.goal_team2);

                    System.out.print("peres enter for next round >>");
                    Scanner input3 = new Scanner(System.in);
                    String forexit3 = input3.nextLine();

                    System.out.println("\n");

                }
            }

        }

        return "true";
    }


    public String team2 (int i) {

        if (seeker2.isSuccessful() == true) {

            System.out.println("seeker team 2 found the golden snitch and they won the match" + " in round : " + i);
            System.out.println("rasult : " + "\nnumbeer of goal team 1 : " + this.goal_team1 +
                    "\nnumber of goal team 2 :" + this.goal_team2);

            if (this.goal_team2 == this.goal_team1)
                System.out.println("the number of equal goal\n");

            System.out.print("peres enter for exit ...");
            Scanner input2 = new Scanner(System.in);
            String forexit2 = input2.nextLine();

            return "false";

        }

        if (seeker2.isSuccessful() && keeper2.isSuccessful()) {

            if (chaser21.isSuccessful() || chaser22.isSuccessful() || chaser23.isSuccessful()) {

                if (beater21.isSuccessful() || beater22.isSuccessful()) {

                    setGoal_team2(this.goal_team2 + 1);
                    System.out.println("SUIIIII2");
                    System.out.println("rasult : " + "\nnumbeer of goal team 1 : " + this.goal_team1 +
                            "\nnumber of goal team 2 :" + this.goal_team2);

                    System.out.print("peres enter for next round >>");
                    Scanner input4 = new Scanner(System.in);
                    String forexit4 = input4.nextLine();

                    System.out.println("\n");

                }
            }

        }

        return "true";
    }

    public void setGoal_team1(int goal_team1) {
        this.goal_team1 = goal_team1;
    }

    public void setGoal_team2(int goal_team2) {
        this.goal_team2 = goal_team2;
    }
}
