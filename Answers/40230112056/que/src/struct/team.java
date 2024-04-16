package struct;

public class team {
    keeper kpr = new keeper("ali",18);
    seeker skr = new seeker("mohammad",19);
    chaser csr1 = new chaser("amir",69);
    chaser csr2 = new chaser("reza",20);
    chaser csr3 = new chaser("ayoub",22);
    beater btr1 = new beater("abolfazl",21);
    beater btr2 = new beater("asghar",31);
    private int g = 0;
    private void setgoal(){
        g++;
    }
    public int getgoal(){
        return g;
    }
    public void play (){
        if (Math.random()<skr.ch ) {
            g+=150;
        }
        else if (Math.random()<kpr.ch && ( Math.random()<btr1.ch || Math.random()<btr2.ch ) && 
        (Math.random()<csr1.ch && Math.random()<csr2.ch) ) {
            setgoal();
            
        }
    }
}
