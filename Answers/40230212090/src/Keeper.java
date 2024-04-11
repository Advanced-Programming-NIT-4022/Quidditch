import java.util.Random;
public class Keeper extends Player
{
    public Keeper(String name, int number)
    {
        super(name, number);
    }

    Random objRandom = new Random();
    int chancePercent = objRandom.nextInt(100);
    @Override
    public boolean isSuccessful()
    {
        if (chancePercent < 70)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
