public class team {
    keeper k= new keeper( 1 , "k");
    seeker s= new seeker(2, "s");
    chaser ch1 = new chaser(3, "ch1");
    chaser ch2 = new chaser(4,"ch2");
    chaser ch3 = new chaser(5, "ch3");
    beater b1= new beater(6 ,"b1");
    beater b2= new beater(7 , "b2");

    int goal=0;

    private void setgoal(){
        goal++;
    }
    boolean snitch = false;

    public void play() {
        if(s.issuccssful()) snitch = true;
        boolean first = k.issuccssful();
        boolean second = (b1.issuccssful() || b2.issuccssful());
        boolean third = ((ch1.issuccssful() && ch2.issuccssful()) || (ch2.issuccssful() && ch3.issuccssful()) || (ch1.issuccssful() && ch3.issuccssful()));

        if (first && second && third) {
            setgoal();
        }
    }
}
