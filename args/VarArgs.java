import java.io.*;

public class VarArgs {
  public static void Names(String... args) {
    for (String name : args) {
      System.out.println(name);
    }
  }

  public static void main(String[] args) {
    Names("Blue", "red", "maroon", "Daddy", "Daddy", "Daddy", "Daddy", "Daddy");
  }
}

// Variable Arguments (Varargs) in Java is a method that takes a variable number
// of arguments. Variable Arguments in Java simplify the creation of methods
// that need to take a variable number of arguments.
//
//
// Explanation: In the above example, the String... names allows the method to
// accept a variable number of String arguments. Inside the method, the for-each
// loop iterates over the names array and prints each name. The method is called
// twice in main(), with two and three arguments respectively.
// Syntax of Varargs
//
// Internally, the Varargs method is implemented by using the single dimensions
// arrays concept. Hence, in the Varargs method, we can differentiate arguments
// by using Index. A variable-length argument is specified by three periods or
// dots(…).
//
//
