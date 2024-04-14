import java.util.Random;
public class Seeker extends Player implements Success {
    public boolean isSuccessful() {
        Random con=new Random();
        int p=con.nextInt(100)+1;
        if (p>=95) {
            return true;
        }
        return false;
    }
}
