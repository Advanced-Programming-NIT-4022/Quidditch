 public class Keeper extends Player implements Success{
    private static final double SAVEPROBILITY=0.7;
    public Keeper(String name,int number)
    {
        super();
    }
    @Override
    public boolean isSuccessful(){
        return Math.random()<SAVEPROBILITY;
    }
}
