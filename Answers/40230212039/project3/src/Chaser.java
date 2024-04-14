import java.util.Random;

public class Chaser extends Player implements Success{

    Chaser(String name , int number){
        super(name , number);
    }

    public boolean isSuccessful(){

        Random randomNum = new Random();
        int random = randomNum.nextInt(100) +1;
        if (random <=30){
            return true;
        } else {return false;}
    }
}
