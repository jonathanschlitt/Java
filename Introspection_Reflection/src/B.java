public class B {

  @MyAnnotation("Test 1")
  public void f1() {
    System.out.println("Hello from f1");
  }

  @MyAnnotation("Test 2")
  private void f2() {
    System.out.println("Hello from f2");
  }
}
