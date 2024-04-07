import java.util.Random;

public class Chaser extends Player implements Success{
    @Override
    public boolean isSuccessful() {
        Random rand = new Random();
        return rand.nextInt(0 , 10) >= 3;
    }
}
