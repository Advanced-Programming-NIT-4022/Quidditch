public class Chaser extends Player implements Success{
    private static final double SCORPROBABILITY=0.3;
    public Chaser(String name,int number)
    {
        super();
    }
    @Override
    public boolean isSuccessful(){
        return Math.random()<SCORPROBABILITY;
    }
}
