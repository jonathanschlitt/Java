import java.lang.reflect.Method;

public class CreateAnnotations {
    public static void main(String[] args) {

        // Instantiating Objects of Cat and Dog
        Cat myCat = new Cat(4, "Habibi");
        Dog myDog = new Dog(8, "Doggo");

        checkForImportant(myCat);
        checkForImportant(myDog);

        System.out.println();

        runNTimes(myCat);
        runNTimes(myDog);
    }

    // checking whether Instances are important or not
    public static void checkForImportant(Object o) {
        Object catOrDog = null;
        if (o instanceof Cat)
            catOrDog = (Cat) o;
        if (o instanceof Dog)
            catOrDog = (Dog) o;

        if (catOrDog.getClass().isAnnotationPresent(IsImportant.class)) {
            System.out.println("Class " + catOrDog.getClass().getName() + " is important :)");
        } else {
            System.out.println("Class " + catOrDog.getClass().getName() + " is not important :(");
        }
    }

    // checking for methods annotated with "RunImmediatelyNTimes"
    public static void runNTimes(Object o) {
        Object catOrDog = null;
        if (o instanceof Cat)
            catOrDog = (Cat) o;
        if (o instanceof Dog)
            catOrDog = (Dog) o;

        System.out.println(catOrDog instanceof Cat);

        Method[] methods = catOrDog.getClass().getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(RunImmediatelyNTimes.class)) {
                int times = method.getAnnotationsByType(RunImmediatelyNTimes.class)[0].times();

                System.out.println("Now trying to run method " + times + " times...");

                for (int i = 0; i < times; i++) {
                    try {
                        method.invoke(catOrDog);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } else {
                System.out.println("Class " + catOrDog.getClass().getName() + " has not annatation named "
                        + RunImmediatelyNTimes.class.getName() + "!");
            }
        }

    }

}
