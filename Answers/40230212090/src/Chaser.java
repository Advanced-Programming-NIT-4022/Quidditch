import java.util.Random;
public class Chaser extends Player
{
    public Chaser(String name, int number)
    {
        super(name, number);
    }

    Random objRandom = new Random();
    int chancePercent = objRandom.nextInt(100);
    @Override
    public boolean isSuccessful()
    {
        if (chancePercent < 30)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
