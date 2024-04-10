import java.util.Random;

public class Chaser extends Player implements Success{

    @Override
    public boolean isSuccessful() {
        return Math.random() < 0.3;
    }
}
