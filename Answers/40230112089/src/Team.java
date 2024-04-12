import java.util.*;
public class Team {



    Keeper keeper = new Keeper("Alex", 1);
    Seeker seeker = new Seeker("mark",2);
    Beater beater1 = new Beater("Dave", 3);
    Beater beater2 = new Beater("Mike", 4);
    Chaser chaser1 = new Chaser("ali",5);

    Chaser chaser2 = new Chaser("robert" ,6);
    Chaser chaser3 = new Chaser("rick" ,7);
    int Goal = 0;
    boolean gotSnitch = false;



    private void setGoal() {
        Goal++;
    }

    public void play() {
        if(seeker.isSuccessful()){
            gotSnitch = true;
        }
        boolean isKS = keeper.isSuccessful();
        boolean isB1S = beater1.isSuccessful();
        boolean isB2S = beater2.isSuccessful();
        boolean isC1S = chaser1.isSuccessful();
        boolean isC2S = chaser2.isSuccessful();
        boolean isC3S = chaser3.isSuccessful();
        boolean condition1 = isKS;
        boolean condition2 = (isB1S || isB2S);
        boolean condition3 = ((isC1S && isC2S) || (isC1S && isC3S) || (isC2S && isC3S));
        if (condition1 && condition2 && condition3) {
            setGoal();
        }
    }
}

