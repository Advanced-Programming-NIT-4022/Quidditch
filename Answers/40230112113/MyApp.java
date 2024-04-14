public class MyApp
{
    public static void main(String[] args)
    {
        Keeper k1=new Keeper("asghar", 1);
        Seeker s1=new Seeker("huh", 2);
        Chaser c1_1=new Chaser("haha", 3);
        Chaser c2_1=new Chaser("hoho", 4);
        Chaser c3_1=new Chaser("hehe", 5);
        Beater B1_1=new Beater("hehe", 6);
        Beater B2_1=new Beater("hehe", 7);
        
        Keeper k2=new Keeper("asghar", 1);
        Seeker s2=new Seeker("huh", 2);
        Chaser c1_2=new Chaser("haha", 3);
        Chaser c2_2=new Chaser("hoho", 4);
        Chaser c3_2=new Chaser("hehe", 5);
        Beater B1_2=new Beater("hehe", 6);
        Beater B2_2=new Beater("hehe", 7);

        Team team2=new Team(B1_2, B2_2, s2, k2, c1_2, c2_2, c3_2);
        Team team1=new Team(B1_1, B2_1, s1, k1, c1_1, c2_1, c3_1);

        Match match = new Match(team1, team2);
        
        match.start();

        if(team1.goals>team2.goals)
        {
            System.out.println("Team 1 scored: "+team1.goals);
            System.out.println("Team 2 scored: "+team2.goals);
            System.out.println("TEAM 1 WINS!");
        }
        else if (team1.goals<team2.goals)
        {
            System.out.println("Team 1 scored: "+team1.goals);
            System.out.println("Team 2 scored: "+team2.goals);
            System.out.println("TEAM 2 WINS!");
        }
        else if (team1.goals==team2.goals)
        {
            System.out.println("Team 1 scored: "+team1.goals);
            System.out.println("Team 2 scored: "+team2.goals);
            System.out.println("THE GAME ENDS IN A DRAW!!");
        }
    }
}
