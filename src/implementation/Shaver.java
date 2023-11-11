package implementation;

import abstraction.LogicalCut;

public class Shaver extends BarberMachine {

  public Shaver(LogicalCut logicalCut) {
    super(logicalCut);
  }

  @Override
  public void cut() {
    logicalCut.cut();
  }
}
