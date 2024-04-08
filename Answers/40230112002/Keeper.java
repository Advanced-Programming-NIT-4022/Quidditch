import java.util.Random;
public class Keeper extends Player implements Success{

    @Override
    public boolean isSuccessful() {
        return Math.random() < 0.7;
    }
}
