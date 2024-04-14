import java.util.Random;

public class Seeker extends Player implements Success{

    Seeker(String name , int number){
        super(name , number);
    }

    public boolean isSuccessful(){

        Random randomNum = new Random();
        int random = randomNum.nextInt(100) +1;
        if (random <=5){
            return true;
        } else {return false;}
    }
}
