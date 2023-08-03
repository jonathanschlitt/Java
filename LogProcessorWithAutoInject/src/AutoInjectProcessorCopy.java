import java.io.Writer;
import java.util.Set;
import javax.annotation.processing.*;
import javax.lang.model.element.TypeElement;
import javax.tools.FileObject;
import javax.tools.StandardLocation;
import javax.tools.Diagnostic.Kind;

@SupportedAnnotationTypes("AutoInject")
public class AutoInjectProcessorCopy extends AbstractProcessor {

  @Override
  public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
    try {
      annotations.forEach(annotation -> {
        roundEnv.getElementsAnnotatedWith(annotation).forEach(element -> {

          processingEnv.getMessager().printMessage(Kind.NOTE, "Log found at " + element);
          // Retrieve the value of 'toInjectFor' from the AutoInject annotation
          AutoInject autoInject = element.getAnnotation(AutoInject.class);
          System.out.println(autoInject);

          String processorName = autoInject.toInjectFor().getName();

          // Get the file object in the
          // META-INF/services/javax.annotation.processing.Processor directory
          try {
            FileObject fileObject = processingEnv.getFiler().createResource(StandardLocation.CLASS_OUTPUT,
                "", "META-INF/services/javax.annotation.processing.Processor");

            // Open a writer to write the processor name to the file
            Writer writer = fileObject.openWriter();
            writer.write(processorName);
            writer.close();
          } catch (Exception e) {
            e.printStackTrace();
          }

        });

      });

    } catch (Exception e) {
      // Handle IOException if necessary
      e.printStackTrace();
    }
    return true;
  }
}
