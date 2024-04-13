public class seeker extends player implements success {
  private static final double snitchChance = 0.05;
  public seeker(String name, int number)
  {
    super(name, number);
  }
  @Override
  public boolean isSuccessfull() {
    // TODO Auto-generated method stub
    return Math.random() < snitchChance;
  }
  

}
