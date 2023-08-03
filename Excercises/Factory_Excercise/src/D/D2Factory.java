package D;

import C.IntD;
import C.IntDFactory;

public class D2Factory implements IntDFactory {
  public IntD createD() {
    return new D2();
  }
}
