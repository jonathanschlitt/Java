package B;

import A.AbtsractBFactory;
import A.IntB;

public class B1Factory implements AbtsractBFactory {
  @Override
  public IntB createIntB() {
    return new B1();
  }
}
