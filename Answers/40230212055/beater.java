package tamrin3_AP;

import java.util.Random;

public class beater extends player{

    Random beaterchance = new Random();
    int chance;
    boolean status=false;

    @Override public boolean isSuccessful() {

        chance =beaterchance.nextInt(100)+1;

        if (chance<41){

            status=true;
        }
        else {

            status=false;
        }


        return status;
    }
}
