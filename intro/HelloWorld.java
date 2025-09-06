public class HelloWorld { // There should be a public class with the name of the file so that it can be
                          // recognised
  public static void main(String[] args) {

    /*
     * This is a multi-line comment
     * It can span across multiple lines
     */
    int x = 10; // Variable declaration
                //

    if (args.length == 0) {
      System.out.println("no args were specified ");
    } else {
      for (int i = 0; i < args.length; i++) {
        System.out.println(args[i]);
      }
    }

    /**
     * This is a documentation comment (Javadoc)
     * It is used to generate documentation for methods, classes, etc.
     */
    System.out.println("Value of x: " + x);

  }
}

// starts a single-line comment. The comments does not executed by Java.
// public class HelloWorld defines a class named HelloWorld. In Java, every
// program must be inside a class.
// public static void main(String[] args) is the entry point of any Java
// application. It tells the JVM where to start executing the program.
// System.out.println("Hello, World!"); prints the message to the console.
// Write code in a file like HelloWorld.java.
// The Java Compiler "javac" compiles it into bytecode "HelloWorld.class".
// The JVM (Java Virtual Machine) reads the .class file and interprets the
// bytecode.
// JVM converts bytecode to machine readable code i.e. "binary" (001001010) and
// then execute the program.
//
//
// Curly Braces and Indentation in Java

// In Java, curly braces {} are used to define blocks of code. For example, the
// body of a class or method is enclosed within curly braces.
// Naming Conventions in Java
// Java uses standard naming rules that make the code easier and improves the
// readability.
// In Java, the class names start with a capital letter for example, HelloWorld.
// Method and variable names start with a lowercase letter and use camelCase
// like printMessage.
// And the constants are written in all uppercase letters with underscores like
// MAX_SIZE.
