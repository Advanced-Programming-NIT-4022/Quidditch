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
class Seeker extends Player implements Success{
    private static final double Snitch_Chance=0.05;
    public Seeker(String name,int number){
        super(name,number);
    }
    @Override
    public boolean isSuccessful(){
        return Math.random() < Snitch_Chance;
    }
}
class Chaser extends Player implements Success{
    private static final double Score_Chance=0.3;
    public Chaser(String name,int number){
        super(name, number);
    }
    @Override
    public boolean isSuccessful(){
        return Math.random() < Score_Chance;
    }
}
class Beater extends Player implements Success{
    private static final double = Stop_Chance=0.4;
    public Beater(String name,int number){
        super(name, number);
    }
    @Override
    public boolean isSuccessful(){
        return Math.random() < Stop_Chance;
    }
}
class Team{
    private String teamName;
    private Keeper keeper;
    private Seeker seeker;
    private Chaser[] chaser;
    private Beater[] beater;
    private int goalsScored;

    public Seeker getSeeker(){return seeker;}
    public Team(String teamName,Keeper keeper,Seeker seeker,Chaser[] chasers,Beater[] beaters){
        this.teamName=teamName;
        this.keeper=keeper;
        this.seeker=seeker;
        this.chaser=chasers;
        this.beater=beaters;
        this.goalsScored=0;
    }
    private void setGoal(){ goalsScored++;}
    public void Play(){
        int successfulChasers=0;
        int successfulBeaters=0;

        for (Chaser chaser : chasers){
            if(chaser.isSuccessful()){
                successfulChasers++;
            }
        }
       for (Beater beater : beaters){
           if(beater.isSuccessful()){
               successfulBeaters++;
           }
       }
       if(keeper.isSuccessful() && successfulBeaters>=1 && successfulChasers>=2){
           setGoal();
       }
    }
    public String getTeamName(){return teamName;}
    public int getGoalsScored(){return goalsScored;}
    public void setSeeker(Seeker seeker){
        this.seeker=seeker;
    }
}