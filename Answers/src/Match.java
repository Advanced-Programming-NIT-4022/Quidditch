public class Match {
    Team team1;
    Team team2=new Team();
    public void Start(){
        for(int i=0;i<100;i++){
            team1.Play();
            team2.Play();
            if(team1.won){
                System.out.println("team 1 won.");
                System.out.println("The Scores:");
                System.out.println("team1: "+team1.goals+" team2: "+team2.goals);
                break;
            }

            if(team2.won){
                System.out.println("team 2 won.");
                System.out.println("The Scores:");
                System.out.println("team1: "+team1.goals+" team2: "+team2.goals);
                break;
            }


        }

    }
    public Match(Team team){
        this.team1=team;
    }

}
