import java.util.Random;

public class Seeker extends Player implements Success{
    @Override
    public boolean isSuccessful() {

        boolean status =false ;

        int randnumber ;

        Random rand = new Random();
        randnumber = rand.nextInt(100)+1;

        if (randnumber<=5)
            status = true ;


        return status;

    }
}
