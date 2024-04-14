public class Beater extends Player
{
    public Boolean isSuccessful()
    {
        int count = 0;
        int random=(int)(Math.random()*100);
        Boolean check;

        for (int i=1;i<=2;i++)
        {
            if (random<=40)
                count++;
        }
        if (count>=1)
            check=true;
        else
            check=false;
        return check;
    }
}
