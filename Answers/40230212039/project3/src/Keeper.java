import java.util.Random;

public class Keeper extends Player implements Success {

    Keeper (String name , int number){
        super( name , number);
    }

    public boolean isSuccessful(){

        Random randomNum = new Random();
        int random = randomNum.nextInt(100) +1;
        if (random <=70){
            return true;
        } else {return false;}
    }
}
