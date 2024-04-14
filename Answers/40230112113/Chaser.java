public class Chaser extends Player
{
    public Boolean isSuccessful()
    {
        int count=0;
        int random=(int)(Math.random()*100);
        Boolean check;

        for(int i=1;i<=3;i++)
        {
            if (random<=30)
                count++;
        }
        if (count>=2)
            check=true;
        else
            check=false;
        return check;
            
    }
}
