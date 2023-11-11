package implementation;

import abstraction.LogicalCut;

public class Trimmer extends BarberMachine {
  public Trimmer(LogicalCut logicalCut) {
    super(logicalCut);
  }

  @Override
  public void cut() {
    logicalCut.cut();
  }
}
