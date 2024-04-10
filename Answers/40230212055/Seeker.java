package tamrin3_AP;

import java.util.Random;

public class Seeker extends player{

    Random seekerchance = new Random();
    int chance;
    boolean status=false;

    @Override public boolean isSuccessful() {

        chance = seekerchance.nextInt(100)+1;

        if (chance<6){

            status=true;
        }
        else {

            status=false;
        }


        return status;
    }
}
