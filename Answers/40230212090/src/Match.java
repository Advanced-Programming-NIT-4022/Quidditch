import javax.sound.midi.Soundbank;

public class Match
{
    private Team teamA;
    private Team teamB;

    public Match(Team team1, Team team2)
    {
        this.teamA = team1;
        this.teamB = team2;
    }

    public void start()
    {
        for (int i = 0 ; i < 100 ; i++)
        {
            teamA.play();
            teamB.play();
        }

        System.out.println("Team A goals: " + teamA.getGoals());
        System.out.println("Team B goals: " + teamB.getGoals());

        if (teamA.getGoals() > teamB.getGoals())
        {
            System.out.println("Team A wins!");
        }
        else if (teamB.getGoals() > teamA.getGoals())
        {
            System.out.println("Team B wins!");
        }
        else
        {
            System.out.println("It's a draw!");
        }
    }

}
