package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
  public static void main(String[] args) {
    IntegerPrinter printer = new IntegerPrinter(1);
    printer.print();

    // <String> gibt den Typ an, welchen T haben soll.
    // Funktioniert nicht mit <int>, d.h. immer "Wrapper" von primitiven Datentypen
    // verwenden.
    Printer<String> genericPrinter = new Printer<>("Test");
    genericPrinter.print();

    Printer<Double> doublePrinter = new Printer<Double>(1.5);
    doublePrinter.print();

    // ArrayList nutzt immer die Angabe eines Typs, welcher T zugewiesen wird.
    ArrayList<Object> listOfUnknownType = new ArrayList<>();

    listOfUnknownType.add(new Integer(0));

    // Generische Methode verwenden
    shout("Jonathan", "23");
    shout(42, "Answer to everything");

    ArrayList<Integer> intList = new ArrayList<Integer>();

    intList.add(3);

    printList(intList);

  }

  // generische Methoden
  private static <T, V> T shout(T input, V otherThing) {
    System.out.println(input + ", " + otherThing + "!!!!!!");
    return input;
  }

  // wildcards
  // ? beschreibt einen unbestimmten Typ
  // Wird als Typ Parameter verwendet, wenn der Typ vorher nicht bekannt ist.

  // Gebundene Wildcard ist auch möglich.
  // Dadurch wird der unbestimmte Typ auf Subklassen eines Typs eingeschränkt.
  // ==> List<? extends Animalr> myList erlaubt nur Subklassen von Animal.
  private static void printList(List<?> myList) {
    System.out.println(myList);
  }

}
