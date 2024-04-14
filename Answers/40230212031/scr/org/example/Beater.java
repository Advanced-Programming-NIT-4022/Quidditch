import java.util.Random;

class Beater extends Player implements Success {
    public Beater (String name, int number) {
        super(name, number);
    }
    @Override
    public boolean isSuccessful() {
        Random random = new Random();
        return random.nextInt(100) < 40;
    }
}