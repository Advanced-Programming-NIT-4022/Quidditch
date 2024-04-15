public class keeper extends player implements success {
  private static final double saveCahnce = 0.7;
  public keeper(String name, int number)
  {
    super(name, number);
  }
  @Override
  public boolean isSuccessfull() {
    // TODO Auto-generated method stub
    return Math.random() < saveCahnce;
    
  }

}
