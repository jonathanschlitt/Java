package AbstractFactory.B;

import AbstractFactory.A.IntB;
import AbstractFactory.A.IntBFactory;

public class B1Factory implements IntBFactory {
  @Override
  public IntB createB() {
    return new B1();
  }
}
