import java.util.Random;

public class Seeker extends Player implements Success{
    @Override
    public boolean isSuccessful() {
        Random rand =new Random();
        if ((Math.abs(rand.nextInt() % 101)+1) <=5) {
            return true;
        }
        else {
            return false;
        }
    }
}
