package implementation;

import abstraction.LogicalCut;

public class Clipper extends BarberMachine {
  public Clipper(LogicalCut logicalCut) {
    super(logicalCut);
  }
  @Override
  public void cut() {
    logicalCut.cut();

  }
}
