import java.util.Random;

public class Beater extends Player
{
    public Beater (String name, int number)
    {
        super(name, number);
    }
    public Boolean isSuccessful() {
        Random random = new Random();
        int chance = random.nextInt(100);
        return chance <= 40;
    }
}
