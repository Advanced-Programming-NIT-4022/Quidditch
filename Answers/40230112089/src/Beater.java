import java.util.*;

public class Beater extends Player implements Success{

    Beater(String name, int number){
        super(name, number);
    }
    @Override
    public boolean isSuccessful() {

        return Math.random() < 0.4;
    }
}
