package Reflection_Instantiation;

import java.lang.annotation.Target;

import java.lang.annotation.*;

@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
  int value() default 0;
}
