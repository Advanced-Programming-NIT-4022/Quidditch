package tamrin3_AP;

import java.util.Random;

public class Chaser extends player{

    Random chaserchance = new Random();
    int chance;
    boolean status=false;

    @Override public boolean isSuccessful() {

        chance = chaserchance.nextInt(100)+1;

        if (chance<31){

            status=true;
        }
        else {

            status=false;
        }


        return status;
    }
}
