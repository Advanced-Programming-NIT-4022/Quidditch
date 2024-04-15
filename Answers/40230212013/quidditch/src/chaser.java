public class chaser extends player implements success{
  private static final double scoreChance = 0.3;
  public chaser(String name, int number)
  {
    super(name, number);
  }

  @Override
  public boolean isSuccessfull() {
    // TODO Auto-generated method stub
    return Math.random() < scoreChance;
  }
  

}
