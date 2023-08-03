#### Aufgabe 1

1. Eine Klasse namens Cat erstellen, welche die Felder "age" und "name" und zudem zwei methoden "meow" und "munch" hat. Die methoden sind vom Typ void mit einer entsprechenden Konsolenausgabe. Bei der Instanziierung werden im Konstruktoraufruf "age" und "name" übergeben und den Feldern zugewiesen.

2. Jetzt soll eine weitere Klasse Dog erstellt werden, die ebenfalls die Felder "age" und "name" enthält. Die Klasse muss keine Methoden enthalten. Bei der Instanziierung werden im Konstruktoraufruf "age" und "name" übergeben und den Feldern zugewiesen.

3. In diesem Schritt soll eine eigene Annotation namens "isImportant" implementiert werden, mit der die Klasse "Cat" annotiert werden soll.

4. Es sollen nun jweweils eine Instanz von Cat und Dog in einer Klasse "CreateAnnotations" instanziiert werden.

5. Mit Hilfe von Introspection und Reflection soll nun in einer statischen Methode "checkForImportant" innnerhalb der Klasse "CreateAnnotations" geprüft werden, ob die Instanzen von Cat und Dog mit "isImportant" annotiert sind oder nicht. Wenn ja soll eine entsprechende Ausgabe erfolgen. Die Methode nimmt Eingaben vom Typ "Cat" oder "Dog entgegen.

#### Aufgabe 2

Unter der Verwendung der bisherigen Implementierungen soll nun eine weitere Annotation hinzugefügt werden.

1. Erstellen einer Annotation namens "RunImmediatelyNTimes" erstellt werden, welche ein Attribut "times" hat, welches den Standardwert 1 hat. Mit der Annotation sollen Methoden annotiert werden können.

2. Jetzt sollen die beiden vorher implementierten Methoden in der Klasse "Cat" mit der neuen Annotation versehen werden.

3. In der Klasse "CreateAnnotations" muss nun eine statische Methode namens "runNTimes" implementiert werden, die die Methoden der Instanzen von "Cat" und "Dog" auf die Existenz der Annotation "RunImmediatelyNTimes" prüft. Wenn eine entsprechende Methode gefunden wurde, soll der Wert "times" der Annotation ausgelesen werden und dann die Methode anhand der Anzahl "times" ausgeführt werden. (Der Umgang mit den Typen der Instancen muss wie bei der Methode "checkForImportant" berücksichtigt werden.)
