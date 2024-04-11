import java.util.Random;

class Beater extends Player{
    public Beater(String name , int number){
        super(name , number);
    }
    @Override
    public boolean isSuccessful(){
        return new Random().nextInt(100) < 40;
    }
}
