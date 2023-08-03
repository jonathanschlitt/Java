import java.io.IOException;
import java.io.Writer;
import java.util.Set;
import javax.annotation.processing.*;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.MirroredTypeException;
import javax.tools.FileObject;
import javax.tools.StandardLocation;
import javax.tools.Diagnostic.Kind;

@SupportedAnnotationTypes("AutoInject")
public class AutoInjectProcessor extends AbstractProcessor {

  @Override
  public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
    try {
      annotations.forEach(annotation -> {
        roundEnv.getElementsAnnotatedWith(annotation).forEach(element -> {

          processingEnv.getMessager().printMessage(Kind.NOTE, "Log found at " + element);

          // Retrieve the value of 'toInjectFor' from the AutoInject annotation
          AutoInject autoInject = element.getAnnotation(AutoInject.class);

          // Try to access the class object and handle the MirroredTypeException
          String processorName = null;
          try {
            Class<?> toInjectForClass = autoInject.toInjectFor();
            processorName = toInjectForClass.getName();
          } catch (MirroredTypeException mte) {
            processorName = mte.getTypeMirror().toString();
          }

          // Get the file object for the Service-Loader file
          try {
            FileObject fileObject = processingEnv.getFiler().createResource(StandardLocation.SOURCE_OUTPUT,
                "", "META-INF/services/javax.annotation.processing.Processor", element);

            // Open a writer to write the processor name to the file
            Writer writer = fileObject.openWriter();
            writer.write(processorName);
            writer.close();
          } catch (IOException e) {
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
