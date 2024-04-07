public class MyApp {
    Match match= new Match();
    public void match (){
        for (int i=0 ; i<100 ; i++){
            match.start();
            boolean seeker1 = match.team1.seeker.isSuccessful() ;
            boolean seeker2 = match.team2.seeker.isSuccessful() ;

            if(seeker1 == seeker2 ){
                    continue;
            }
            else if(seeker1){
                for (int j=0 ; j <150 ;j++){
                    match.team1.goals = match.team1.setGoal(match.team1.goals);
                }
                break;
            }
            else {
                for (int j=0 ; j <150 ;j++){
                match.team2.goals = match.team2.setGoal(match.team2.goals);
            }
                break;
            }
        }
        System.out.println("Team 1 ( Gryffindor ) : "+match.team1.getGoals());
        System.out.println("Team 2 ( Slytherin ) : "+match.team2.getGoals());
        if (match.team1.goals >=150){
            System.out.println("Harry Potter took the Golden Snidget");
        }
        else if(match.team2.goals >=150){
            System.out.println("Terence Higgs took the Golden Snidget");
        }
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
