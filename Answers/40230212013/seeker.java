public class seeker extends player implements secess {
  private static final double snitchChance = 0.05;
  public seeker(String name, int number)
  {
    super(name, number);
  }
  @Override
  public boolean isSecessfull() {
    // TODO Auto-generated method stub
    return Math.random() < snitchChance;
  }
  

}
