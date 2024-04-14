import java.util.* ;
public class Match {
    String result ;
    int count = 1;
    int scoreteam1 =0 ;
    int scoreteam2 =0 ;
    public String start(){
        while (count <101){
            Team myobj = new Team() ;
            scoreteam1 = myobj.play(scoreteam1)  ;
            if (scoreteam1 == 150){
                break ;
            }
            scoreteam2 = myobj.play(scoreteam2)  ;
            if (scoreteam2 == 150){
                break ;
            }
            count ++ ;
        }
        System.out.println("scoreteam1 = " + scoreteam1);
        System.out.println("scoreteam2 = " + scoreteam2);

        if(scoreteam1 > scoreteam2 ){
            result = "team1 won";
        }
        else if(scoreteam1 < scoreteam2 ){
            result = "team2 won";
        }
        else if(scoreteam1 == scoreteam2 ){
            result = "draw";
        }
        else if(scoreteam2==150){
            result = "team2 won";
        }
        else if(scoreteam1==150){
            result = "team1 won";
        }
        return result ;
    }
}
