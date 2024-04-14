import java.util.Random;

class Seeker extends Player implements Success {
    public Seeker(String name, int number) {

        super(name, number);
    }
    @Override
    public boolean isSuccessful() {
        Random random = new Random();
        return random.nextInt(100) < 5;
    }
}
