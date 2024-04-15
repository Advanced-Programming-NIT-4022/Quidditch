import java.util.Random;

public class Chaser extends Player implements Success {
    @Override
    public int isSuccessful() {
        Random rand = new Random();
        int chance = rand.nextInt(100)+1;
        int result = chance <= 30 ? 1 : 0;
        return result;
    }
}
