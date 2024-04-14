public class Keeper extends Player implements Success{
    public boolean isSuccessful() {
        int randNum = (int) (Math.random() * 101);
        if(randNum<71) return true;
        else return false;
    }
}