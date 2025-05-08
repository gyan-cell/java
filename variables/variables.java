import java.io.*;
// there are three types of variables 
// 1. local variable  : created at the time of declaration and destroyed after time of execution 
// 2. instance variables : Instance variables is created in  a class outside of any method constructor or block
// 3. static variable : Static variables are also known as class variables. 

// These variables are declared similarly to instance variables. The difference is that static variables are declared using the static keyword within a class 
// outside of any method, constructor, or block.
// Unlike instance variables, we can only have one copy of a static variable per class, irrespective of how many objects we create.

class Variables {
  public static void main(String[] args) {
    int a = 10;
    System.out.println(a);
    System.out.println(karapov.namekarapov);
    // Wont work because it is a local variable
    // if (karapov.a) {
    // System.out.println(karapov.a);
    // } else {
    // System.out.println("false");
    // }
  }
}

class karapov {
  public static String namekarapov = "Anatoly"; // public static field specified
                                                // in the class

  public static void main(String[] args) {
    System.out.println(karapov.namekarapov);
    int a = 10;
    if (a == 10) {
      System.out.println(a);
    } else {
      System.out.println("false");
    }
  }

}
