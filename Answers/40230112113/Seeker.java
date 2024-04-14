public class Seeker extends Player
{
    public Boolean isSuccessful()
    {
        int random=(int)(Math.random()*100);
        Boolean check;
        if (random<=5)
            check=true;
        else
            check=false;
        return check;  
    }
}
