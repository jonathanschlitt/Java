package ellipsis_varargs;

// @SuppressWarnings("all")
public class Ellipsis {
  public static <T> T[] asArray(T... ts) {
    return ts;
  }

  public static <T> T[] arrayOfTwo(T a, T b) {
    return asArray(a, b);
  }

  public static void main(String[] args) {

    // Der Typ String[] ist hier bekannt
    String[] starr = asArray("Hello", "World");

    System.out.println(starr);

    // Erst hier wird der Typ String[] erkannt
    String[] starr2 = arrayOfTwo("Hello", "Problem");

    System.out.println(starr2);

  }
}
