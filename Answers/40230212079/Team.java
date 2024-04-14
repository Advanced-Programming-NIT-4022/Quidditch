import java.util.* ;
public class Team {
    String Keeper , Seeker , Beater1 , Beater2 , Chaser1 , Chaser2 , Chaser3 ;
    int b = 0 ;
    int Goal = 0 ;
    private void setGoal(int Goal){
        Goal = Goal + 1;
    }
    public int play(int y ) {
        Beater myobj = new Beater();
        Chaser MyOBj = new Chaser();
        Keeper myOBj = new Keeper();
        Seeker myoBj = new Seeker();
        Beater1 =  myobj.beaterisSuccessful();
        Beater2 =  myobj.beaterisSuccessful();
        Chaser1 =  MyOBj.chaserisSuccessful();
        Chaser2 =  MyOBj.chaserisSuccessful();
        Chaser3 =  MyOBj.chaserisSuccessful();
        Keeper  = myOBj.keeperisSuccessful();
        Seeker  = myoBj.seekerisSuccessful() ;
        Goal = y ;
        int callsetGoal = 0 ;
        if(Seeker =="t"){
            Goal=150 ;
        }
        else if(Keeper == "t"){
            callsetGoal++ ;
        } else if ((Beater1 == "t") || (Beater2 == "t")) {
            callsetGoal++ ;
        } else if ((Chaser1 == "t" && Chaser2 =="t")||(Chaser1 =="t" && Chaser3 =="t")||(Chaser2 =="t" && Chaser3 =="t")) {
            callsetGoal++ ;
        }
        if(callsetGoal == 3){
            setGoal(Goal) ;
        }
        return Goal ;
    }
}
