package abstraction;

public class ZeroCut implements LogicalCut{
  @Override
  public void cut() {
    System.out.println("You're bald now!");
  }
}
