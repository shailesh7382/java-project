## Project Setup

### Java Version

The project is compiled with Java 11.

Modify the `pom.xml` file to set the `maven.compiler.source` and `maven.compiler.target` properties to 11.

```xml
<properties>
    <maven.compiler.source>11</maven.compiler.source>
    <maven.compiler.target>11</maven.compiler.target>
</properties>
```

### Maven Version

Ensure Maven runs with Java 21 by setting the JAVA_HOME environment variable to point to your Java 21 installation.

```sh
export JAVA_HOME=/path/to/java21
```

### Running the JAR

The resulting JAR file can be run using JRE 11:

```sh
java -jar target/demo-1.0-SNAPSHOT.jar
```

This ensures that your project is compiled with Java 11, Maven runs with Java 21, and the JAR can be executed with JRE 11.


You should not get a major-minor version exception if you follow the setup correctly. The major-minor version exception occurs when you try to run a class file compiled with a newer version of Java on an older Java runtime.

project built with JDK 11 can run on JRE 21. Java maintains backward compatibility, so code compiled with an older version of the JDK (like JDK 11) should run without issues on a newer JRE (like JRE 21).

it is advisable to first run your existing builds (compiled with JDK 11) on JRE 21 to ensure compatibility and identify any potential issues. This step helps verify that your application runs correctly on the newer runtime environment before making any changes to the build process itself.

multimodule-code-coverage/
├── pom.xml
├── module1/
│   ├── pom.xml
│   ├── src/
│   │   ├── main/
│   │   │   └── java/
│   │   │       └── com/
│   │   │           └── example/
│   │   │               └── module1/
│   │   │                   └── Main.java
│   │   └── test/
│   │       └── java/
│   │           └── com/
│   │               └── example/
│   │                   └── module1/
│   │                       └── MainTest.java
├── module2/
│   ├── pom.xml
│   ├── src/
│   │   ├── main/
│   │   │   └── java/
│   │   │       └── com/
│   │   │           └── example/
│   │   │               └── module2/
│   │   │                   └── Main.java
│   │   └── test/
│   │       └── java/
│   │           └── com/
│   │               └── example/
│   │                   └── module2/
│   │                       └── MainTest.java
├── module3/
│   ├── pom.xml
│   ├── src/
│   │   ├── main/
│   │   │   └── java/
│   │   │       └── com/
│   │   │           └── example/
│   │   │               └── module3/
│   │   │                   └── Main.java
│   │   └── test/
│   │       └── java/
│   │           └── com/
│   │               └── example/
│   │                   └── module3/
│   │                       └── MainTest.java


# Paths to JaCoCo reports using wildcard pattern
sonar.coverage.jacoco.xmlReportPaths=**/target/site/jacoco/jacoco.xml


+-------------------+       +-------------------+       +-------------------+
|    Main (main)    |<------|  Module1 (module1)|<------|  Module2 (module2)|
|-------------------|       |-------------------|       |-------------------|
| - mainMethod()    |       | - module1Method() |       | - module2Method() |
+-------------------+       +-------------------+       +-------------------+
^                           ^                           ^
|                           |                           |
|                           |                           |
|                           |                           |
+-------------------+       +-------------------+       +-------------------+
|Module3 (module3)  |       |Module1A (module1-a)|       |Module1B (module1-b)|
|-------------------|       |-------------------|       |-------------------|
| - module3Method() |       | - module1AMethod()|       | - module1BMethod()|
+-------------------+       +-------------------+       +-------------------+





[INFO] --- jar:3.4.1:jar (default-jar) @ testaggregator ---
[INFO] Building jar: /Users/shailesh/codebase/java-project/multimodule-code-coverage/testaggregator/target/testaggregator-1.0-SNAPSHOT.jar
[INFO]
[INFO] --- jacoco:0.8.8:report-aggregate (report-aggregate) @ testaggregator ---
[INFO] Loading execution data file /Users/shailesh/codebase/java-project/multimodule-code-coverage/module1/modeul1-b/target/jacoco.exec
[INFO] Loading execution data file /Users/shailesh/codebase/java-project/multimodule-code-coverage/module1/module1-c/target/jacoco.exec
[INFO] Loading execution data file /Users/shailesh/codebase/java-project/multimodule-code-coverage/module1/module1-a/target/jacoco.exec
[INFO] Loading execution data file /Users/shailesh/codebase/java-project/multimodule-code-coverage/module3/target/jacoco.exec
[INFO] Loading execution data file /Users/shailesh/codebase/java-project/multimodule-code-coverage/module2/target/jacoco.exec
[INFO] Loading execution data file /Users/shailesh/codebase/java-project/multimodule-code-coverage/main/target/jacoco.exec
[INFO] Analyzed bundle 'modeul1-b' with 1 classes
[INFO] Analyzed bundle 'module1-c' with 1 classes
[INFO] Analyzed bundle 'module1-a' with 1 classes
[INFO] Analyzed bundle 'module3' with 1 classes
[INFO] Analyzed bundle 'module2' with 1 classes
[INFO] Analyzed bundle 'main' with 1 classes
