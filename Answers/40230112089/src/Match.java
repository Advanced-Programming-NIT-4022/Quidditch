import java.util.*;
public class Match {
    public void Start() {

        Team team1 = new Team();
        Team team2 = new Team();
        for (int i = 0; i < 100; i++) {
            team1.play();
            team2.play();
        }
            System.out.println("_______________________________________");
            System.out.format(" team1 Goals : %d\n", team1.Goal);
            System.out.format(" team2 Goals : %d\n", team2.Goal);
            System.out.println("_______________________________________");

            if(team1.gotSnitch){
                System.out.println("team1 got the snitch and awarded with 150 points and won");
            } else if(team2.gotSnitch){
                System.out.println("team2 got the snitch and awarded with 150 points and won");
            } else {
                if ( team1.Goal > team2.Goal) {
                    System.out.println(" Result : team1 won");
                    System.out.println("_______________________________________");
                } else if (team1.Goal < team2.Goal) {
                    System.out.println(" Result : team2 won");
                    System.out.println("_______________________________________");
                } else if (team1.Goal == team2.Goal) {
                    System.out.println(" Result : draw");
                    System.out.println("_______________________________________");
                }
            }




    }
}
