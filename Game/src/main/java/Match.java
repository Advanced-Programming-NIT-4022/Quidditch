public class Match {
    private Team t1;
    private Team t2;
    public Match(Team t1 , Team t2){
        this.t1 = t1;
        this.t2 = t2;
    }
    public void start(){
        for(int i=0 ; i<100 ; i++){
            t1.plays();
            t2.plays();
        }
        int t1goal = t1.getgoal();
        int t2goal = t2.getgoal();

        if(t1.getseek().isSuccessful()){
            System.out.println("Team number 1 wins with 150 point beacuse find snitcher!!!");
        }
        else if(t2.getseek().isSuccessful()){
            System.out.println("Team number 2 wins with 150 point beacuse find snitcher!!!");
        }
        else{
            if(t1goal > t2goal){
                System.out.println("Team 1 wins and the score is: " + t1goal);
            }
            else if(t2goal > t1goal){
                System.out.println("Team 2 wins and the score is: " + t2goal);
            }else {
                System.out.println("its drawwwwwww!!!!!");
            }
        }
    }
}
