import java.util.Random;

class Chaser extends Player{
    public Chaser(String name , int number){
        super(name , number);
    }
    @Override
    public boolean isSuccessful(){
        return new Random().nextInt(100) < 30;
    }
}
