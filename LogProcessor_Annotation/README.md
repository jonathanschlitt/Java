## Kompilieren in mehreren Runden

Creating a folder **"META-INF"** inside the root directory of the java files.

Inside this folder we have to create a **"services"** subfolder with a file named **"javax.annotation.processing.Processor"**.

After that we have to put the name of our Annotation Processor inside the file, so that the compiler can find the class to run.

**Compile Annotation and Annotation processor without proc with annotation**

```bash
javac Log*.java -proc:none
```

**Compile the Proc with the annotation to see if Processor is triggered**

```bash
javac Proc.java
```
