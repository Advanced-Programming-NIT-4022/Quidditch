import java.util.Random;

public class Beater extends Player implements Success{

    Beater(String name , int number){
        super(name , number);
    }

    public boolean isSuccessful(){
        Random randomNum = new Random();
        int random = randomNum.nextInt(100) +1;
        if (random <= 40){
            return true;
        } else {return false;}
    }
}
