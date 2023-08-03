package generics;

// Einschränkung des generischen Typs ist auch möglich.

// public class Printer<T extends Animal> 
// => erlaubt nur alle Typen, die von Animal abgeleitet wurden.
// Heißt gebundener Generischer Typ

// Auch mit Interfaces möglich
// public class Printer<T extends Serializeable> 

// Abgeleitete Klassen von Superklassen und Interfaces
// public class Printer<T extends Animal & Serializeable> 

// erlaubt max eine Klasse und bel. viele Interfaces

public class Printer<T> {
  T thingToPrint;

  public Printer(T thingToPrint) {
    this.thingToPrint = thingToPrint;
  }

  public void print() {
    System.out.println(this.thingToPrint);
  }
}
