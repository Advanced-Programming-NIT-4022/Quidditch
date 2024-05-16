package example;

import example.Player;
import example.random;

public class Seeker extends Player implements Success{
    private int chance=5;
    @Override
    public boolean isSuccessful() {
         return random.getrand()<=chance;
    }
    public Seeker(String name,String number){
        super.name=name;
        super.number=number;
    }
}
