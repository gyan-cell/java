// The scope of variables is the part of the program where the variable is
// accessible. Like C/C++, in Java, all identifiers are lexically (or
// statically) scoped, i.e., scope of a variable can be determined at compile
// time and independent of the function call stack. In this article, we will
// learn about Java Scope Variables.
//
// Java Scope of Variables

// Java Scope Rules can be covered under the following categories.

// Instance Variables
// Static Variables
// Local Variables
// Parameter Scope
// Block Scope

// Now we will discuss all these Scopes and variables according to them.
//
// 1. Instance Variables – Class Level Scope

// These variables must be declared inside a class (outside any function). They
// can be directly accessed anywhere in class. Let’s take a look at an example:
// class A { public static void main(String[] args) { int a = 10;
// System.out.println(a); } }
// We can declare class variables anywhere in the class, but outside methods.
// Access specified of member variables doesn’t affect scope of them within a
// class.
// Member variables can be accessed outside a class.
//
//
// 2. Static Variables – Class Level Scope
//
// These variables must be declared inside a class (outside any function). They
// can be directly accessed anywhere in class. Let’s take a look at an example:
// class A { public static void main(String[] args) { int a = 10;
// System.out.println(a); } }
// We can declare class variables anywhere in the class, but outside methods.
// Access specified of member variables doesn’t affect scope of them within a
// class.
// Member variables can be accessed outside a class.
//
//
// 3. Local Variables – Method Level Scope
//
// These variables must be declared inside a method. They can be directly
// accessed anywhere in the method. Let’s take a look at an example:
// class A { public static void main(String[] args) { int a = 10;
// System.out.println(a); } }
// We can declare class variables anywhere in the class, but outside methods.
// Access specified of member variables doesn’t affect scope of them within a
// class.
// Member variables can be accessed outside a class.
//

class variablesJavaScope {

  // Declared Instance Variable
  public String geek;
  public int i;
  public Integer I;

  public static String bestChessPlayer = "Mikhail tal"; // Thus the static variable has been declared

  public static void main(String[] args) {
    int temp = 10; // The local variable has been declared
    int x = 10;

    System.out.println("local Variable is  : " + temp);

    String message = "Hello, world!";

    System.out.println("x = " + x);
    System.out.println("message = " + message);

    if (x > 5) {
      // result is a
      // local variable
      String result = "x is greater than 5";
      System.out.println(result);
    }

    // Uncommenting the line below will result in a
    // compile-time error System.out.println(result);
    for (int i = 0; i < 3; i++) {
      String loopMessage = "Iteration "
          + i; // loopMessage is a local variable
      System.out.println(loopMessage);
    }

    // Uncommenting the line below will result in a
    // compile-time error
    // System.out.println(loopMessage);
  }
}
