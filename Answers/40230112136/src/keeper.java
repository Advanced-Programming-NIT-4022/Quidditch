import java.util.Random;

public class keeper extends player implements success{
    keeper(int number , String name)
    {super(number, name);}
    public boolean issuccssful(){

        Random rand = new Random();
        int upperbound = 100;
        int darsad = rand.nextInt(upperbound) + 1;
        if(darsad <= 70 ){return true;}
        else{return false;}
    }
}
