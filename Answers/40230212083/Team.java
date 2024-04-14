public class Team{
    private int goalNum = 0;
    Keeper ron = new Keeper();
    Chaser ginny1 = new Chaser();
    Chaser ginny2 = new Chaser();
    Chaser ginny3 = new Chaser();
    Beater george1 = new Beater();
    Beater george2 = new Beater();
    Seeker charlie = new Seeker();
    private void setGoal(){
        goalNum++;
    }
    void play(){
        //at least 2 chaser
        int chaserChance = 0;
        if(ginny1.isSuccessful()) chaserChance++;
        if(ginny2.isSuccessful()) chaserChance++;
        if(ginny3.isSuccessful()) chaserChance++;
        //
        if((chaserChance>1) && (george1.isSuccessful() || george2.isSuccessful()) && ron.isSuccessful()) goalNum++;
        if(charlie.isSuccessful()) goalNum += 150;
    }
    public int getScore(){
        return goalNum;
    }
}