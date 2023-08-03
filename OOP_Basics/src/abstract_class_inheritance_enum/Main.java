package abstract_class_inheritance_enum;

public class Main {
  public static void main(String[] args) throws Exception {
    Dog dog = new Dog("Doberman", 5, "Rex", AnimalSize.MEDIUM, "ball");

    dog.printInfos();
    dog.makeNoise();

    Cat cat = new Cat("Persian", 3, "Mittens", AnimalSize.SMALL, "tuna");

    cat.printInfos();
    cat.makeNoise();

    Lion lion = new Lion("African", 7, "Simba", AnimalSize.LARGE, "Savanna");

    lion.printInfos();
    lion.makeNoise();
  }
}
