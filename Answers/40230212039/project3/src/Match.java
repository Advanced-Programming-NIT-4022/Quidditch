public class Match {

    public void start () {

        Team teamNo1 = new Team();
        Team teamNo2 = new Team();

        for (int i = 0; i < 100; i++) {
            teamNo1.play();
            if (teamNo1.snitch) {
                break;
            }
            teamNo2.play();
            if (teamNo2.snitch) {
                break;
            }
        }

       if (teamNo1.snitch) {
            System.out.println("Team 1 got the golden snitch.");
           System.out.println("Team 1 : " + (teamNo1.goals + 150));
           System.out.println("Team 2 : " + teamNo2.goals);
            System.out.println("Team 1 WINS!!");
        } else if (teamNo2.snitch) {
            System.out.println("Team 2 got the golden snitch.");
           System.out.println("Team 2 : " + (teamNo2.goals + 150));
           System.out.println("Team 1 : " + teamNo1.goals);
            System.out.println("Team 2 WINS!!");
        } else if (teamNo1.goals > teamNo2.goals) {
           System.out.println("Team 1 got " + teamNo1.goals + " scores and team 2 got " + teamNo2.goals + " scores.");
           System.out.println("Team 1 WINS!!");
       } else if (teamNo2.goals > teamNo1.goals) {
           System.out.println("Team 2 got " + teamNo2.goals + " scores and team 1 got " + teamNo1.goals + " scores.");
           System.out.println("Team 2 WINS!!");
       } else if (teamNo2.goals == teamNo1.goals) {
            System.out.println("The final score for team 1 is " + teamNo1.goals + " and for team 2 is " + teamNo2.goals);
            System.out.println("So the game ends in a draw!");
        }
    }
    }

