public class Beater extends Player implements Success{
    private static final double STOPPROBABILITY=0.4;
    public Beater(String name,int number) {
        super();
    }
    @Override
    public boolean isSuccessful(){
            return Math.random()<STOPPROBABILITY;
    }
    }
