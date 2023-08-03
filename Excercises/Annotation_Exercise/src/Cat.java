@IsImportant
public class Cat {
  public int age;
  public String name;

  public Cat(int age, String name) {
    this.age = age;
    this.name = name;
  }

  @RunImmediatelyNTimes(times = 3)
  public void meow() {
    System.out.println("Meow.");
  }

  @RunImmediatelyNTimes
  public void munch() {
    System.out.println("Munch.");
  }
}
