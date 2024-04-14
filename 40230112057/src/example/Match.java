package example;

public class Match {
    Team team1;
    Team team2=new Team();
    public void Start1(){
        if(team1.seeker.isSuccessful()){
            System.out.println("team 1 won by finding the golden snitch.");
            System.out.println("The Scores:");
            System.out.println("team1: "+(team1.goals+150)+"         team2: "+team2.goals);
            return;
        }

        if(team2.seeker.isSuccessful()){
            System.out.println("team 2 won by finding the golden snitch.");
            System.out.println("The Scores:");
            System.out.println("team1: "+team1.goals+"         team2: "+(team2.goals+150));
            return;

        }

        for(int i=0;i<100;i++){
            team1.Play();
            team2.Play();
        }
            if(team1.goals>team2.goals){
                System.out.println("team 1 won by having more goals.");
                System.out.println("The Scores:");
                System.out.println("team1: "+team1.goals+"           team2: "+team2.goals);
            }
            else if(team1.goals<team2.goals){
                System.out.println("team 2 won by having more goals.");
                System.out.println("The Scores:");
                System.out.println("team1: "+team1.goals+"           team2: "+team2.goals);
            }
            else{
                System.out.println("draw.");
                System.out.println("The Scores:");
                System.out.println("team1: "+team1.goals+"           team2: "+team2.goals);
            }


    }
    public void Start2(){
        for(int i=0;i<100;i++){
            team1.Play();
            team2.Play();
            if(team1.seeker.isSuccessful()){
                System.out.println("team 1 won by finding the golden snitch.");
                System.out.println("The Scores:");
                System.out.println("team1: "+(team1.goals+150)+"         team2: "+team2.goals);
                return;
            }
            if(team2.seeker.isSuccessful()){
                System.out.println("team 2 won by finding the golden snitch.");
                System.out.println("The Scores:");
                System.out.println("team1: "+team1.goals+"         team2: "+(team2.goals+150));
                return;
            }
        }
    }
    public Match(Team team){
        this.team1=team;
    }

}
