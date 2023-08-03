package abstract_class_inheritance_enum;

public class Lion extends Animal {
  String home = "Savanna";

  public Lion(String kind, int age, String name, AnimalSize size, String home) {
    super(kind, age, name, size);
    this.home = home;
  }

  @Override
  public void printInfos() {
    super.printInfos();
    System.out.println("Home: " + home);
  }

  public void makeNoise() {
    System.out.println("Roar!");
  }

}
