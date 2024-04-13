public class beater extends player implements success{
  private static final double stopChance = 0.4;
  public beater(String name, int number)
  {
    super(name, number);
  }
  @Override
  public boolean isSuccessfull() {
    // TODO Auto-generated method stub
    return Math.random() < stopChance;
  }
  

}
