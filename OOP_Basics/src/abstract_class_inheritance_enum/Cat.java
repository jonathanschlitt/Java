package abstract_class_inheritance_enum;

public class Cat extends Animal {
  String favouriteFood;

  public Cat(String kind, int age, String name, AnimalSize size, String favouriteFood) {
    super(kind, age, name, size);
    this.favouriteFood = favouriteFood;
  }

  @Override
  public void printInfos() {
    super.printInfos();
    System.out.println("Favourite food: " + favouriteFood);
  }

  public void makeNoise() {
    System.out.println("Meow!");
  }

}
