package abstract_class_inheritance_enum;

public abstract class Animal {
    String kind;
    int age;
    String name;
    public AnimalSize size;

    public Animal(String kind, int age, String name, AnimalSize size) {
        this.kind = kind;
        this.age = age;
        this.name = name;
        this.size = size;
    }

    public void printInfos() {
        System.out.println("Kind: " + kind);
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Size: " + size);
    }
}
