public class Keeper extends Player
{
    public Boolean isSuccessful()
    {
        int random=(int)(Math.random()*100);
        Boolean check;
        if (random<=70)
            check=true;
        else
            check=false;
        return check;
    }
}
