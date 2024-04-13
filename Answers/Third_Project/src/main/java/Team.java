public class Team {
    Keeper keeper = new Keeper("keeper",1);
    Seeker seeker = new Seeker("seeker",2);
    Chaser chaser1 = new Chaser("chaser1",3);
    Chaser chaser2 = new Chaser("chaser2",4);
    Chaser chaser3 = new Chaser("chaser3",5);
    Beater beater1 = new Beater("beater1",6);
    Beater beater2 = new Beater("beater2",7);
    static int goal = 0;
    private void setgoal(){
        goal ++;
    }
    public void play(){

    }

}
