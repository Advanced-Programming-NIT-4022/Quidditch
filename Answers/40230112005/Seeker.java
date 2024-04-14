public class Seeker extends Player implements Success{
    public boolean isSuccessful() {
        int rand = (int) (Math.random() * 101);
        if(rand<6){
            return true;
        }
        return false;
    }
}