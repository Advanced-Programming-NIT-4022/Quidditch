import java.util.*;
public class Chaser extends Player implements Success {
     Chaser(String name ,int number){
        super(name ,number);
    }
    @Override
    public boolean isSuccessful() {

        return Math.random() < 0.3;
    }
}
