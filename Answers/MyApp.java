interface Success{
    boolean isSuccessful();
}
class Player{
    private String name;
    private int number;
    public Player(String name,int number){
        this.name=name;
        this.number=number;
    }
    public String getName(){
        return name;
    }
    public int getNumber(){
        return number;
    }
}
class Keeper extends Player implements Success{
    private static final double Save_Chance=0.7;
    public Keeper(String name,int number){
        super(name,number);
    }
    @Override
    public boolean isSuccessful(){
        return Math.random()<Save_Chance;
    }
}
