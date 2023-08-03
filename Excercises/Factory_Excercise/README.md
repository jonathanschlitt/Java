### Aufgabe:

1. (Pakete A, B) - Umkehrung der Abhängigkeiten mit Hilfe des "Factory Pattern".

2. (Pakete C, D) - Umkehrung der Abhängigkeiten unter Verwendung des "Abstract Factory Pattern".

**Inhalt von Klasse A innerhalb von Paket A.**

```java
package A;

import B.B; // import statement beschreibt abhängigkeit zu Klassen aus Paket B

public class A {

  public B b = new B();

  public static void main(String[] args) {
    A a = new A();

    a.b.test1();
  }

  public void test1() {
    System.out.println("Test from A Object!");
  }

}
```

**Inhalt von Klasse B innerhalb von Paket B.**

```java
package B;

public class B {
  public void test1() {
    System.out.println("Test from B Object!");
  }
}

```
