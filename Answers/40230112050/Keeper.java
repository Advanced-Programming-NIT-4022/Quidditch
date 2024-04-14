import java.util.Random;

public class Keeper extends Player implements Success{
    @Override
    public boolean isSuccessful() {

        boolean status =false ;

        int randnumber ;

        Random rand = new Random();
        randnumber = rand.nextInt(100)+1;

        if (randnumber<=70)
            status = true ;


        return status;
    }
}
