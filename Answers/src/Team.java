public class Team {
    private String name;
    private Player[] players;
    private int goalsScored;
    public void Team(String name) {
        this.name = name;
        players = new Player[7];
        players[0] = new Keeper("Keeper", 1);
        players[1] = new Seeker("Seeker", 2);
        for (int i = 2; i < 5; i++)
            players[i] = new Chaser("Chaser" + (i - 1), i + 1);
        for (int i = 5; i < 7; i++)
            players[i] = new Beater("Beater" + (i - 1), i + 1);

        goalsScored=0;}
    public void setGoal() {
        goalsScored++;
    }
    public String getName(){
        return name;}
    public boolean play(){
        int successfulKeepers=0;
        int successfulChasers=0;
        int successfulBeaters=0;
        for (Player player:players)
        {if (player instanceof Keeper && ((Success).player).isSuccessful(())){successfulKeepers++;}
            else if (player instanceof Chaser && ((Success).player).isSuccessful(())){successfulChasers++;}
            else if (player instanceof Beater && ((Success).player).isSuccessful(())){successfulBeaters++;}
    }
    return( (successfulKeepers> 0) && (successfulChasers>=2) && (successfulBeaters >=1));
}
}
