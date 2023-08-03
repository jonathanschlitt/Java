import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class A {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        B b1 = new B();

        Constructor bConstructor = b1.getClass().getConstructors()[0];

        B instance = (B) bConstructor.newInstance(null);
        System.out.println("Calling f1 over reflection instance.");
        instance.f1();

        for (Method m : b1.getClass().getDeclaredMethods()) {
            System.out.println(m.getName());

            if (m.getName().equals("f1")) {
                try {
                    m.invoke(b1, args);
                } catch (Exception e) {
                    System.out.println(e);
                }

                System.out.println(((MyAnnotation) m.getAnnotations()[0]).value());

                System.out.println(m.getAnnotation(MyAnnotation.class).value());
            }

            if (m.getName().equals("f2")) {
                m.setAccessible(true);
                m.invoke(b1, args);
                System.out.println(Modifier.toString(m.getModifiers()));

            }
        }
    }
}
