import java.util.Random;

public class Keeper extends Player
{
    public Keeper(String name, int number)
    {
        super(name, number);
    }
    public Boolean isSuccessful() {
        Random random = new Random();
        int chance = random.nextInt(100);
        return chance <= 70;
    }
}
