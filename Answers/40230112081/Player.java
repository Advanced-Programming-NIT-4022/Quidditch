import java.util.Random;

public class Player implements Success {
    private int chance;
    public Player(int prob){
        this.chance = prob;
    }
    

    // interface
    public boolean isSuccessful()
    {
        Random rand = new Random();
        int rand_int = rand.nextInt(100)+1;
        return rand_int <= chance;
    }
}
