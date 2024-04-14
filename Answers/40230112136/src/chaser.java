import java.util.Random;

public class chaser extends player implements success{
    chaser(int number , String name)
    {super(number, name);}
    public boolean issuccssful(){

        Random rand = new Random();
        int upperbound = 100;
        int darsad = rand.nextInt(upperbound) + 1;
        if(darsad <= 30 ){return true;}
       else{ return false;}
    }
}
