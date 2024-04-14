public class Team {
    int g=0;
     private void setGoal() {
         g++;
    }
    Seeker see=new Seeker();
    Keeper kee=new Keeper();
    Chaser ch1=new Chaser();
    Chaser ch2=new Chaser();
    Chaser ch3=new Chaser();
    Beater be1=new Beater();
    Beater be2=new Beater();
    public void play() {
        see.mov=see.isSuccessful();
        kee.mov=kee.isSuccessful();
        ch1.mov=ch1.isSuccessful();
        ch2.mov=ch2.isSuccessful();
        ch3.mov=ch3.isSuccessful();
        be1.mov=be1.isSuccessful();
        be2.mov=be2.isSuccessful();
        if (kee.mov==true || (be1.mov==true || be2.mov==true) || ((ch1.mov==true && ch2.mov==true) || (ch2.mov==true && ch3.mov==true) || (ch1.mov==true && ch3.mov==true))) {
            setGoal();
        }
        if (see.mov==true) {
            g+=150;
        }
    }
}
