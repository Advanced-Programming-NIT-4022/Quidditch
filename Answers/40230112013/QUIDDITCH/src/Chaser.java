import java.util.Random;

public class Chaser extends Player{
    public Chaser(){
    super();
    }
    @Override
    public boolean isSuccessful() {
        Random r = new Random();
        int chance = r.nextInt(100);
        return chance<=30;
        }
    }

