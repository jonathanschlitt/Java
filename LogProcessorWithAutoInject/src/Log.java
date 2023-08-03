import java.lang.annotation.*;

// @Target({ ElementType.METHOD })
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface Log {
}
