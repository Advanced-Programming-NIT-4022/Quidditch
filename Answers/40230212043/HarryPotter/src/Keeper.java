import java.util.Random;
public class Keeper extends Player implements Success {
    public Keeper (int sh,String num) {
        super(sh,num);
    }
    public boolean isSuccessful(boolean t) {
        Random tas=new Random();
        int g=tas.nextInt(100)+1;
        if (g>=30) {
            t=true;
        }
        return t;
    }
}
