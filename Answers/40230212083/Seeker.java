public class Seeker extends Player implements Success{
    public boolean isSuccessful() {
        int randNum = (int) (Math.random() * 101);
        if(randNum<6) return true;
        else return false;
    }
}