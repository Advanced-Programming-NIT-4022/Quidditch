public class Beater extends Player implements Success{
    public boolean isSuccessful() {
        int randNum = (int) (Math.random() * 101);
        if(randNum<41) return true;
        else return false;
    }
}