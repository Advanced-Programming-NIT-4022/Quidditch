import java.util.Random;

public class Seeker extends Player implements Success{

    @Override
    public boolean isSuccessful() {
        return Math.random() < 0.5;
        }
    }
