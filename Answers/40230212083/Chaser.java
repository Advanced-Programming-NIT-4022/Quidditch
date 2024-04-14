public class Chaser extends Player implements Success{
    public boolean isSuccessful() {
        int randNum = (int) (Math.random() * 101);
        if(randNum<31) return true;
        else return false;
    }
}