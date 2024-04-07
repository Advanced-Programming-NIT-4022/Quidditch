public class MyApp {
    Match match= new Match();
    public void match (){
        for (int i=0 ; i<100 ; i++){
            match.start();
        }
        System.out.println("Team 1 ( Gryffindor ) : "+match.team1.getGoals());
        System.out.println("Team 2 ( Slytherin ) : "+match.team2.getGoals());
        if (match.team1.getGoals() > match.team2.getGoals()){
            System.out.println("Gryffindor is the winner   :-)");
        }
        else if (match.team2.getGoals() > match.team1.getGoals()){
            System.out.println("Unfortunately,Slytherin is the winner   :-(");
        }
        else{
            System.out.println("The game result is draw ");
        }
    }
}
