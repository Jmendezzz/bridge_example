import abstraction.HalfZeroCut;
import abstraction.OneCut;
import abstraction.ZeroCut;
import implementation.BarberMachine;
import implementation.Clipper;
import implementation.Trimmer;

public class Main {
  public static void main(String[] args) {
    BarberMachine trimmer = new Trimmer(new ZeroCut());
    trimmer.cut();
    BarberMachine clipper = new Clipper(new OneCut());
    clipper.cut();
    BarberMachine clipper2 = new Clipper(new HalfZeroCut());
    clipper2.cut();

  }
}