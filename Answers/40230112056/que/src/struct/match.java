package struct;

public class match {
    team t1 = new team();
    team t2 = new team();
    public int g1,g2;
    public void start(){
        for(int i=0;i<100;i++){
            t1.play();
            if (t1.getgoal()>=150) break;
            t2.play();
            if (t2.getgoal()>=150) break;
        }
        g1=t1.getgoal();
        g2=t2.getgoal();
    }
}
