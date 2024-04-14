public class match {
private team team1;
private team team2;
public match(team team1, team team2)
{
this.team1=team1;
this.team2=team2;
}
public void start()
{
  for(int round = 1; round<=100; round++)
  {
    team1.play();
    team2.play();
    if(team1.getGoals()>=150)
    {
      System.out.println(team1.getName()+" found the golden snitch! They win.");
      break;
    }
    else if(team2.getGoals()>=150)
    {
      System.out.println(team2.getName()+" found the golden snitch!";
      break;
      
    }
    System.out.println("Round " + round + ":");
    System.out.println(team1.getName() + ": " + team.getGoals());
    System.out.println(team2.getName() + ": " + team2.getGoals());
  }
  if(team1.getGoals() < 150 && team2.getGoals() < 150)
  {
    int team1Score = team1.getGoals();
    int team2Score = team2.getGoals();
  
    if(team1Score > team2Score)
    {
      System.out.println(team1.getName() + ": " + "Wins.");

    }
    else if(team2Score > team1Score)
    {System.out.println(team2.getName() + ": " "Wins.");}
    else
    {
      System.out.println("Drow.");
    }
  }
}
}
