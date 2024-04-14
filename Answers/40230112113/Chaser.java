import java.util.Random;

public class Chaser extends Player
{
    public Chaser(String name, int number)
    {
        super(name, number);
    }
    public Boolean isSuccessful() {
        Random random = new Random();
        int chance = random.nextInt(100);
        return chance <= 30;
    }
}
