public class Chaser extends Player implements Success{
    public boolean isSuccessful() {
        int rand = (int) (Math.random() * 101);
        if(rand<31){
            return true;
        }
        return false;
    }
}