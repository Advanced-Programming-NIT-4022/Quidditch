import java.util.Random;

class Keeper extends Player implements Success{
    public Keeper(String name, int number) {
        super(name, number);
    }

    @Override
    public boolean isSuccessful() {
        Random random = new Random();
        return random.nextInt(100) < 70;
    }
}