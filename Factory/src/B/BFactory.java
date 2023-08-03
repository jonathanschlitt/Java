package B;

import A.IntB;
import A.IntBFactory;

public class BFactory implements IntBFactory {
  public IntB createB1() {
    return new B1();
  }

  public IntB createB2() {
    return new B2();
  }
}
