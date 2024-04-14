public class Match {
    private Team teamA;
    private Team teamB;
    private Random random;
    public Match(Team teamA,Team teamB)
    {
        this.teamA=teamA;
        this.teamB=teamB;
        random=new Random();
    }
}
