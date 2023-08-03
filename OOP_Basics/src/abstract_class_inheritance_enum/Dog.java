package abstract_class_inheritance_enum;

public class Dog extends Animal {

  String favouriteToy;

  public Dog(String kind, int age, String name, AnimalSize size, String favouriteToy) {
    super(kind, age, name, size);
    this.favouriteToy = favouriteToy;
  }

  @Override
  public void printInfos() {
    super.printInfos();
    System.out.println("Favourite toy: " + favouriteToy);
  }

  public void makeNoise() {
    System.out.println("Woof!");
  }
}
