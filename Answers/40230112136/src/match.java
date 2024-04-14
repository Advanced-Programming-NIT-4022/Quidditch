public class match {

    public void start(){
        team t1= new team();
        team t2= new team();
        for(int i=0 ; i<100 ; i++){
            t1.play();
            if(t1.snitch){break;}
            t2.play();
            if(t2.snitch){break;}
        }

        if(t1.snitch){
            System.out.println("Team 1 got the snitch and wins with "+( 150 + t1.goal )+ "scores");
            System.out.println("Team 2 scores " + t2.goal);
        }
        else if(t2.snitch){
            System.out.println("Team 2 got the snitch and wins with "+( 150 + t2.goal )+ "scores");
            System.out.println("Team 1 scores " + t1.goal);
        }
        else if(t1.goal > t2.goal)
        {
            System.out.println("Team 1 scores " + t1.goal);
            System.out.println("Team 2 scores " + t2.goal);
            System.out.println("Team 1 wins");
        }
        else if(t1.goal < t2.goal)
        {
            System.out.println("Team 1 scores " + t1.goal);
            System.out.println("Team 2 scores " + t2.goal);
            System.out.println("Team 2 wins");
        }
        else if(t1.goal == t2.goal)
        {
            System.out.println("Team 1 scores " + t1.goal);
            System.out.println("Team 2 scores " + t2.goal);
            System.out.println("The game ends in a draw.");
        }



    }
}
