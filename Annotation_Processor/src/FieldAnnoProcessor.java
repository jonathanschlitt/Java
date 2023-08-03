import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

import javax.annotation.processing.*;
import javax.lang.model.element.*;
import javax.tools.*;
import javax.lang.model.SourceVersion;

@SupportedAnnotationTypes("FieldAnno")
@SupportedSourceVersion(SourceVersion.RELEASE_11)
public class FieldAnnoProcessor extends AbstractProcessor {

  @Override
  public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
    for (TypeElement annotation : annotations) {
      for (Element element : roundEnv.getElementsAnnotatedWith(annotation)) {

        // some debug output
        processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, "found @Log at " + element);
        System.out.println("Class name ==> " + element.getEnclosingElement().getSimpleName());
        System.out.println("Annotation name ==> " + element.getSimpleName());

        String className = element.getEnclosingElement().getSimpleName().toString();

        // get the annotation value
        FieldAnno fieldAnno = element.getAnnotation(FieldAnno.class);
        int annotationValue = fieldAnno.value();
        System.out.println("Annotation value ==> " + annotationValue);

        JavaFileObject builderFile = null;
        try {
          builderFile = processingEnv.getFiler().createSourceFile(className + "Constructor");
        } catch (IOException e1) {
          e1.printStackTrace();
        }

        // write the source code
        try (PrintWriter out = new PrintWriter(builderFile.openWriter())) {
          out.println();
          out.println("public class " + className + "Constructor extends " + className + " {");
          out.println("  public " + className + "Constructor() {");
          out.println("    super();");
          // out.println(" " + className + " " + className.toLowerCase() + " = new " +
          // className + "();");
          out.println("    " + element.getSimpleName() + " = " + annotationValue + ";");
          out.println("  }");
          out.println("}");

        } catch (Exception e) {
          System.out.println(e.getMessage());
        }
      }
    }
    return true;
  }

}
