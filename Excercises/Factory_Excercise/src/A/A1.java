package A;

import B.BFactory;

public class A1 {

  public static void main(String[] args) {
    IntBFactory factory = new BFactory();

    A1 a1 = new A1(factory);

    a1.b1.test1();
    a1.b2.test1();
  }

  private IntB b1;
  private IntB b2;

  public A1(IntBFactory factory) {
    this.b1 = factory.createB1();
    this.b2 = factory.createB2();
  }

}

// package A;

// import B.B; // import statement beschreibt abhängigkeit zu Klassen aus Paket
// B

// public class A {

// public B b = new B();

// public static void main(String[] args) {
// A a = new A();

// a.b.test1();
// }

// public void test1() {
// System.out.println("Test from A Object!");
// }

// }
