import java.util.Random;
public class Chaser extends Player implements Success {
    public boolean isSuccessful() {
        Random con=new Random();
        int p=con.nextInt(100)+1;
        if (p>=70) {
            return true;
        }
        return false;
    }
}
