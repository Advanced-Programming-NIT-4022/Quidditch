public class team {
  private player[] players;
  private int goals;

  public team(String teamName)
  {
    players = new player[7];
    players[0] = new keeper("Keeper", 1);
    players[1] = new seeker("Seeker", 2);
    for(int i=2 ; i<5 ; i++)
    {
      players[i] = new chaser("Chaser"+(i-1), i+1);

    } 
    for(int i=5 ; i<7 ; i++)
    {
      players[i] = new beater("Beater"+(i-4), i+1);
    }
    goals = 0;
  }
  private void setGoals()
  {
    goals++;
  }
  public void play()
  {
    int successFullKeepers=0;
    int successFullBeaters=0;
    int successFullChasers=0;
    if(players[0] instanceof keeper && players[0].isSuccessfull())
    {
      successFullKeepers++;
    }
  
  for(int i=2 ; i<5 ; i++)
  {
    if(players[i] instanceof beater && players[i].isSuccessfull())
    {
      successFullBeaters++;
    }
  }
    for(int i=5 ; i<7 ; i++)
    {
      if(players[i] instanceof chaser && players[i].isSuccessfull())
      {
        successFullChasers++;
      }
    }
    if(successFullKeepers>0 && successFullBeaters>=1 && successFullChasers>=2)
    {
      setGoals();
    }
  }
  public int getGoals()
  {
    return goals;
  }
}

