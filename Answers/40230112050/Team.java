import com.sun.security.jgss.GSSUtil;

public class Team {
    int s = 0 ;

    Chaser chaser11 = new Chaser();
    Chaser chaser12 = new Chaser();
    Chaser chaser13 = new Chaser();
    Chaser chaser21 = new Chaser();
    Chaser chaser22 = new Chaser();
    Chaser chaser23 = new Chaser();
    Beater beater11 = new Beater();
    Beater beater12 = new Beater();
    Beater beater21 = new Beater();
    Beater beater22 = new Beater();
    Seeker seeker1 = new Seeker();
    Seeker seeker2 = new Seeker();
    Keeper keeper1 = new Keeper();
    Keeper keeper2 = new Keeper();

    int goal1 = 0;
    int goal2 = 0;

    public void Play() {
        for(int i = 0 ; i < 100 ; i++) {
            Team1();
            Team2();
            if (seeker1.isSuccessful()){
                System.out.println("team1 found gold snitch!!!!!");
                System.out.println("team1 won");
                s = 1;
                break;
            }
            if (seeker2.isSuccessful()){
                System.out.println("team2 found gold snitch!!!!!");
                System.out.println("team2 won");
                s = 1;
                break;
            }
        }
        if(s != 1) {
            System.out.format("team1 score:%d  \nteam2 score:%d\n", getGoal1(goal1), getGoal2(goal2));
            if (getGoal1(goal1) > getGoal2(goal2)) {
                System.out.println("\nTeam1 won!!");

            } else if (getGoal1(goal1) < getGoal2(goal2)) {
                System.out.println("\nTeam2 won!!");

            } else {
                System.out.println("\nDraw");
            }
        }


        }



        public void Team1 () {
            if (keeper1.isSuccessful()) {
                if (beater11.isSuccessful() || beater12.isSuccessful()) {
                    if ((chaser11.isSuccessful() && chaser12.isSuccessful()) || (chaser11.isSuccessful() && chaser13.isSuccessful()) || (chaser12.isSuccessful() && chaser13.isSuccessful())) {
                        setgoal1();
                    }
                }
            }



        }

        private void setgoal1 () {
            goal1++;

        }
        public int getGoal1(int goal1){
            return goal1;
    }

        public void Team2 (){
            if (keeper2.isSuccessful()) {
                if (beater21.isSuccessful() || beater22.isSuccessful()) {
                    if ((chaser21.isSuccessful() && chaser22.isSuccessful()) || (chaser21.isSuccessful() && chaser23.isSuccessful()) || (chaser22.isSuccessful() && chaser23.isSuccessful())) {
                        setgoal2();
                    }
                }
            }


        }
        private void setgoal2 () {
            goal2++;

        }
    public int getGoal2(int goal2){
        return goal2;
    }




}
