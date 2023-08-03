package A;

import B.B1Factory;
import B.B2Factory;

public class A1 {
  public static void main(String[] args) {

    AbtsractBFactory f1 = new B1Factory();
    AbtsractBFactory f2 = new B2Factory();

    A1 a1 = new A1(f1, f2);

    a1.b1.test1();
    a1.b2.test1();
  }

  private IntB b1;
  private IntB b2;

  public A1(AbtsractBFactory b1Factory, AbtsractBFactory b2Factory) {
    this.b1 = b1Factory.createIntB();
    this.b2 = b2Factory.createIntB();
  }
}
