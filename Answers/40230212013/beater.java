public class beater extends player implements secess{
  private static final double stopChance = 0.4;
  public beater(String name, int number)
  {
    super(name, number);
  }
  @Override
  public boolean isSecessfull() {
    // TODO Auto-generated method stub
    return Math.random() < stopChance;
  }
  

}
