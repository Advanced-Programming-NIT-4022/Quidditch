import java.util.Random;
class Keeper extends Player {
    public Keeper(String name , int number){
        super(name , number);
    }
    @Override
    public boolean isSuccessful(){
        return false;
    }
}
