import java.util.*;

public class Keeper extends Player implements Success{
    Keeper(String name, int number){
        super(name, number);
    }
    @Override
    public boolean isSuccessful() {

        return Math.random() < 0.7;
    }
}
