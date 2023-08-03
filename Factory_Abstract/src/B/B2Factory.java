package B;

import A.AbtsractBFactory;
import A.IntB;

public class B2Factory implements AbtsractBFactory {
  @Override
  public IntB createIntB() {
    return new B2();
  }
}
