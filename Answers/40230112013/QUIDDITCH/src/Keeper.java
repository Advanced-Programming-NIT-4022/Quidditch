import java.util.Random;

public class Keeper extends Player{
    public Keeper(){
    super();
    }
    @Override
    public boolean isSuccessful() {
        Random r = new Random();
        int chance = r.nextInt(100);
        return chance<=70;
        }
    }

