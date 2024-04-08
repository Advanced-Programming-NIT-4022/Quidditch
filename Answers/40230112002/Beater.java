import java.util.Random;

public class Beater extends Player implements Success{

    @Override
    public boolean isSuccessful() {
        return Math.random() < 0.4;
    }
}
