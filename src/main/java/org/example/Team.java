package org.example;

public class Team {
    Keeper keeper = new Keeper("Mr.NoorBakhsh", 1);
    Seeker seeker = new Seeker("Mr.Ranaei",2);
    Beater beater1 = new Beater("Mr.Jalali", 3);
    Beater beater2 = new Beater("Mr.Matin", 4);
    Chaser chaser1 = new Chaser("Mr.Lotfipoor",5);

    Chaser chaser2 = new Chaser("Mr.Izadi" ,6);
    Chaser chaser3 = new Chaser("Mr.Tahmasbi" ,7);
    int numberOfGoals = 0;
    boolean findsGoldenSnitch = false;

    private void setGoal(){
        numberOfGoals+=1;
    }
    public void play(){

        if (seeker.isSuccessful()){
            findsGoldenSnitch = true;
        }
        boolean chasersSuccess = (chaser1.isSuccessful() && chaser2.isSuccessful()) || (chaser1.isSuccessful() && chaser3.isSuccessful()) || (chaser2.isSuccessful() && chaser3.isSuccessful());
        boolean beatersSuccess = beater1.isSuccessful() || beater2.isSuccessful();
        if (keeper.isSuccessful() && chasersSuccess && beatersSuccess){
            setGoal();
        }
    }
}
