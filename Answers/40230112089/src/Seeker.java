import java.util.*;
public class Seeker extends Player implements Success{
    Seeker(String name,int number){
        super(name ,number);
    }
    @Override
    public boolean isSuccessful() {

        return Math.random() < 0.05;
    }
}
