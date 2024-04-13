package tamrin3_AP;

import java.util.Random;

public class Keeper extends player{

    Random keeperchance = new Random();
    int chance;
    boolean status=false;

    @Override public boolean isSuccessful() {

        chance = keeperchance.nextInt(100)+1;

        if (chance<71){

            status=true;
        }
        else {

            status=false;
        }


        return status;
    }
}

