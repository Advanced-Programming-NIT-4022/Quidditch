package tamrin3_AP;

import java.util.Scanner;

public class Match {

    team teams = new team();


    public void playmatch () {


        // delete this section to make it automatic
        for (int i =1 ; i<=100 ; i++){

            if (teams.team1(i)=="false"){
                break;
            }

            if (teams.team2(i)=="false"){
                break;
            }

            System.out.println("rasult : " + "\nnumbeer of goal team 1 : " + teams.goal_team1 +
                    "\nnumber of goal team 2 :" + teams.goal_team2);

            System.out.print("\nthis (round : " + i + ") round had no goal and the snitch was not found" +
                    " \nperes for next round > ");

            Scanner input5 = new Scanner(System.in);
            String forcontinue = input5.nextLine();

            System.out.println("\n");
        }

    }

}
