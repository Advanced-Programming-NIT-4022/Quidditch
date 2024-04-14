import java.util.Random;

public class seeker extends player implements success{
    seeker(int number , String name)
    {super(number, name);}
    public boolean issuccssful(){

        Random rand = new Random();
        int upperbound = 100;
        int darsad = rand.nextInt(upperbound) + 1;
        if(darsad <= 5 ){return true;}
        else {return false;}

    }

}
