public class Keeper extends Player implements Success{
    public boolean isSuccessful() {
        int rand = (int) (Math.random() * 101);
        if(rand<71){
            return true;
        }
        return false;
    }
}