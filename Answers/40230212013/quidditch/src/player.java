public abstract class player {
  private String name;
  private int number;
  public player (String name, int number)
  {
    this.name=name;
    this.number=number;
  }
  public String getName() {
    return name;
  }
  public int getNumber() {
    return number;
  }
  public abstract boolean isSuccessfull();
}
