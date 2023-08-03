package AbstractFactory.B;

import AbstractFactory.A.IntB;

public class B1 implements IntB {
  @Override
  public void test() {
    System.out.println("Test from B1 instance!");
  }
}
