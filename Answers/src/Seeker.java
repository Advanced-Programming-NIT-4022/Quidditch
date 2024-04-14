public class Seeker extends Player implements Success{
    private static final double SNITCHPROBABILITY=0.5;
    public Seeker(String name,int number){
        super();
    }
    @Override
    public boolean isSuccessful(){
        return Math.random()<SNITCHPROBABILITY;
    }
}