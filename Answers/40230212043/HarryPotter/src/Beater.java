import java.util.Random;
public class Beater extends Player {
    public boolean isSuccessful() {
        Random con=new Random();
        int p=con.nextInt(100)+1;
        if (p>=60) {
            return true;
        }
        return false;
    }
}
