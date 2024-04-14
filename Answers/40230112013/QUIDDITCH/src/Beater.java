import java.util.Random;
public class Beater extends Player{
    public Beater(){
    super();
    }
    @Override
    public boolean isSuccessful() {
        Random r = new Random();
        int chance = r.nextInt(100);
        return chance<=40;
        }
    }

