public class Beater extends Player implements Success{
    public boolean isSuccessful(){
        int rand=(int)(Math.random()*101);
        if(rand<41){
            return true;
        }
        return false;
    }
}