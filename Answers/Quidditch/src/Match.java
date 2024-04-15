public class Match {
    Team team1 = new Team();
    Team team2 = new Team();
    public void start(){
        for (int i=0 ; i<100 ; i++){
            team1.play();
            team2.play();;
        }
        if (team1.goal > team2.goal) {
            System.out.println("team 1 wins!");
        } else if (team1.goal < team2.goal) {
            System.out.println("team 2 wins!");
        } else {
            System.out.println("draw!");
        }
        System.out.println("team 1 : " + team1.goal);
        System.out.println("team 2 : " + team2.goal);
    }
}
