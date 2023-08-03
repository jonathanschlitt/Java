package I;

import java.util.ServiceLoader;

import A.*;

public class Injector {

  private A1 a1 = null;

  public Injector(A1 a1) {
    this.a1 = a1;
    this.load();
  }

  public A1 getA1() {
    return this.a1;
  }

  public void load() {
    final ServiceLoader<IntB> b_services = ServiceLoader.load(IntB.class); // Typ des Interfaces, welches durch die
                                                                           // Klassen in B implementiert wurde.

    final ServiceLoader<IntC> c_services = ServiceLoader.load(IntC.class);

    for (IntB b_service : b_services) {
      a1.setB_service(b_service);
    }

    for (IntC c_service : c_services) {
      a1.setC_service(c_service);
    }
  }

  // public static void main(String[] args) {
  // A1 a1 = new A1();

  // Anwendung bei jeweils einer Service Instanz

  // IntB b_service = ServiceLoader.load(IntB.class).findFirst().orElse(null);
  // IntC c_service = ServiceLoader.load(IntC.class).findFirst().orElse(null);

  // a1.setB_service(b_service);
  // a1.setC_service(c_service);

  // a1.b_service.testB();
  // a1.c_service.testC();

  // Anwenung bei mehreren Service Instanzen
  // final ServiceLoader<IntB> b_services = ServiceLoader.load(IntB.class);

  // final ServiceLoader<IntC> c_services = ServiceLoader.load(IntC.class);

  // for (IntB b_service : b_services) {
  // a1.setB_service(b_service);
  // }

  // for (IntC c_service : c_services) {
  // a1.setC_service(c_service);
  // }

  // a1.b_services.get(0).testB();
  // a1.b_services.get(1).testB();
  // a1.c_services.get(0).testC();

  // }
}
