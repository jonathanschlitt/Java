package C;

import D.D1Factory;
import D.D2Factory;

public class C1 {

  public static void main(String[] args) {
    IntDFactory d1Factory = new D1Factory();
    IntDFactory d2Factory = new D2Factory();

    C1 myC1 = new C1(d1Factory, d2Factory);

    C1.whoAmI();

    myC1.d1.test1();
    myC1.d2.test1();
  }

  IntD d1 = null;
  IntD d2 = null;

  public C1(IntDFactory d1Factory, IntDFactory d2Factory) {
    this.d1 = d1Factory.createD();
    this.d2 = d2Factory.createD();
  }

  public static void whoAmI() {
    System.out.println("I am C1 Class and I'm using abstract factory pattern to create instances of D1 and D2.");
  }
}
