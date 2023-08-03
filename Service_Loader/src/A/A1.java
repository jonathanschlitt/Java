package A;

import java.util.ArrayList;

public class A1 {

  // public IntB b_service;
  // public IntC c_service;

  public ArrayList<IntB> b_services = new ArrayList<IntB>();

  public ArrayList<IntC> c_services = new ArrayList<IntC>();

  public void setB_service(IntB b_service) {
    // this.b_service = b_service;
    this.b_services.add(b_service);
  }

  public void setC_service(IntC c_service) {
    // this.c_service = c_service;
    this.c_services.add(c_service);
  }

  public void runFirstServiceOfB1() {
    b_services.get(0).testB();
  }

}
