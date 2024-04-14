public class MyApp
{
    public static void main(String[] args)
    {
        Match match = new Match();
        Team team1 = new Team();
        Team team2 = new Team();
        
        match.start();

        if (team1.caught==true)
        {
            System.out.println("Team 1 scores: "+team1.goals);
            System.out.println("Team 2 scored: "+team2.goals);
            System.out.println("TEAM 1 WINS!");
        }
        else if(team2.caught==true)
        {
            System.out.println("Team 1 scored: "+team1.goals);
            System.out.println("Team 2 scored: "+team2.goals);
            System.out.println("TEAM 2 WINS!");
        }
        if(team1.goals>team2.goals)
        {
            System.out.println("Team 1 scored: "+team1.goals);
            System.out.println("Team 2 scored: "+team2.goals);
            System.out.println("TEAM 2 WINS!");
        }
        else if (team1.goals<team2.goals)
        {
            System.out.println("Team 1 scored: "+team1.goals);
            System.out.println("Team 2 scored: "+team2.goals);
            System.out.println("TEAM 1 WINS!");
        }
        else if (team1.goals==team2.goals)
        {
            System.out.println("Team 1 scored: "+team1.goals);
            System.out.println("Team 2 scored: "+team2.goals);
            System.out.println("THE GAME ENDS IN A DRAW!!");
        }
    }
}
