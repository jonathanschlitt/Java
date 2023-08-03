package A;

import B.B; // import statement beschreibt abhängigkeit zu Klassen aus Paket B

public class A {

  public B b = new B();

  public static void main(String[] args) {
    A a = new A();

    a.b.test1();
  }

  public void test1() {
    System.out.println("Test from A Object!");
  }

}
