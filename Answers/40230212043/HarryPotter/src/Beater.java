import java.util.Random;
public class Beater extends Player implements Success {
    public Beater (int sh,String num) {
        super(sh,num);
    }
    public boolean isSuccessful(boolean t) {
        Random tas=new Random();
        int g=tas.nextInt(100)+1;
        if (g>=60) {
            t=true;
        }
        return t;
    }
}
