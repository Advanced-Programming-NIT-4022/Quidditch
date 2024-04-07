import java.util.Random;

public class Seeker extends Player implements Success{
    @Override
    public boolean isSuccessful() {
        Random rand = new Random();
        return rand.nextDouble(0 , 10) >= 0.5;
        }
    }
