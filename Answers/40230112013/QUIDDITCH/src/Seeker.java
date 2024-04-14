import java.util.Random;

public class Seeker extends Player{
    public Seeker(){
    super();
    }
    @Override
    public boolean isSuccessful() {
        Random r = new Random();
        int chance = r.nextInt(100);
        return chance<=5;
        }
    }

