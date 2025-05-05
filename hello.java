/**
 * hello
 */
// Java is different in that it does not compile the code into machine language
// code.
// Compilation creates bytecode out of the source code. Source code is written
// and stored in files with the extension of .java,
// and after compilation a file with a ".class" extension is created which
// contains
// the bytecode instructions. Bytecode generally looks something like
// hello.class file

public class hello {
  public static void main(String[] args) {
    System.out.println("Helllo World");
  }
}

// Java File Naming Conventions
//
// When writing a Java program, we should follow the below rules:
// The file name must match with the the Public class name.
// Java is case sensitive, so Geeks.java is not equal to geeks.java.
// If a file has no "public" class, the file name can be anything but it should
// be matched with the primary class name.

// Understandig how it works

// Every Java program must have at least one class. This line uses the keyword
// class to declare that a new class is being defined.

// 2. HelloWorld

// It is an identifier that is the name of the class. The entire class
// definition, including all of its members, will be between the opening curly
// brace ” { ” and the closing curly brace ” } “.

// main Method

// In the Java programming language, every application must contain a main
// method. The main function(method) is the entry point of your Java
// application, and it’s mandatory in a Java program.
// public static void main(String[] args)
//
// Explanation of the above syntax:

// public: So that JVM can execute the method from anywhere. If we declare
// something as public it simply means it is accessible from anywhere.
// static: The main method is to be called without creating an object. The
// modifiers are public and static can be written in either order.
// void: The main method doesn’t return any value.
// main(): Name configured in the JVM. The main method must be inside the class
// definition. The compiler executes the codes starting always from the main
// function.
// String[]: The main method accepts a single argument, i.e., an array of
// elements of type String.
//
//
