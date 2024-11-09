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