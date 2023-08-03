package reflection_security_manager;

import java.lang.reflect.Constructor;

public class SecurityManagerExample {
  public static void main(String[] args) {

    // Instanziierung ist ohne Reflection ohne Probleme Möglich.
    Safe s1 = new Safe();
    s1.access(42);

    Constructor<?> c = s1.getClass().getDeclaredConstructors()[0];

    // Instanziierung über reflection wird durch den SecurityManager verboten.
    try {
      Object o = c.newInstance();
      // Safe s = (Safe) o;
      // s.access(42);

    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
