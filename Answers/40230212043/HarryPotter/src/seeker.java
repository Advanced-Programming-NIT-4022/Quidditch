import java.util.Random;
public class Seeker extends Player implements Success {
    public Seeker (int sh,String num) {
        super(sh,num);
    }
    public boolean isSuccessful(boolean t) {
        Random tas=new Random();
        int g=tas.nextInt(100)+1;
        if (g>=95) {
            t=true;
        }
        return t;
    }
}
