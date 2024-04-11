import java.util.Random;
public class Beater extends Player
{
    public Beater(String name, int number)
    {
        super(name, number);
    }

    Random objRandom = new Random();
    int chancePercent = objRandom.nextInt(100);
    @Override
    public boolean isSuccessful()
    {
        if (chancePercent < 40)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
