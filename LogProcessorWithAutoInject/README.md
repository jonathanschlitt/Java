### Compilation Round 1

First we need to compile the AutoInject.java and the AutoInjectProcessor.

```
javac AutoInject.java AutoInjectProcessor.java -proc:none
```

### Compilation Round 2

After running the first round, the ServiceLoader has found the configuration file with the AutoInjectProcessor and has extended the compiler with the concrete Processor implementation.

In this round, we compile the Proc with the main method and the annotation AutoInject, and so the compiler has found the AutoInjectProcessor and has processed the AutoInject Annotation at the Proc class.

The Implementation of the Processor has taken the value of the annotation and writes a file into META-INF services to inject the LogProcessor inside the file.

```
javac Proc.java
```

### Compilation Round 3

The compiler now detects the new Logprocessor in the file and starts the last compilation round to inject the new Processor instance and processes the Log Annotation.

Then we see the output, that the log was found: "Note: Log found at Proc"

Attention:
If there were multiple new processor injected, the compilation could take more than 3 round until all new files are compiled.

This could happen also, if any kind of Annotation processor would craete new implementation of Java source files.
