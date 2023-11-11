package implementation;

import abstraction.LogicalCut;

public class Razor extends BarberMachine {
  public Razor(LogicalCut logicalCut) {
    super(logicalCut);
  }
  @Override
  public void cut() {
    logicalCut.cut();
  }
}
