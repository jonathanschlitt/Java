package Reflection_Instantiation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
  public static void main(String[] args) {
    try {
      Constructor<?>[] cons = Cat.class.getDeclaredConstructors();
      Constructor<?> con = cons[0];
      Cat cat1 = (Cat) con.newInstance();

      if (cat1.getClass().isAnnotationPresent(MyAnnotation.class)) {
        cat1.meow();
      } else {
        System.out.println("Annotation not present!");
      }

      Method[] methods = Cat.class.getDeclaredMethods();

      for (Method m : methods) {
        if (m.isAnnotationPresent(MyAnnotation.class)) {
          MyAnnotation anno = m.getAnnotation(MyAnnotation.class);
          int value = anno.value();
          // now run Methoded the number of times present in value
          for (int i = 0; i < value; i++) {
            try {
              m.invoke(cat1);
            } catch (InvocationTargetException e) {
              e.printStackTrace();
            }
          }
        }
      }

    } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
      e.printStackTrace();
    }
    @SuppressWarnings({ "unused" })
    int x = 0;
  }
}
