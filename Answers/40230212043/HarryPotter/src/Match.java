public class Match {
    Team team1=new Team();
    Team team2=new Team();
    public void start() {
        for (int i=0;i<=100;i++) {
            team1.play();
            team2.play();
            if (team1.see.mov==true || team2.see.mov==true) {
                break;
            }
            team1.see.mov=false;
            team1.kee.mov=false;
            team1.ch1.mov=false;
            team1.ch2.mov=false;
            team1.ch3.mov=false;
            team1.be1.mov=false;
            team1.be2.mov=false;
            team2.see.mov=false;
            team2.kee.mov=false;
            team2.ch1.mov=false;
            team2.ch2.mov=false;
            team2.ch3.mov=false;
            team2.be1.mov=false;
            team2.be2.mov=false;
        }
        System.out.println("team1:"+team1.g+"\t"+"team2:"+team2.g);
        if (team1.g> team2.g) {
            System.out.print("winner: team1");
        } else if (team2.g> team1.g) {
            System.out.print("winner: team2");
        } else {
            System.out.print("mosavi!");
        }
    }
}
