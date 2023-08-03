package AbstractFactory.A;

import AbstractFactory.B.B1Factory;

public class A1 {
  public static void main(String[] args) {
    IntBFactory f1 = new B1Factory();
    A1 a1 = new A1(f1);

    a1.b1.test();
  }

  IntB b1;

  public A1(IntBFactory f1) {
    this.b1 = f1.createB();
  }
}
