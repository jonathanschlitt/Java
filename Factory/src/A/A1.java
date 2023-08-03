package A;

import B.BFactory;

public class A1 {
  public static void main(String[] args) {
    final BFactory factory = new BFactory();

    final A1 a1 = new A1(factory);

    a1.b1.test1();
    a1.b2.test1();
  }

  public IntB b1;
  public IntB b2;

  public A1(BFactory factory) {
    this.b1 = factory.createB1();
    this.b2 = factory.createB2();
  }
}
