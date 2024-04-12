public class chaser extends player implements secess{
  private static final double scoreChance = 0.3;
  public chaser(String name, int number)
  {
    super(name, number);
  }

  @Override
  public boolean isSecessfull() {
    // TODO Auto-generated method stub
    return Math.random() < scoreChance;
  }
  

}
