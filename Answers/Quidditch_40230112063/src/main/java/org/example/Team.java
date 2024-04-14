package org.example;

public class Team {

    Keeper keeper1 = new Keeper();
    Seeker seeker1 = new Seeker();
    Chaser chaser1 = new Chaser();
    Chaser chaser2 = new Chaser();
    Chaser chaser3 = new Chaser();
    Beater beater1 = new Beater();
    Beater beater2 = new Beater();

    int number_of_goals = 0;

    private void setGoal(){
        number_of_goals++;
    }



    public String goldenSnitch(){
        if(seeker1.isSuccessful()){
            number_of_goals=150;
            return "Golden Snitch";
        }
        return "Nothing much";
    }



    public void play(){

        if(keeper1.isSuccessful() &&
                (beater1.isSuccessful() || beater2.isSuccessful()) &&
                ((chaser1.isSuccessful() && chaser2.isSuccessful())||(chaser1.isSuccessful() && chaser3.isSuccessful())
        ||(chaser2.isSuccessful()&&chaser3.isSuccessful())))
        {
            setGoal();
        }
    }
}
