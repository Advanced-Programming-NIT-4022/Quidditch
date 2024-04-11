import java.util.Random;
public class Seeker extends Player
{
    public Seeker(String name, int number)
    {
        super(name, number);
    }
    // برای مشخص کردن شانس میایم اینجوری میگیم یه عدد رندوم از 0 تا 99 به ما بده اگه اون عدده کمتر از 5 بود isSuccessful میشه true در واقع همون 5%
    Random objRandom = new Random();
    int chancePercent = objRandom.nextInt(100);
    @Override
    public boolean isSuccessful()
    {
        if (chancePercent < 5)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
