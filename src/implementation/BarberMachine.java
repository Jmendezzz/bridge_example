package implementation;

import abstraction.LogicalCut;

public abstract class BarberMachine {
  protected LogicalCut logicalCut;
  public BarberMachine(LogicalCut logicalCut) {
    this.logicalCut = logicalCut;
  }
  public abstract void cut();
}
