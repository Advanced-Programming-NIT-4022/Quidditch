public class Match {
    Team team1=new Team();
    Team team2=new Team();
    public void start(){
        for(int i=0 ; i<100 ; i++){
            team1.Play();
            team2.Play();
        }
        System.out.println("Team1 Score: " + team1.score());
        System.out.println("Team2 Score: " + team2.score());
        if(team2.score() > team1.score()){
            System.out.println("Team2 Won!");
        }else if(team2.score() < team1.score()) {
            System.out.println("Team1 Won!");
        }else{
            System.out.println("Draw!");
        }
    }
}