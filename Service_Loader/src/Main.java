import A.A1;
import I.Injector;

public class Main {
  public static void main(String[] args) {
    A1 a1 = new A1();
    Injector injector = new Injector(a1);

    A1 injected_a1 = injector.getA1();

    // injected_a1.b_services.get(0).testB();
    // injected_a1.b_services.get(1).testB();
    // injected_a1.c_services.get(0).testC();

    injected_a1.runFirstServiceOfB1();

  }
}
