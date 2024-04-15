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
      System.out.println(team1.getTeamName()+" found the golden snitch! They get 150 Scors.");
      System.out.println(team1.getTeamName() + ": " + team1.getGoals());
      System.out.println(team1.getTeamName() + " Wins.");

      break;
    }
    else if(team2.getGoals()>=150)
    {
      System.out.println(team2.getTeamName()+" found the golden snitch! They get 150 Scores.");
      System.out.println(team2.getTeamName() + ": " + team2.getGoals());
      System.out.println(team2.getTeamName() + " Wins.");
      break;
      
    }
    System.out.println("Round " + round + ":");
    System.out.println(team1.getTeamName() + ": " + team1.getGoals());
    System.out.println(team2.getTeamName() + ": " + team2.getGoals());
  }
  if(team1.getGoals() < 150 && team2.getGoals() < 150)
  {
    int team1Score = team1.getGoals();
    int team2Score = team2.getGoals();
  
    if(team1Score > team2Score)
    {
      System.out.println(team1.getTeamName() + " Wins.");

    }
    else if(team2Score > team1Score)
    {System.out.println(team2.getTeamName() +" Wins.");}
    else
    {
      System.out.println("Drow.");
    }
  }
}
}
